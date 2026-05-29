package Buoi4;

public class SDDiemMau {
    public static void main(String[] args){
        DiemMau A = new DiemMau(5, 10, "white");
        A.hienThi();
        DiemMau B = new DiemMau();
        B.nhap();
        B.hienThi();
        B.doiDiem(10, 8);
        B.hienThi();
        B.GanMau("Yellow");
        B.hienThi();
    }
}
