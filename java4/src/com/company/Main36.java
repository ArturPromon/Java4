package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main36 {
    public static void main(String[] args) {
        Animals ouranimal = new Animals();
        List animals = new ArrayList();
        animals.add("Bear");
        animals.add("Wolf");
        animals.add("Elephant");
        animals.add(5);
        animals.add(ouranimal);
        String animal = (String) animals.get(1);
        int num =(int) animals.get(3);
        System.out.println(animal);
        System.out.println(num);

        List<String> animals2= new ArrayList<>();
        animals2.add("bear");
        animals2.add("wolf");
        animals2.add("elephant");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        ArrayList<Integer> list = new ArrayList<Integer>();

    }
}

class Animals{

}
