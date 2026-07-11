package Buoi2;

import java.util.Scanner;

public class Diem {

    public int x, y;

    public Diem(){};
    public Diem(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Diem(Diem d){
        this.x = d.x;
        this.y = d.y;
    }
    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: (x; y)");
        x = sc.nextInt();
        y = sc.nextInt();
    }
    public void hienThi(){
        System.out.println("x = " + x + ", y = " + y);
    }
    public void doiDiem(int dx, int dy){
        x += dx;
        y += dy;
    }
    public int giaTriX(){
        return x;
    }
    public int giaTriY(){
        return y;
    }
    public float khoangCach(){
        return (float) Math.sqrt(x * x + y * y);
    }
    public float khoangCach(Diem d){
        return (float) Math.sqrt(
                Math.pow(x - d.x, 2) +
               Math.pow(y - d.y, 2 )
        );
    }

    //Bo sung

    public boolean equals(Diem d){
        return this.x == d.x && this.y == d.y;
    }

    @Override
    public String toString(){
        return "x = " + x + ", y = " + y;
    }
}
