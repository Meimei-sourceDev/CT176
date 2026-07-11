package Buoi3;

import Buoi2.Diem;

public class SDDuongTronHH {
    public static void main(String[] args){
        Diem d1 = new Diem(2, 5);
        DuongTronHH gc1 = new DuongTronHH(d1, 6, "den", "xanh");
        System.out.println(gc1.toString());

        DuongTronHH gc2 = new DuongTronHH();
        gc2.nhap();
        System.out.println(gc2.toString());
        System.out.println(gc2.dienTich());
        System.out.println(gc2.chuVi());

        gc2.layTam().doiDiem(1, 2);

        if(gc1.catNhau(gc2)){
            System.out.println("Cat nhau");
        }else{
            System.out.println("Khong cat nhau");
        }

        if(gc1.equals(gc2)){
            System.out.print("Bang nhau");
        }else{
            System.out.println("Khong bang nhau");
        }
    }
}
