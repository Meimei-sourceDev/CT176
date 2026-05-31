package Buoi5.Practice2;

import java.util.ArrayList;
import java.util.Scanner;

public class GDTTe extends GDich{
    private double dgia, tgia;
    private int sluong;
    private char symbol;

    public GDTTe(){
        this.dgia = 0.0;
        this.sluong = 0;
        this.symbol = ' ';
        this.tgia = 0.0;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap don gia: "); this.dgia = sc.nextDouble();
        System.out.print("Nhap so luong: "); this.sluong = sc.nextInt();
        System.out.print("Nhap loai tien te VND (V), USD (U), Euro (E): "); this.symbol = sc.next().charAt(0);
        System.out.print("Nhap ti gia: "); this.tgia = sc.nextDouble();
    }

    public double tinhThanhTien(){
        return this.tgia * this.sluong * this.dgia;
    }

    public char getTTe(){
        return this.symbol;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong giao dich: "); int n = sc.nextInt();

        ArrayList<GDTTe> dsGD = new ArrayList<>();
        for(int i = 0; i < n; i++){
            GDTTe gd = new GDTTe();
            gd.nhap();
            dsGD.add(gd);
        }

        for(GDTTe gd : dsGD){
            gd.in();
        }

        boolean GiaoDichLon = false;
        for(GDTTe gd : dsGD){
            if(gd.tinhThanhTien() >= 100000 && gd.getttai()) {
                System.out.println("Ma giao dich >= 100K: " + gd.getMgd());
                GiaoDichLon = true;
            }
        }
        if(!GiaoDichLon) System.out.println("Khong tim thay giao dich >= 100K");

        System.out.println("------------ Thong ke so tien giao dich theo ngay ------------");
        System.out.println("Nhap ngay thang nam can thong ke ");
        myDate finding = new myDate();
        finding.nhap();

        double VND = 0.0;
        double USD = 0.0;
        double Euro = 0.0;

        for(GDTTe gd : dsGD){
            if(gd.getNgayGiaoDich() != null && gd.getNgayGiaoDich().equals(finding.toString())){
                if(gd.getTTe() == 'V' && gd.getttai()){
                    VND += gd.tinhThanhTien();
                }
                else if(gd.getTTe() == 'U' && gd.getttai()){
                    USD += gd.tinhThanhTien() / gd.tgia;
                }
                else if(gd.getttai() && gd.getTTe() == 'E'){
                    Euro += gd.tinhThanhTien() / gd.tgia;
                }
            }
        }

        System.out.println("Ket qua thong ke trong thoi gian " + finding.toString());
        System.out.println("Tong VND: " + VND);
        System.out.println("Tong USD " + USD);
        System.out.println("Tong Euro " + Euro);

        sc.close();
    }
}
