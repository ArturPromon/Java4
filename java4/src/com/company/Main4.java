package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num;
        num = scn.nextInt();

        switch(num){
            case 10:
                System.out.println("Number is 10");
                break;
            case 15:
                System.out.println("Number is 150");
                break;
            default:
                System.out.println("Some number");
        }
    }
}
