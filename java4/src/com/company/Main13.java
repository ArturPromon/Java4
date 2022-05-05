package com.company;

public class Main13 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,54,5,33,5,74,63,42,42,6,5,465,3,42,4,25,64,4,64,54,54,54,534,5,345};
        int result = 0;
        for(int i = 0; i< array.length; i++){
            if(i< array.length-3 || i == array.length -1){
                result+= array[i];
            }
//            result = result + array[i];

        }
//        result += array[array.length -1];
        System.out.println("result is " + result);
    }
}
