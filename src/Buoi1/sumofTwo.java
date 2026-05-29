package Buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter num1: ");
                int a = sc. nextInt();
                System.out.print("Enter num2: ");
                int b = sc.nextInt();
                int sum = a+b;
                System.out.println("SUM =" + sum);
                break;
            } catch(InputMismatchException e){
                System.out.println("Invalid input, try again");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
