package Buoi5.Practice1;
import java.util.Scanner;

public class KhachHang {
    private static final Scanner sc = new Scanner(System.in);
    protected String maKH, HoTen, soDT;
    public KhachHang(){
        this.maKH ="";
        this.HoTen = "";
        this.soDT = "";
    }
    public KhachHang(String maKH, String HoTen, String soDT){
        this.maKH = maKH;
        this.HoTen = HoTen;
        this.soDT = soDT;
    }
    public void nhap(){
        System.out.print("Nhap ma khach hang: "); this.maKH = sc.nextLine();
        System.out.print("Nhap ho va ten: "); this.HoTen = sc.nextLine();
        System.out.print("Nhap SDT: "); this.soDT = sc.nextLine();
    }

    public double getDiscount(){
        return 0.0;
    }

    @Override
    public String toString(){
        return "Customer ID: " + maKH + " | Name: " + HoTen +" | Phone: " + soDT;
    }
}
