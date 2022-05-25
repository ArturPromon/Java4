package com.company;

public class PhonesDemo {
    String number;
    int price;
    String model = "Samsung";

    PhonesDemo(){

    }
    PhonesDemo(String m, String n, int p){
        model = m;
        price = p;
        number = n;
    }

    public String Calling(){
        return number;
    }

}
