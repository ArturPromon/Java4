package com.company;

public class Main33 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println(sum(5,6,7));
        System.out.println(sum(5.3f,5.3f));
    }
}
