package com.company;

import java.util.Arrays;

public class Main14 {
    public static void main(String[] args){
        int[] array = new int[] {4,6,4,7,7,9,4,3,7,2,1};
        int num = 4;
        int num2 = 7;
        for(int i = 0; i < array.length;i++){
            if(num == array[i] || num2 == array[i] ){
                array[i] = array[i] * 2;
//                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
