package Buoi5.Practice2;
import java.util.Scanner;
import java.time.LocalDate;

public class myDate {
    private static final Scanner sc = new Scanner(System.in);
    private int day, month, year;
    public myDate (){
        this.month = 0;
        this.day = 0;
        this.year = 0;
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
            System.out.print("(dd/MM/yyyy): ");
            this.day = sc.nextInt();
            this.month = sc.nextInt();
            this.year = sc.nextInt();

            if(!hopLe()) System.out.println("Invalid date, try again.");
        }while(!hopLe());
    }

    @Override public String toString(){
        return String.format("%02d/%02d/%d", this.day, this.month, this.year);
    }
}
