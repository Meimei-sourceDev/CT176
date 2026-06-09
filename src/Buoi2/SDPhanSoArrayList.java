package Buoi2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class SDPhanSoArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<PhanSo> psList = new ArrayList<>();
        System.out.println("Nhap so luong phan so: "); int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            PhanSo phanSo = new PhanSo();
            phanSo.nhap();
            psList.add(phanSo);
        }

        PhanSo sum = new PhanSo();
        for(PhanSo ps : psList){
            sum = sum.cong(ps);
        }

        PhanSo max = psList.stream()
                .max(Comparator.comparingDouble(PhanSo::toDecimal))
                        .orElse(null);

        psList.sort(Comparator.comparing(PhanSo::toDecimal).reversed());
        for(PhanSo ps : psList){
            ps.hienThi();
        }
        sc.close();
    }
}
