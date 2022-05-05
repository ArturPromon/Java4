package com.company;

public class Main17 {
    public static void main(String[] args) {
        int num = 9;
        int range = 1;
        int result = 1;

        while(true){
            result = result* num;
            System.out.println(num + "** " + range + " = " + result);
            range++;
            if(range>8){
                break;
            }
        }
    }
}
