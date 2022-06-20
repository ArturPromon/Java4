package com.company;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Audi";
        car1.model = "toyota";

        Car car2 = new Car("Toyota", "Yaris");

        CarEngine car3 = new CarEngine("Toyota", "Corolla","Diesel");
        CarGearbox car4 = new CarGearbox("Toyota", "Corolla","Automatic");
    }
}
