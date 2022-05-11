package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main23 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write some sentence or word: ");
        String someString = scn.nextLine();
        System.out.println("Please write some letter: ");
        char someChar = scn.next().charAt(0);
        int count = 0;
        int total_letters = 0;
        int total_words = 0;
        String[] words = someString.split(" ");

        for(int i = 0; i < someString.length();i++){
            if(someString.charAt(i) == someChar){
                count++;
            }

            if(someString.charAt(i) != ' '){
                total_letters++;
            }
        }

        for(String element: words){
            if(!element.equals("")){
                total_words++;
            }
        }


        System.out.println(count);
        System.out.println(total_letters);
        System.out.println(total_words);


    }
}
