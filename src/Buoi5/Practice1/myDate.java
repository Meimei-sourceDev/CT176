package Buoi5.Practice1;
import java.time.LocalDate;
import java.util.Scanner;

public class myDate {
    private static final Scanner sc = new Scanner(System.in);
    private int day, month, year;
    public myDate(){}
    public myDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean hopLe(){
        try{
            LocalDate.of(this.year, this.month, this.day);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public void nhap(){
        do{
            System.out.print("Enter date (dd/MM/yyyy): ");
            this.day = sc.nextInt();
            this.month = sc.nextInt();
            this.year = sc.nextInt();
        }while(!hopLe());
    }

    public myDate congNgay(int n){
        LocalDate current = LocalDate.of(this.year, this.month, this.day);
        LocalDate plus = current.plusDays(n);
        return new myDate(plus.getDayOfMonth(), plus.getMonthValue(), plus.getYear());
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%d", day, month, year);
    }
}
