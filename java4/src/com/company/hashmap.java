package com.company;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<String, String>();
        capitals.put("Estonia", "Tallinn");
        capitals.put("Norway", "Oslo");
        capitals.put("England", "London");

        System.out.println(capitals);

        System.out.println(capitals.get("Norway"));

        capitals.remove("England");

        System.out.println(capitals);

        for(String i : capitals.values()){
            System.out.println(i);
        }

        for(String i : capitals.keySet()){
            System.out.println(i);
        }

        capitals.clear();

        System.out.println(capitals);

        HashMap<String, Integer> namesage = new HashMap<String, Integer>();
        namesage.put("Bob", 40);
        namesage.put("John", 50);

        int sum = 0;

        for(int i : namesage.values()){
            sum += i;
        }

        int average = sum/ namesage.size();

        System.out.println(average);
    }

}
