package Buoi4;
import java.util.Scanner;

public class GiangVien {
    private String mscb;
    private String hoTen;
    private String hocVi;
    private String donVi;
    private int thamNien;
    private HocPhan[] dsHP;

    private static final int MAXHP = 50;

    public GiangVien(){
        this.mscb = "";
        this.hoTen = "";
        this.hocVi = "";
        this.donVi = "";
        this.thamNien = 0;
        this.dsHP = new HocPhan[MAXHP];
    }

    public GiangVien(String mscb, String hoTen, String hocVi, String donVi, int thamNien){
        this.mscb = mscb;
        this.hoTen = hoTen;
        this.hocVi = hocVi;
        this.donVi = donVi;
        this.thamNien = thamNien;
        this.dsHP = new HocPhan[MAXHP];
    }

    public GiangVien(GiangVien khac){
        this.mscb = khac.mscb;
        this.hocVi = khac.hocVi;
        this.hoTen = khac.hoTen;
        this.donVi = khac.donVi;
        this.thamNien = khac.thamNien;
        for(int i = 0; i < khac.dsHP.length; i++){
            if(khac.dsHP[i] != null){
                this.dsHP[i] = khac.dsHP[i];
            }
        }
    }

    public GiangVien deepCopy(){
        GiangVien res = new GiangVien(this.mscb, this.hoTen, this.hocVi, this.donVi, this.thamNien);
        for(int i = 0; i < this.dsHP.length; i++){
            if(this.dsHP[i] != null){
                res.dsHP[i] = new HocPhan(this.dsHP[i]);
            }
        }
        return res;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mscb: "); this.mscb = sc.nextLine();
        System.out.print("Nhap ho ten: "); this.hoTen = sc.nextLine();
        System.out.print("Nhap hoc vi: "); this.hocVi = sc.nextLine();
        System.out.print("Nhap don vi: "); this.donVi = sc.nextLine();
        System.out.print("Nhap tham nien: "); this.thamNien = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap so luong hoc phan: "); int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < this.dsHP.length; i++){
            this.dsHP[i] = null;
        }
        for(int i = 0; i < n && i < this.dsHP.length; i++){
            HocPhan hp = new HocPhan();
            hp.nhap();
            this.dsHP[i] = hp;
        }
    }

    public boolean themHP(HocPhan hp){
        for(int i = 0; i < this.dsHP.length; i++){
            if(dsHP[i] != null && dsHP[i].equals(hp)){
                return false; //khong them duoc;
            }
        }

        for(int i = 0; i < this.dsHP.length; i++){
            if(dsHP[i] == null){
                dsHP[i] = new HocPhan(hp);
                return true;
            }
        }
        return false;
    }

    public boolean xoaHP(HocPhan hp){
        for(int i = 0; i < this.dsHP.length; i++){
            if(dsHP[i] != null && dsHP[i].equals(hp)){
                dsHP[i] = null;
                for(int j = i; j < this.dsHP.length - 1; j++){
                    dsHP[j] = dsHP[j + 1];
                }
                dsHP[dsHP.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    public HocPhan layHPGD(int i ){
        if(i >= 0 && i <= dsHP.length){
            return this.dsHP[i];
        }
        return null;
    }

    public String getMscb() {
        return mscb;
    }

    public String getDonVi() {
        return donVi;
    }

    public HocPhan[] getDsHP() {
        return dsHP;
    }

    public String getHoTen(){
        return hoTen;
    }

    public String getHocVi(){
        return hocVi;
    }

    public int getThamNien(){
        return thamNien;
    }

}
