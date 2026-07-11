package Buoi4;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        HocPhan h1, h2, h3, h4;
        h1 = new HocPhan();
        h2 = new HocPhan();
        h3 = new HocPhan();
        h4 = new HocPhan();

        h1.nhap();
        h2.nhap();
        h3.nhap();
        h4.nhap();

        GiangVien gv1, gv2, gv3;
        gv1 = new GiangVien();
        gv2 = new GiangVien();
        gv3 = new GiangVien();

        gv1.nhap();
        gv2.nhap();
        gv3.nhap();

        ArrayList<LopHocPhanOnline> listOnline = new ArrayList<>();
        System.out.print("Nhap so luong lop hoc phan online: "); int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            LopHocPhanOnline hpo = new LopHocPhanOnline();
            System.out.println("Nhap thong tin #" + (i + 1) + ": ");
            hpo.nhap();
            System.out.println("Chon lop hoc phan #(1, 2, 3, 4): "); int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) hpo.setHp(h1);
            else if(ch == 2) hpo.setHp(h2);
            else if(ch == 3) hpo.setHp(h3);
            else if(ch == 4) hpo.setHp(h4);
            else{
                System.out.print("Invalid");
                hpo.setHp(null);
            }

            System.out.println("Chon lop giang vien #(1, 2, 3): "); int ch1 = sc.nextInt();
            sc.nextLine();

            if (ch1 == 1) hpo.phanCongGV(gv1);
            else if(ch1 == 2) hpo.phanCongGV(gv2);
            else if(ch1 == 3) hpo.phanCongGV(gv3);
            else{
                System.out.print("Invalid");
                hpo.phanCongGV(null);
            }

            listOnline.add(hpo);
        }

        System.out.println("---KET QUA---");
        for(LopHocPhanOnline hpo : listOnline){
            hpo.in();
            System.out.println();
        }
        sc.close();
    }
}
