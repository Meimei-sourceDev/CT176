package Buoi4;
import java.util.Scanner;

public class Animal {
    private static final Scanner sc = new Scanner (System.in);
    private String Type, FurColor;
    private float Weight;

    public Animal(){
        this.Type ="";
        this.FurColor="";
        this.Weight = 0;
    }
    public Animal(String Type, String FurColor, float Weight){
        this.Type = Type;
        this.FurColor = FurColor;
        this.Weight = Weight;
    }

    public void nhap(){
        System.out.print("Enter this animal type: "); this.Type = sc.nextLine();
        System.out.print("Enter this animal fur color: "); this.FurColor = sc.nextLine();
        System.out.print("Enter this animal weight: "); this.Weight = sc.nextInt();
        sc.nextLine();
    }
    public void Keu(){
        System.out.println("This animal has made a noise!");
    }
}
