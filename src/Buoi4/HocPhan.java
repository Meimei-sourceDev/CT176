package Buoi4;
import java.util.Scanner;

public class HocPhan {
	private String msHP;
	private String tenHP;
	private String dvQuanLy;
	private int soTinChi;
	private int soTietLT;
	private int soTietTH;
	
	public HocPhan() {
		this.msHP = "";
		this.tenHP = "";
		this.dvQuanLy = "";
		this.soTinChi = 0;
		this.soTietLT = 0;
		this.soTietTH = 0;
	}
	
	public HocPhan(String msHP, String tenHP, String dvQuanLy, int soTinChi, int soTietLT, int soTietTH) {
		this.msHP = msHP;
		this.tenHP = tenHP;
		this.dvQuanLy = dvQuanLy;
		this.soTinChi = soTinChi;
		this.soTietLT = soTietLT;
		this.soTietTH = soTietTH;
	}
	
	public void copyHocPhan(HocPhan khac) {
		this.msHP = khac.msHP;
		this.tenHP = khac.tenHP;
		this.dvQuanLy = khac.dvQuanLy;
		this.soTinChi = khac.soTinChi;
		this.soTietTH = khac.soTietTH;
		this.soTietLT = khac.soTietLT;
	}
	
	public HocPhan(HocPhan khac) {
		this.msHP = khac.msHP;
		this.tenHP = khac.tenHP;
		this.dvQuanLy = khac.dvQuanLy;
		this.soTinChi = khac.soTinChi;
		this.soTietTH = khac.soTietTH;
		this.soTietLT = khac.soTietLT;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so hoc phan: "); this.msHP = sc.nextLine();
		System.out.print("Nhap ten hoc phan: "); this.tenHP = sc.nextLine();
		System.out.print("Nhap dv quan ly: "); this.dvQuanLy = sc.nextLine();
		System.out.print("Nhap so tin chi: "); this.soTinChi = sc.nextInt();
		System.out.print("Nhap so tiet ly thuyet: "); this.soTietLT = sc.nextInt();
		System.out.print("Nhap so tiet tu hoc: "); this.soTietTH = sc.nextInt();
	}
	
	public void in() {
		System.out.println("Ma so HP: " + msHP +" | Ten HP: " + tenHP + " | dvQL: " + dvQuanLy + " | So tin chi: " + soTinChi + " | So tiet ly thuyet: " + soTietLT + " | So tiet tu hoc: " + soTietTH);
	}
	
	public int hocPhi() {
		return this.soTinChi * 832000;
	}
	
	public String getMSHP() {
		return this.msHP;
	}
	public String getTenHP() {
		return this.tenHP;
	}
	public String getDVQuanLy() {
		return this.dvQuanLy;
	}
	public int getTinChi() {
		return this.soTinChi;
	}
	public int getSoTietLT(){
		return this.soTietLT;
	}
	public int getSoTietTH(){
		return this.soTietTH;
	}
	
}
