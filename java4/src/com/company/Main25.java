package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main25 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(9);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Lexus");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");

        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);


    }
}
