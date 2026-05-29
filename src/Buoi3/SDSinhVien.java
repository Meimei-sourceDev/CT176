package Buoi3;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collection;
import java.util.ArrayList;


public class SDSinhVien {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        SinhVien svA = new SinhVien();
        svA.nhapThongTin();
        svA.themHP("LTHDT");
        System.out.println(svA.toString());

        System.out.print("Nhap so luong sv: "); int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> List = new ArrayList<>();
        for(int i = 0; i < n; i++){
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            sv.nhapDiemHP();
            List.add(sv);
        }

        System.out.println("DSSV: ");
        List.sort(Comparator.comparing(SinhVien::getTenOnly, String.CASE_INSENSITIVE_ORDER));
        List.forEach(System.out::println);

        System.out.println("Sinh vien bi canh cao hoc vu: ");
        List.stream().filter(sv -> sv.diemTB() < 1.0).forEach(System.out::println);

        SinhVien max = List.stream().max(Comparator.comparingDouble(SinhVien::diemTB)).orElse(null);
        System.out.println("Sinh top#1 la: " + max);
        sc.close();
    }
}
