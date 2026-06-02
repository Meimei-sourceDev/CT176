package Buoi2;

import java.util.Scanner;

public class PhanSo {
    private static final Scanner sc = new Scanner(System.in);
    private int tu;
    private int mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        if (mau == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    public void rutGon() {
        if (mau < 0) {
            this.mau = -this.mau;
            this.tu = -this.tu;
        }
        int g = gcd(this.tu, this.mau);
        if (g != 0) {
            this.tu /= g;
            this.mau /= g;
        }
    }

    public void nhap() {
        while (true) {
            System.out.print("Nhap tu: ");
            this.tu = sc.nextInt();
            System.out.print("Nhap mau: ");
            int inputMau = sc.nextInt();
            if (inputMau == 0) {
                System.out.println("Syntax error (Denominator cannot be zero), try again.");
            } else {
                this.mau = inputMau;
                rutGon();
                break;
            }
        }
    }

    public void hienThi() {
        if (this.tu == 0) {
            System.out.println("Phan so: 0");
        } else if (this.mau == 1) {
            System.out.println("Phan so: " + this.tu);
        } else {
            System.out.println("Phan so: " + this.tu + "/" + this.mau);
        }
        System.out.println("Thap phan: " + toDecimal());
    }

    @Override
    public String toString() {
        return this.mau == 1 ? String.valueOf(this.tu) : String.format("%d/%d", this.tu, this.mau);
    }

    public double toDecimal() {
        return (double) this.tu / this.mau;
    }

    public boolean lonHon(PhanSo a) {
        return (long) this.tu * a.mau > (long) a.tu * this.mau;
    }

    public void nghichDao() {
        if (this.tu == 0) {
            throw new ArithmeticException("Cannot invert a fraction with a numerator of zero.");
        }
        int swap = this.tu;
        this.tu = this.mau;
        this.mau = swap;
        rutGon();
    }

    public PhanSo giaTriNghichDao() {
        return new PhanSo(this.mau, this.tu);
    }

    public PhanSo cong(int n) {
        return new PhanSo(this.tu + this.mau * n, this.mau);
    }

    public PhanSo tru(int n) {
        return new PhanSo(this.tu - this.mau * n, this.mau);
    }

    public PhanSo nhan(int n) {
        return new PhanSo(this.tu * n, this.mau);
    }

    public PhanSo chia(int n) {
        if (n == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return new PhanSo(this.tu, this.mau * n);
    }

    public PhanSo cong(PhanSo a) {
        return new PhanSo(this.tu * a.mau + a.tu * this.mau, this.mau * a.mau);
    }

    public PhanSo tru(PhanSo a) {
        return new PhanSo(this.tu * a.mau - a.tu * this.mau, this.mau * a.mau);
    }

    public PhanSo nhan(PhanSo a) {
        return new PhanSo(this.tu * a.tu, this.mau * a.mau);
    }

    public PhanSo chia(PhanSo a) {
        if (a.tu == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return new PhanSo(this.tu * a.mau, this.mau * a.tu);
    }
}