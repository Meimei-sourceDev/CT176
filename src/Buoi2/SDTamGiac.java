package Buoi2;
import java.util.Scanner;

public class SDTamGiac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TamGiac tg1 = new TamGiac();
		while(true) {
			tg1.nhap();
			if(tg1.hopLe()) {
				tg1.in();
				break;
			}
			else {
				System.out.println("Ba canh khong tao thanh 1 tam giac!");
			}
		}
	    if(tg1.isDeu()) System.out.println(tg1.toString() + " La tam giac deu");
		else if(tg1.isVuongCan()) System.out.println(tg1.toString() + " La tam giac vuong can");
		else if(tg1.isVuong()) System.out.println(tg1.toString() + " La tam giac vuong");
		else if(tg1.isCan()) System.out.println(tg1.toString() + " La tam giac can");
		else {
			System.out.println(tg1.toString() + " La tam giac thuong");
		}
		
		sc.close();
	}
}
