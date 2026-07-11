package Buoi3;
import Buoi2.Diem;

import java.util.Scanner;

public class DuongTron {
	private Diem tam;
	private int bankinh;

	public DuongTron() {
		this.tam = new Diem();
		this.bankinh = 0;
	}
	
	public DuongTron(Diem tam, int bankinh) {
		this.tam = tam;
		this.bankinh = bankinh;
	}
	
	public DuongTron(int x, int y, int bk) {
		this.tam = new Diem(x , y);
		this.bankinh = bk;
	}
	
	public DuongTron(DuongTron khac) { 
		this.tam = new Diem(khac.tam.giaTriX(), khac.tam.giaTriY());
		this.bankinh = khac.bankinh;
	}
	
	public void copyDuongTron(DuongTron khac) { //deep copy;
		this.tam = new Diem(khac.tam.giaTriX(), khac.tam.giaTriY());
		this.bankinh = khac.bankinh;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do tam duong tron ");
		this.tam.nhapDiem();
		System.out.print("Nhap ban kinh: "); this.bankinh = sc.nextInt();
	}
	
	public void in() {
		System.out.println("Duong tron co toa do tam la: ");
		this.tam.hienThi();
		System.out.println();
		System.out.println("Ban kinh: " + bankinh);
	}
	
	public double dienTich() {
		return Math.PI * Math.pow(this.bankinh, 2);
	}
	
	public double chuVi() {
		return 2 * Math.PI * bankinh;
	}
	
	public boolean trongDuongTron (Diem d) {
		double res = Math.pow(d.giaTriX() - tam.giaTriX(), 2) +
				Math.pow(d.giaTriY() - tam.giaTriY(), 2);
		double Rsquare = Math.pow(this.bankinh, 2);
		return res <= Rsquare;
	}
	
	public boolean catNhau(DuongTron dt) {
		double dSquare = Math.pow(dt.tam.giaTriX() - this.tam.giaTriX(), 2) +
				Math.pow(dt.tam.giaTriY() - this.tam.giaTriY(), 2);
		double sumSquare = Math.pow(dt.bankinh + this.bankinh, 2);
		double difSquare = Math.pow(dt.bankinh - this.bankinh, 2);

		return dSquare > difSquare && dSquare < sumSquare;
	}
	
	public Diem layTam() {
		return this.tam;
	}
	public int layBanKinh() {
		return this.bankinh;
	}

	@Override public String toString(){
        return "Duong tron co toa do tam la: x = " + tam.giaTriX() + " y = "+
                tam.giaTriY() + "\nBan kinh: " + bankinh;
	}
}
