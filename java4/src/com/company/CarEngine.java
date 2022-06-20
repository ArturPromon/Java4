package com.company;

public class CarEngine extends Car{
    String typefuel;
    CarEngine(String name, String model, String typefuel){
        super(name, model);
        this.typefuel = typefuel;
    }
}
