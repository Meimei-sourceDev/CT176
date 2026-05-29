package Buoi1;

import java.util.Scanner;
import java.util.Arrays;

public class getTargetOccur {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt(), count = 0;
        for(int num : nums){
            if(num  == x) count++;
        }
        Arrays.sort(nums);
        for(int num : nums){
            System.out.print(num+ " ");
        }
        System.out.println("count of " + x + ":" + count);
    }
}
