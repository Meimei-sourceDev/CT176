package Buoi3;
import java.util.Scanner;
public class Diem {
    private int x,y;
    public Diem(){
    }
    public Diem(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input (x; y): ");
        this.x = sc.nextInt();
        this.y = sc.nextInt();
    }

    public void hienThi(){
        System.out.println("Diem co toa do " + "("+ x + "; "+ y +")" );
    }
    public void doiDiem(int dx, int dy){
        this.x = x + dx;
        this.y = y + dy;
    }
    public int giaTriX(){
        return this.x;
    }
    public int giaTriY(){
        return this.y;
    }

    public float khoangCach(){
        return (float)Math.sqrt(x * x + y * y);
    }
    public float khoangCach(Diem d){
        return (float)
        Math.sqrt(
                Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2)
        );
    }
}
