package Buoi3;
import Buoi2.Diem;

import java.util.Scanner;

public class DuongTronHH extends DuongTron {
    private String maubien;
    private String maunen;

    public DuongTronHH(String maubien, String maunen){
        this.maubien = maubien;
        this.maunen = maunen;
    }

    public DuongTronHH(){
        this.maubien = "";
        this.maunen = "";
    }

    public DuongTronHH(Diem tam, int bankinh, String maubien, String maunen){
        super(tam, bankinh);
        this.maunen = maunen;
        this.maubien = maubien;
    }

    public DuongTronHH(int x, int y, int bk, String maubien, String maunen){
        super(x, y, bk);
        this.maunen = maunen;
        this.maubien = maubien;
    }

    public DuongTronHH(DuongTronHH khac){
        super(khac.layTam(), khac.layBanKinh());
        this.maubien = khac.maubien;
        this.maunen = khac.maunen;
    }

    public DuongTronHH deepCopy(){
        Diem tam = (this.layTam() != null) ? new Diem(this.layTam()) : null;
        return new DuongTronHH(tam, this.layBanKinh(), this.maubien, this.maunen);
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap mau bien: "); this.maubien = sc.nextLine();
        System.out.print("Nhap mau nen: "); this.maunen = sc.nextLine();
    }

    @Override
    public String toString(){
        return super.toString() + "\nmau bien: " + maubien + "\nmau nen: " + maunen;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        DuongTronHH khac = (DuongTronHH) obj;

        if (this.layBanKinh() != khac.layBanKinh()) {
            return false;
        }

        Diem t1 = this.layTam();
        Diem t2 = khac.layTam();

        if (t1 == null) {
            if (t2 != null) {
                return false;
            }
        } else {
            if (t2 == null) {
                return false;
            }
            if (t1.giaTriX() != t2.giaTriX() || t1.giaTriY() != t2.giaTriY()) {
                return false;
            }
        }


        if (this.maubien == null) {
            if (khac.maubien != null) {
                return false;
            }
        } else if (!this.maubien.equals(khac.maubien)) {
            return false;
        }


        if (this.maunen == null) {
            if (khac.maunen != null) {
                return false;
            }
        } else if (!this.maunen.equals(khac.maunen)) {
            return false;
        }

        return true;
    }

    public String getMaubien() {
        return maubien;
    }
    public String getMaunen(){
        return maunen;
    }
}