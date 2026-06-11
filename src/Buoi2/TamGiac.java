package Buoi2;
import java.util.Scanner;
import java.util.Arrays;

public class TamGiac {
	private double canhA;
	private double canhB;
	private double canhC;
	
	public TamGiac() {
		this.canhA = 1;
		this.canhB = 1;
		this.canhC = 1;
	}
	
	public TamGiac(float a, float b, float c) {
		this.canhA = a;
		this.canhB = b;
		this.canhC = c;
	}
	public TamGiac(TamGiac khac) {
		this.canhA = khac.canhA;
		this.canhB = khac.canhB;
		this.canhC = khac.canhC;
	}
	
	public boolean hopLe() {
		if(canhA <= 0|| canhB <= 0 || canhC <= 0 ) return false;
		else if( ((canhA + canhB) > canhC) && 
		    ((canhA + canhC) > canhB) && 
		    ((canhC + canhB) > canhA) ) return true;
		else return false;
	}
	
	public boolean isDeu() {
		if(
				(canhA == canhB) &&
				(canhB == canhC) &&
				(canhC == canhA)) return true;
		return false;
	}
	
	public boolean isCan() {
		if(
				(canhA == canhB) ||
				(canhB == canhC) ||
				(canhC == canhA)) return true;
		return false;
	}
	
	public boolean isVuong() {
		return (Math.pow(canhA, 2) + Math.pow(canhB, 2) == Math.pow(canhC, 2)) ||
				(Math.pow(canhB, 2) + Math.pow(canhC, 2) == Math.pow(canhA, 2)) ||
				(Math.pow(canhC, 2) + Math.pow(canhA, 2) == Math.pow(canhB, 2));
	}
	
	public boolean isVuongCan() {
		if(this.isVuong() && this.isCan()) {
			return true;
		}
		return false;
	}
	
	public boolean bang(TamGiac a) {
		double[] t1 = {this.canhA, this.canhB, this.canhC};
		double[] t2 = {a.canhA, a.canhB, a.canhC};
		
		Arrays.sort(t1);
		Arrays.sort(t2);
		
		double e = 1e-6;
		return Math.abs(t1[0] - t2[0]) < e &&
				Math.abs(t1[1] - t2[1]) < e &&
				Math.abs(t1[2] - t2[2]) < e;
	}
	
	public double chuVi() {
		return canhA + canhB + canhC;
	}
	
	public double dienTich() {
		double p = this.chuVi() / 2;
		return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap canh A: "); this.canhA = sc.nextDouble();
		System.out.print("Nhap canh B: "); this.canhB = sc.nextDouble();
		System.out.print("Nhap canh C: "); this.canhC = sc.nextDouble();
	}
	
	public void in() {
		System.out.println("Tam giac co canh A = " + canhA + ", canh B = " + canhB + " canh C = " + canhC);
	}
	
	public double getCanhA() {
		return this.canhA;
	}
	public double getCanhB() {
		return this.canhB;
	}
	public double getCanhC() {
		return this.canhC;
	}
	
	@Override public String toString() {
		String str = "Tam giac co canh A = " + canhA + ", canh B = " + canhB + " canh C = " + canhC;
		return str;
	}
}
