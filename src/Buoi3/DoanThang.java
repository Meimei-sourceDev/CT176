package Buoi3;
import Buoi2.Diem;

public class DoanThang {
    Diem d1, d2;
    public DoanThang(){
        this.d1 = new Diem();
        this.d2 = new Diem();
    }
    public DoanThang(Diem point1, Diem point2){
        this.d1 = new Diem(point1.giaTriX(), point1.giaTriY());
        this.d2 = new Diem(point2.giaTriX(), point2.giaTriY());
    }
    public DoanThang(int ax, int ay, int bx, int by){
        this.d1 = new Diem(ax, ay);
        this.d2 = new Diem(bx, by);
    }

    public void nhapDoanThang(){
        System.out.println("Nhap diem d1: ");
        this.d1.nhapDiem();
        System.out.println("Nhap diem d2: ");
        this.d2.nhapDiem();
    }
    public void hienThi(){
        this.d1.hienThi();
        this.d2.hienThi();
    }
    public void tinhTien(int dx, int dy){
        d1.doiDiem(dx, dy);
        d2.doiDiem(dx, dy);
    }
    public float doDai(){
        return this.d1.khoangCach(d2);
    }
    public double tinhGoc(){
        int dx = d2.giaTriX() - d1.giaTriX();
        int dy = d2.giaTriY() - d1.giaTriY();
        return Math.atan2(dy, dx);
    }
}
