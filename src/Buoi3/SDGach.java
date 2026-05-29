package Buoi3;
import Buoi2.PhanSo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class SDGach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong gach: "); int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Gach> Gaches = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Gach gach = new Gach();
            gach.nhapThongTin();
            Gaches.add(gach);
        }
        for(Gach g : Gaches){
            g.hienThi();
        }
        Gach cheapest = Gaches.stream().min(Comparator.comparingDouble(Gach::chiPhiDienTich)).orElse(null);
        if(cheapest != null){
            System.out.print("Gach co chi phi thap nhat la: ");
            cheapest.hienThi();
        }
        int chieuDai = 5 * 100;
        int chieuRong = 20 * 100;
        for(Gach current : Gaches){
            current.hienThi();
            long tongChiPhi = current.getPrice() * current.soLuongHop(chieuDai, chieuRong);
            System.out.println("Chi phi lot dien tich (5 x 20): " + tongChiPhi);
        }
    }
}
