package Buoi4;

import java.util.Scanner;

public class LopHocPhan {
    private String malop;
    private HocPhan hp;
    private int siSo;
    private GiangVien gv;
    private String phongHoc;
    private String thoiGian;

    public LopHocPhan(){
        this.malop = "";
        this.hp = new HocPhan();
        this.siSo = 0;
        this.gv = new GiangVien();
        this.phongHoc = "";
        this.thoiGian = "";
    }

    public LopHocPhan(String ms, HocPhan h, int ss, String p, String tg){
        this.malop = ms;
        this.hp = new HocPhan(h);
        this.siSo = ss;
        this.phongHoc = p;
        this.thoiGian = tg;
        this.gv = new GiangVien();
    }

    public LopHocPhan(LopHocPhan khac){
        this.malop = khac.malop;
        this.hp = new HocPhan(khac.hp);
        this.siSo = khac.siSo;
        this.gv = new GiangVien(khac.gv);
        this.phongHoc = khac.phongHoc;
        this.thoiGian = khac.thoiGian;
    }

    public void deepCopy(LopHocPhan khac){
        this.malop = khac.malop;
        this.hp = new HocPhan(khac.hp);
        this.siSo = khac.siSo;
        this.gv = new GiangVien(khac.gv);
        this.phongHoc = khac.phongHoc;
        this.thoiGian = khac.thoiGian;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so lop: "); this.malop = sc.nextLine();
        this.hp.nhap();
        System.out.print("Nhap si so lop: "); this.siSo = sc.nextInt();
        this.gv.nhap();
        System.out.print("Nhap phong hoc: "); this.phongHoc = sc.nextLine();
        System.out.print("Nhap thoi gian: "); this.thoiGian = sc.nextLine();
    }

    public void in(){
        System.out.println("Ma lop: " + malop + " | Si so: " + siSo +
                " | Phong hoc: " + phongHoc + " | Thoi gian: " + thoiGian +
                this.gv.toString() + this.hp.toString());
    }

    public void setHp(HocPhan hp){
        this.hp = new HocPhan(hp);
    }

    public void phanCongGV(GiangVien g){
        this.gv = new GiangVien(g);
    }

    public void tangSiSo(int n ){
        this.siSo = this.siSo + n;
    }

    public String getMalop(){
        return malop;
    }
    public int getSiSo(){
        return siSo;
    }
    public String getPhongHoc(){
        return phongHoc;
    }
    public String getThoiGian(){
        return thoiGian;
    }

    public GiangVien getGv(){
        return this.gv;
    }

    public HocPhan getHp(){
        return this.hp;
    }

    public double onlineRate(){
        return 0.0;
    }
}
