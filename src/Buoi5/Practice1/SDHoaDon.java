package Buoi5.Practice1;
import java.util.Scanner;
import java.util.ArrayList;

public class SDHoaDon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoa don: ");
        int n = sc.nextInt(); sc.nextLine();
        double revenue = 0.0;
        ArrayList<HoaDon> hoaDonList = new ArrayList<>();

        for(int i =0; i < n; i++){
            System.out.println("Nhap thong tin hoa don #" + (i + 1) + ": ");
            System.out.println("Loai khach hang, 1. Normal, 2. VIP: ");
            int type = sc.nextInt();
            KhachHang kh;
            if(type == 1){
                kh = new KhachHang();
            }else{
                kh = new KhachHangVIP();
            }
            kh.nhap();
            HoaDon hd = new HoaDon();
            hd.nhap(kh);
            hoaDonList.add(hd);
        }
        System.out.println("\n================ DANH SACH HOA DON ================");
        for(HoaDon hd : hoaDonList){
            hd.hienThiHoaDon();
            revenue += hd.tinhThanhTien();
        }
        System.out.println("TOTAL REVENUE: " + revenue);
        sc.close();
    }
}
