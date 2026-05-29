package Buoi3;
import javax.lang.model.element.QualifiedNameable;
import java.util.Scanner;
public class Gach {
    private String ID, Color;
    private int Quantity, Length, Width;
    private long Price;

    public Gach(){
        this.ID = "";
        this.Color = "";
        this.Quantity = 0;
        this.Length = 0;
        this.Width = 0;
        this.Price = 0;
    }

    public Gach(String ID, String Color, int Quantity, int Length, int Width, long Price){
        this.ID = ID;
        this.Color = Color;
        this.Quantity = Quantity;
        this.Length = Length;
        this.Width = Width;
        this.Price = Price;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so so gach: "); this.ID = sc.nextLine();
        System.out.print("Nhap color: "); this.Color = sc.nextLine();
        System.out.print("Nhap so luong: "); this.Quantity = sc.nextInt();
        System.out.print("Nhap chieu dai va chieu rong: ");
        this.Length = sc.nextInt();
        this.Width = sc.nextInt();
        System.out.print("Nhap gia ban: "); this.Price = sc.nextLong();
        sc.nextLine();
    }
    public void hienThi(){
        System.out.println("Ma so: " + ID + " | Mau: " + Color + " | So luong: " + Quantity + " | Kich thuoc: " + Length +"x"+Width + " | Gia ban: $" + Price);
    }
    public float giaBanLe(){
        return (float)(Price / Quantity) * 1.2f;
    }

    public int dienTichMax(){
        return (Length * Width) * Quantity;
    }

    public int soLuongHop(int D, int N){
        return (int) Math.ceil((double) (D * N) / dienTichMax());
    }
    public float chiPhi(){
        return (float) Price * dienTichMax();
    }
    public double chiPhiDienTich() {
        return (double) this.Price / this.dienTichMax();
    }
    public String getID(){
        return this.ID;
    }
    public long getPrice(){
        return this.Price;
    }
}
