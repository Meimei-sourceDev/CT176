package Buoi1;

import java.util.Scanner;

public class subStringforName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + getName(name));
    }
    public static String getName(String name){
        name = name.trim();
        return name.substring(name.lastIndexOf(" ") + 1);
    }
}
