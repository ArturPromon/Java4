package com.company;

public class CarGearbox extends Car{
    String typeGearbox;

    CarGearbox(String name, String model, String typeGearbox){
        super(name, model);
        this.typeGearbox = typeGearbox;
    }
}
