package Buoi2;

import java.math.BigInteger;
import java.util.Scanner;
public class PhanSo {
    public static Scanner sc = new Scanner(System.in);
    private int tu, mau;
    public PhanSo(){};
    public PhanSo(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public void rutGon(){
        if(this.mau < 0){
            this.tu = -this.tu;
            this.mau = -this.mau;
        }
        BigInteger a = BigInteger.valueOf(this.tu);
        BigInteger b = BigInteger.valueOf(this.mau);
        int gcd = a.gcd(b).intValue();
        this.tu = this.tu/ gcd;
        this.mau = this.mau/ gcd;
    }

    public boolean hopLe(){
        if(this.mau == 0) return false;
        else return true;
    }

    public void nhapPhanSo(){
        while(true){
            System.out.print("Nhap tu so: ");
            this.tu = sc.nextInt();
            System.out.print("Nhap mau so: ");
            this.mau = sc.nextInt();
            if(hopLe()) break;
            else{
                System.out.println("Mau so phai khac 0.");
            }
        }
    }

    public void hienThi(){
        if(!hopLe()) System.out.println("Phan so khong hop le");
        else if(this.tu == 0) System.out.println("0");
        else if(this.mau == 1) System.out.println(this.tu);
        else{
            System.out.println(this.tu + "/" + this.mau);
        }
    }
    public PhanSo giaTriNghichDao(){
        return new PhanSo(this.mau, this.tu);
    }
    public void nghichDao(){
        int swap = this.tu;
        this.tu = this.mau;
        this.mau = swap;
    }

    public PhanSo cong(PhanSo a){
        return new PhanSo(tu * a.mau + mau * a.tu, mau * a.mau);
    }
    public PhanSo tru(PhanSo a){
        return new PhanSo(tu * a.mau - mau * a.tu, mau * a.mau);
    }
    public PhanSo nhan(PhanSo a){
        return new PhanSo(tu * a.tu, mau * a.mau);
    }
    public PhanSo chia(PhanSo a){
        if(a.tu == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return this.nhan(a.giaTriNghichDao());
    }

    public PhanSo cong(int n){
        return new PhanSo(tu + mau * n, mau);
    }
    public PhanSo tru(int n){
        return new PhanSo(tu - mau * n, mau);
    }
    public PhanSo nhan(int n){
        return new PhanSo(tu * n, mau);
    }
    public PhanSo chia(int n){
        if(n == 0) throw new ArithmeticException("Cannot divide by zero");
        return new PhanSo(tu, mau * n);
    }
    public boolean lonHon(PhanSo a){
        return a.mau * tu > a.tu * mau;
    }

}
