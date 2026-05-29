package Buoi4;
import Buoi2.Diem;
import java.util.Scanner;

public class DiemMau extends Diem{
    private static final Scanner sc = new Scanner(System.in);
    private String Color;

    public DiemMau(){
        this.x = 0;
        this.y = 0;
        this.Color = "";
    }

    public DiemMau(int x, int y, String Color){
        this.x = x;
        this.y = y;
        this.Color = Color;
    }

    public void GanMau(String Color){
        this.Color = Color;
    }
    public void nhap(){
        nhapDiem();
        System.out.print("Enter color: ");
        String inColor = sc.nextLine();
        GanMau(inColor);
    }
    @Override
    public void hienThi(){
        System.out.println("x = " + this.x + " y = " + this.y);
        System.out.println("Color: " + this.Color);
    }
}
