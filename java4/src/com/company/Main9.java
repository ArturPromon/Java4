package com.company;

public class Main9 {
    public static void main(String[] args){
        int num = 1;
        while(num<101){
            System.out.print(num + " ");
            if(num ==99){
                System.out.print("\n");
                num=0;
            }
            num+=2;
        }
    }
}
