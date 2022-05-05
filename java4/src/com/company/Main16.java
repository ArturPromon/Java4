package com.company;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args){
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July",
                                        "August", "September", "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter a number of month: ");
        n=scn.nextInt();
        n--;
        for(int i = 0; i< months.length;i++){
            if(n == i){
                System.out.println(months[i]);
            }
        }
    }
}
