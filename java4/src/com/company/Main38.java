package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main38 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,10};
        Arrays.stream(array).forEach(x-> System.out.println(x));
        System.out.println(Arrays.stream(array).sum());

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(10);
        array2.add(15);
        array2.add(20);
        array2.add(25);
        array2.add(30);
        array2.add(35);
        array2.add(40);
        array2.add(45);
        array2.add(50);

        array2.stream().forEach(x-> System.out.print(x + " "));
        System.out.println();

        Stream<Integer> stream = array2.stream();
        stream.forEach(System.out::print);
        System.out.println();
        stream = array2.stream();
        stream.forEach(System.out::print);
        System.out.println();
        stream = array2.stream();
        System.out.println(stream.count());

        int max = array2.stream().max(Integer::compare).get();
        System.out.println("Max is " + max);

        for(Integer i : array2){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }

        array2.stream().filter(i-> i % 2 ==0).forEach(System.out::println);
    }
}
