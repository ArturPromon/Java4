package com.company;

public class MainInterface {
    public static void main(String[] args){
        Print car1 = new Myinterface("Audi", "A6");
        car1.printCar();
        Print bike1 = new Myinterface("Yamaha", "Z1");
        bike1.printBike();
        Read car2 = new Myinterface();
        car2.readCar();
        Read bike2 = new Myinterface();
        bike2.readBike();
    }
}
