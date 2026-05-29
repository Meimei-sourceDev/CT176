package Buoi2;

import java.util.Scanner;

public class SDDiem {
    public static void main(String[] args){
        Diem A = new Diem(3, 4);
        System.out.print("Toa do diem A: ");
        A.hienThi();
        Diem B = new Diem();
        B.nhapDiem();
        System.out.print("Toa do diem B: ");
        B.hienThi();
        Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
        System.out.print("Toa do diem C: ");
        C.hienThi();
        System.out.println("Khoang cach tu B den O: " + B.khoangCach());
        System.out.print("Khoang cach tu A den B: " + A.khoangCach(B));
    }
}
