package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args){
        int[] nums;
        int length;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter please a length of an array: ");
        length = scn.nextInt();
        nums = new int[length];
        for(int i = 0; i < length; i++){
            System.out.print("nums[" + i + "] = ");
            nums[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(nums));
    }
}
