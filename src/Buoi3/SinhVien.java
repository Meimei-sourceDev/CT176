package Buoi3;

import java.util.ArrayList;
import java.util.Scanner;
import Buoi2.myDate;

public class SinhVien {
    public static Scanner sc = new Scanner(System.in);
    private String MSSV, HoTen;
    private myDate birthdate;
    private int soHP;
    private ArrayList<String> tenHP;
    private ArrayList<String> diemHP;

    public SinhVien(){
        this.MSSV = "";
        this.HoTen = "";
        this.birthdate = new myDate();
        this.soHP = 0;
        this.tenHP = new ArrayList<>();
        this.diemHP = new ArrayList<>();
    }

    public void nhapThongTin(){
        System.out.print("Nhap MSSV: "); this.MSSV = sc.nextLine();
        System.out.print("Nhap Ho va ten: "); this.HoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh sinh vien: "); birthdate.nhap();
    }

    public void nhapDiemHP(){
        System.out.print("Nhap so luong HP: "); this.soHP = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < soHP; i++){
            System.out.print("Nhap MSHP or tenHP: ");
            String ten = sc.nextLine();
            tenHP.add(ten);
            System.out.print("Nhap diem HP: ");
            String diem = sc.nextLine();
            diemHP.add(diem);
        }
    }

    public void themHP(String HP){
        this.tenHP.add(HP);
        this.diemHP.add("");
        this.soHP++;
    }
    public void xoaHP(String HP){
        int index = tenHP.indexOf(HP);
        if(index != -1){
            tenHP.remove(index);
            diemHP.remove(index);
            this.soHP--;
        }
        else System.out.println("Couldn't find subject\n");
    }
    private double quyDoi(String d) {
        return switch (d) {
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            case "D+" -> 1.5;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }
    public double diemTB(){
        if(diemHP.isEmpty()) return 0.0;
        double sum = 0;
        int count = 0;
        for(String diem : diemHP){
            if(!diem.isEmpty()){
                sum += quyDoi(diem);
                count++;
            }
        }
        return (count == 0) ? 0.0 : sum / count;
    }
    public String getTenOnly(){
        String hoten = this.HoTen.trim();
        return hoten.substring(hoten.lastIndexOf(" ") + 1);
    }
    @Override
    public String toString(){
        String sv = "MSSV: "+MSSV+" ,Name: "+HoTen+" ,Birthdate: "+birthdate.toString();
        sv += "\nCac HP: "+tenHP.toString();
        sv += "\nDiem HP:"+diemHP.toString();
        sv+= "\nDiem TB: "+String.format("%.2f", diemTB());
        return sv;
    }
}
