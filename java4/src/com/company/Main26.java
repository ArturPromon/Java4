package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main26 {
    public static void main(String[] args){
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        int i = 0;
        for(String element: months){
            months[i] = element.toLowerCase();
            i++;
        }



        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter some name of month: ");
        String someMonth = scn.nextLine();


        if(Arrays.asList(months).contains(someMonth)){
            System.out.println(Arrays.asList(months).indexOf(someMonth) + 1);
        }else{
            System.out.println("Error!");
        }
    }
}
