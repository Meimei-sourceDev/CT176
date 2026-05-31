package Buoi5.Practice2;
import java.util.Scanner;

public class GDich {
    private static final Scanner sc = new Scanner(System.in);
    private int mgd;
    private String hten, ngay;
    private boolean tthai;
    private myDate ngayGiaoDich;

    public GDich(){
        this.mgd = 0;
        this.hten = "";
        this.tthai = false;
        this.ngayGiaoDich = new myDate();
    }

    public GDich(GDich khac){
        this.mgd = khac.mgd;
        this.hten = khac.hten;
        this.tthai = khac.tthai;
        this.ngayGiaoDich = khac.ngayGiaoDich;
    }

    public void nhap(){
        System.out.print("Nhap ma giao dich: "); this.mgd = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho va ten: "); this.hten = sc.nextLine();
        System.out.print("Nhap thoi gian giao dich "); this.ngayGiaoDich.nhap();
        System.out.print("Nhap trang thai giao dich: (true/false) "); this.tthai = sc.nextBoolean();
    }

    public void in(){
        System.out.print("Ma giao dich: "+mgd+" | Ho va ten: "+hten+ " | Trang thai giao dich: ");
        if(tthai) System.out.print("Thanh cong");
        else System.out.print("That bai");
        System.out.println(" | Ngay giao dich: " + this.ngayGiaoDich.toString());
        System.out.println();
    }

    public int getMgd(){
        return this.mgd;
    }

    public String getNgayGiaoDich(){
        return this.ngayGiaoDich.toString();
    }

    public boolean getttai(){
        return this.tthai;
    }

    public static void main(String[] args){
        GDich gd1 = new GDich();
        gd1.nhap();
        gd1.in();
        GDich gd2 = new GDich(gd1);
        gd2.in();
    }



}
