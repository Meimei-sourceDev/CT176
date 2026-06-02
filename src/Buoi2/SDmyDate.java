package Buoi2;

import java.util.Scanner;

public class SDmyDate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        myDate dayA = new myDate(2, 6, 2026);
        dayA.hienThi();

        myDate dayB = new myDate();
        dayB.nhap();
        dayB.hienThi();

        myDate dayC = dayB.plusDate();
        dayC.hienThi();
    }
}
