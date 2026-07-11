package Buoi3;

import Buoi2.Diem;

public class SDDuongTron {
	public static void main(String[] args) {
		Diem d1 = new Diem(2, 5);
		DuongTron dt1 = new DuongTron(d1, 6);
		dt1.in();
		
		DuongTron dt2 = new DuongTron();
		dt2.nhap();
		dt2.in();
		System.out.println("Dien tich dt2: " + dt2.dienTich() + " Chu vi dt2: " + dt2.chuVi());
		dt2.layTam().doiDiem(1, 2);
		
		if(dt2.catNhau(dt1)) {
			System.out.println("Co cat nhau");
		} else {
			System.out.println("Khong cat nhau");
		}
	}

}
