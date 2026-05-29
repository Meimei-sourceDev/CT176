package Buoi3;
import java.time.LocalDate;
import java.util.Scanner;

public class Date {
    private int ngay, thang, nam;
    public Date(){}
    public Date(int ngay, int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    };

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam; // Giả sử thuộc tính là ngay, thang, nam
    }

    public void hienThiNgay(){
        System.out.println("Ngay "+this.ngay+" thang "+this.thang+" nam "+this.nam);
    }
    public void nhapNgay(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap ngay theo dinh dang (dd/MM/yyyy): ");
            ngay = sc.nextInt();
            thang = sc.nextInt();
            nam = sc.nextInt();
            if(!hopLe()) System.out.println("invalid date");
        }while(!hopLe());
    }

    public boolean hopLe(){
        try{
            LocalDate.of(this.nam, this.thang, this.ngay);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public Date ngayHomSau(){
        LocalDate current = LocalDate.of(this.nam, this.thang, this.ngay);
        LocalDate next = current.plusDays(1);
        return new Date(next.getDayOfMonth(), next.getMonthValue(), next.getYear());
    }
    public Date congNgay(int n){
        LocalDate current = LocalDate.of(this.nam, this.thang, this.ngay);
        LocalDate plusDate = current.plusDays(n);
        return new Date(plusDate.getDayOfMonth(), plusDate.getMonthValue(), plusDate.getYear());
    }
}
