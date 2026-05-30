package Buoi4;
import java.util.Scanner;
import java.util.ArrayList;

public class SDAnimal {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<Animal> farm = new ArrayList<>();
        System.out.print("Enter numbers of animal: "); int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            System.out.print("Enter animal type in number, 1.Cow, 2.Pig, 3.Goat: ");
            int select = sc.nextInt();
            switch(select){
                case 1 -> {
                    Bo cow = new Bo();
                    cow.nhap();
                    farm.add(cow);
                }
                case 2 -> {
                    Heo pig = new Heo();
                    pig.nhap();
                    farm.add(pig);
                }
                case 3 -> {
                    De goat = new De();
                    goat.nhap();
                    farm.add(goat);
                }
                default -> {
                    System.out.println("invalid selection\n");
                    i--;
                }
            }
        }
        for(Animal animal : farm){
            animal.Keu();
        }
        sc.close();
    }
}
