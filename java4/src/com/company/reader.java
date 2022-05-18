package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class reader {
    public static void main(String[] args){
        BufferedReader file = null;
        int countLetter;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter some letter ");
        char letter = scn.next().toLowerCase().charAt(0);
        char letter2 = Character.toUpperCase(letter);
        try{
            file = new BufferedReader(new FileReader("file.txt"));
            String line;
            while((line = file.readLine()) != null){
                countLetter = 0;
//                System.out.println(line);
                String[] parts = line.split(" ");
                for(int i = 0; i< parts.length; i++){
                    parts[i] = Character.toUpperCase(parts[i].charAt(0)) + parts[i].substring(1);
                }
                System.out.println(Arrays.toString(parts));
                System.out.println("words in sentence " + parts.length);

                for(int i = 0; i<line.length();i++){
                    if(line.charAt(i) == letter || line.charAt(i) == letter2){
                        countLetter++;
                    }
                }

                System.out.println("Special letter in sentence " + countLetter + "\n");
            }

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
