package Buoi1;

import java.util.Scanner;

public class primetoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        String binary = Integer.toBinaryString(num);
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime number " + num + " has binary string " + binary);
        }else{
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
}
