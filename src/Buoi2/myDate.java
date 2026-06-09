package Buoi2;

import java.util.Scanner;
import java.time.LocalDate;

public class myDate {
    public static final Scanner sc = new Scanner(System.in);
    private int day;
    private int month;
    private int year;

    public myDate(){
    }
    public myDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean hopLe(){
        try{
            LocalDate.of(this.year, this.month, this.day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void nhap(){
        do{
            System.out.print("Nhap date (dd/MM/yyyy): ");
            this.day = sc.nextInt();
            this.month = sc.nextInt();
            this.year = sc.nextInt();
            if(!hopLe()) System.out.println("Invalid date, try again.\n");
        }while(!hopLe());
    }

    public myDate plusDate(){
        LocalDate current = LocalDate.of(this.year, this.month, this.day);
        LocalDate nextDay = current.plusDays(1);
        return new myDate (nextDay.getDayOfMonth(), nextDay.getMonthValue(), nextDay.getYear());
    }

    public myDate plusDate(int n){
        LocalDate current = LocalDate.of(this.year, this.month, this.day);
        LocalDate daysAdded = current.plusDays(n);
        return new myDate(daysAdded.getDayOfMonth(), daysAdded.getMonthValue(), daysAdded.getYear());
    }
    public void hienThi(){
        System.out.println(day + "/"+month+"/"+year);
    }
    @Override
    public String toString(){
        return String.format("%02d/%02d/%d", day,month,year);
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
}
