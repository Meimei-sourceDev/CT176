package Buoi3;
import Buoi2.Diem;

public class SDDoanThang {
    public static void main(String[] args){
        Diem A = new Diem(2,5);
        Diem B = new Diem(20, 35);
        DoanThang line = new DoanThang(A, B);
        line.tinhTien(5, 3);
        line.hienThi();

        DoanThang CD = new DoanThang();
        CD.nhapDoanThang();
        double rad = CD.tinhGoc();
        System.out.println(CD.doDai());
        System.out.println(Math.toDegrees(rad));
    }
}
