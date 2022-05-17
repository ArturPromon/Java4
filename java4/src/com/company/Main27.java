package com.company;

public class Main27 {
    public static void main(String[] args){
        int[] numbers = new int[]{34,6,36,7,457,345,53,7,67,665,35,35,76,6};
        int max = numbers[5];
        for(int i =0; i < numbers.length; i++){
            if(max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("Max number from array is " + max);

    }
}
