package Buoi4;

import Buoi3.SinhVien;
import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
    private static final Scanner sc = new Scanner(System.in);
    private String taikhoan, matkhau, email;
    public SinhVienCNTT(){
        this.taikhoan ="";
        this.matkhau="";
        this.email="";
    }
    public SinhVienCNTT(String taikhoan, String matkhau, String email){
        this.taikhoan = taikhoan;
        this.matkhau= matkhau;
        this.email= email;
    }
    public void nhap(){
        nhapThongTin();
        System.out.print("Nhap ten tai khoan: ");
        this.taikhoan = sc.nextLine();
        System.out.print("Nhap matkhau: ");
        this.matkhau = sc.nextLine();
        System.out.println("Nhap email: ");
        this.email = sc.nextLine();
    }

    public void doiMatKhau(String newPass){
        this.matkhau = newPass;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return super.toString() +
        "\nTai khoan: " + taikhoan +" email: " +email +
        "\nMat khau: " + matkhau;
    }
}
