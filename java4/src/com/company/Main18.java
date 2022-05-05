package com.company;

public class Main18 {
    public static void main(String[] args){
        int result;
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        for(int i = 0; i<10;i++){
            result = num1 + num2;

            System.out.print(result + " ");
            num1 = num2;
            num2 = result;
        }
    }
}
