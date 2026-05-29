package Buoi1;

import java.util.Scanner;

public class Linear_Quadruple_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 3 numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        quadrupleSolve(a, b, c);
        sc.close();
    }
    public static void linearSolve(double a, double b) {
        if (a == 0) {
            if (b == 0) System.out.println("Infinite solution");
            else System.out.println("No solution");
        } else {
            double x = -b / a;
            System.out.println("ax + b = 0, x = " + x);
        }
    }
    public static void quadrupleSolve(double a, double b, double c){
        if(a == 0){
            linearSolve(b,c);
            return;
        }
        double delta = b * b - 4 * a * c;
        System.out.println("ax^2 + bx + c =, ");
        if(delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.print("x1 = " + x1 + ", x2 = " + x2);
        }else if(delta == 0){
            System.out.print("x1 = x2 = " + (-b/(2*a)));
        }else{
            System.out.print("No real solution");
        }

    }
}
