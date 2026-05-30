package Buoi5.Practice1;
import java.util.Scanner;

public class HoaDon {
    private String maHD, tenHD;
    private myDate ngayLapHD;
    private KhachHang khachHang;
    private double tongTien;

    public HoaDon(){
        this.maHD = "";
        this.tenHD = "";
        this.ngayLapHD = new myDate();
        this.khachHang = null;
        this.tongTien = 0.0;
    }

    public void nhap(KhachHang kh){
        Scanner sc = new Scanner(System.in);
        this.khachHang = kh;
        System.out.print("Nhap ma hoa don: "); this.maHD = sc.nextLine();
        System.out.print("Nhap ten hoa don: "); this.tenHD = sc.nextLine();
        System.out.print("Nhap ngay lap hoa don: ");
        this.ngayLapHD.nhap();

        System.out.print("Nhap tong tien truoc khi giam gia: ");
        this.tongTien = sc.nextDouble();
    }

    public double tinhThanhTien(){
        double discount = khachHang.getDiscount() * this.tongTien;
        return this.tongTien - discount;
    }
    public void hienThiHoaDon(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ma HD: " + maHD + " | Ten HD: "+ tenHD + " | Date: " + ngayLapHD);
        System.out.println("Thong tin khach hang: " + khachHang.toString());
        System.out.println("Tong ban dau: " + tongTien);
        System.out.println("Giam gia: " + khachHang.getDiscount() * 100);
        System.out.println("THANH TIEN: " + tinhThanhTien());
        System.out.println("-----------------------------------------------------------------");
    }
}
