package Buoi4;

import java.util.Scanner;

public class LopHocPhanOnline extends LopHocPhan{
    private int tietonline;
    private String linklop;
    private String linkthi;

    public LopHocPhanOnline(){
        super();
        this.tietonline = 0;
        this.linklop ="";
        this.linkthi ="";
    }

    public LopHocPhanOnline(LopHocPhanOnline khac){
        super(khac);
        this.linkthi = khac.linkthi;
        this.linklop = khac.linklop;
        this.tietonline = khac.tietonline;
    }

    public void deepCopy(LopHocPhanOnline khac){
        super.deepCopy(khac);
        this.linkthi = khac.linkthi;
        this.linklop = khac.linklop;
        this.tietonline = khac.tietonline;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so tiet online: "); this.tietonline = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap link lop: "); this.linklop = sc.nextLine();
        System.out.print("Nhap link thi: "); this.linkthi = sc.nextLine();
    }

    @Override
    public void in(){
        super.in();
        System.out.println("So tiet online: " + tietonline +" | link lop: " + linklop+
                " | link thi: " + linkthi);
    }

    @Override
    public double onlineRate(){
        int tongTiet = this.getHp().getSoTietLT() + this.getHp().getSoTietTH();
        if (tongTiet == 0) return 0.0;
        return ((double) this.tietonline / tongTiet) * 100;
    }


}
