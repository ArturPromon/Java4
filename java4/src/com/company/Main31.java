package com.company;

public class Main31 {
    public static void main(String[] args){
        int[] numbers = new int[]{34,6,36,7,457,345,53,7,67,665,35,35,76,6};
        System.out.println("Max number from array is " + getMaxValue(numbers));
        System.out.println("Min number from array is " + getMinValue(numbers));
    }
    public static int getMaxValue(int[] numbers){
        int max;
        max = numbers[0];
        for(int i =0; i < numbers.length; i++){
            if(max<numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }
    public static int getMinValue(int[] numbers){
        int min;
        min = numbers[0];
        for(int i =0; i < numbers.length; i++){
            if(min>numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }
}
