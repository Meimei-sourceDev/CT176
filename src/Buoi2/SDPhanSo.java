package Buoi2;

import java.util.Scanner;

public class SDPhanSo {
    public static void swap(PhanSo[] list, int i, int j) {
        PhanSo temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        a.hienThi();
        b.hienThi();
        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        x.nhapPhanSo();
        y.nhapPhanSo();
        x.giaTriNghichDao().hienThi();
        PhanSo tong = x.cong(y);
        tong.rutGon();
        tong.hienThi();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        PhanSo MAX = new PhanSo();
        PhanSo[] list = new PhanSo[n];
        PhanSo SUM = new PhanSo();

        for(int i = 0; i < n; i++){
            list[i] = new PhanSo();
            list[i].nhapPhanSo();
            SUM = SUM.cong(list[i]);
            if(list[i].lonHon(MAX)){
                MAX = list[i];
            }
        }
        SUM.hienThi();
        MAX.hienThi();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j ++){
                if(list[j].lonHon(list[j + 1]))
                swap(list, j, j + 1);
            }
        }
        System.out.println("Sorted list:");
        for (PhanSo ps : list) {
            ps.hienThi();
        }
    }
}
