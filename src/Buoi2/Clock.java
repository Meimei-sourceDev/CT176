package Buoi2;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;

public class Clock {
	private int gio;
	private int phut;
	private int giay;
	
	public Clock() {
		this.gio = 0;
		this.phut = 0;
		this.giay = 0;
	}
	
	public Clock(int h, int m, int s) {
		this.gio = h;
		this.phut = m;
		this.giay = s;
	}
	
	public Clock(Clock khac) {
		this.gio = khac.gio;
		this.phut = khac.phut;
		this.giay = khac.giay;
	}
	
	public void lamTron() {
		Duration khoangtg = Duration.ofHours(this.gio)
				.plusMinutes(this.phut)
				.plusSeconds(this.giay);
		LocalTime thoigian = LocalTime.MIDNIGHT.plus(khoangtg);
		
		this.gio = thoigian.getHour();
		this.phut = thoigian.getMinute();
		this.giay = thoigian.getSecond();
	}
	
	public Clock congPhut(int n) {
		Clock res = new Clock(this);
		res.lamTron();
		LocalTime current = LocalTime.of(res.gio, res.phut, res.giay);
		LocalTime newTime = current.plusMinutes(n);
		
		res.gio = newTime.getHour();
		res.phut = newTime.getMinute();
		res.giay = newTime.getSecond();
		
		return res;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap theo dinh dang HH:mm:ss");
		System.out.print("Nhap gio: "); this.gio = sc.nextInt();
		System.out.print("Nhap phut: "); this.phut = sc.nextInt();
		System.out.print("Nhap giay: "); this.giay = sc.nextInt();	
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", this.gio, this.phut, this.giay);
	}
	
	public void in() {
		System.out.println(this.toString());
	}
	
	public int giaTriGio() {
		return this.gio;
	}
	
	public int giaTriPhut() {
		return this.phut;
	}
	
	public int giaTriGiay() {
		return this.giay;
	}

}
