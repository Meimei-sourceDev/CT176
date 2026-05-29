package Buoi4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class SDSinhVienCNTT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<SinhVienCNTT> List = new ArrayList<>();
        for(int i = 0; i < n; i++){
            SinhVienCNTT sv = new SinhVienCNTT();
            sv.nhap();
            sv.nhapDiemHP();
            List.add(sv);
        }
        System.out.println("Nhap email: ");
        String find = sc.nextLine();
        List.stream().filter(sv -> sv.getEmail().equals(find)).findFirst()
                .ifPresentOrElse(
                        sv->{
                            System.out.println("Tim thay email: ");
                            System.out.println(sv.toString());
                        },
                        () -> System.out.println("Khong tim thay email: " + find )
                );

    }
}
