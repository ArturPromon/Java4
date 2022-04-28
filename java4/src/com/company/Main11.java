package com.company;

import java.util.Arrays;

public class Main11 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,455,67,7,563,24,234};
        for(int i = 0; i<array.length;i++){
            array[i] = 0;
        }
        System.out.print(Arrays.toString(array));
    }
}
