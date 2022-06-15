package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main41 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Lija");
        names.add("Oleg");
        names.add("Artur");

        Iterator<String> it = names.iterator();

//        System.out.println(it.next());

        while(it.hasNext()){
            System.out.println(it.next());
        }

        if(true) {
            System.out.println("hello");
        }
        else {
            System.out.println("Hello");
        }

    }
}
