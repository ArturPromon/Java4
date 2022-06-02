package com.company;

public class PhonesDemo {
    String number;
    int price;
    String model = "Samsung";
    String name;

    PhonesDemo(){

    }
    PhonesDemo(String m, String n, int p, String nam){
        model = m;
        price = p;
        number = n;
        name = nam;
    }

    public String Calling(String name){
        return number;
    }

}
