package Buoi2;
import java.util.Scanner;

public class SDClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Clock c1 = new Clock (12, 65, 90);
		Clock c2 = new Clock();
		
		c1.in();
		c1.lamTron();
		c1.in();
		
		c2.nhap();
		c2.in();
		c2.lamTron();
		c2.in();
		
		System.out.println("Nhap phut: "); int n = sc.nextInt();
		Clock c3 = c2.congPhut(n);
		c3.in();
		
		sc.close();
	}
}
