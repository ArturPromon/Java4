package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main37 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
//        for(int i : numbers){
//            System.out.println(i);
//        }
        numbers.forEach(x -> System.out.println(x));
//        returnvalue(numbers);

    }

//    public static ArrayList returnvalue(ArrayList<Integer> num){
//        for(int i : num){
//
//        }
//    }
}
