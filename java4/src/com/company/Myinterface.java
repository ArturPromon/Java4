package com.company;

public class Myinterface implements Print, Read {
    String mark;
    String model;

    Myinterface(){

    }

    Myinterface(String mark, String model){
        this.mark = mark;
        this.model = model;
    }

    @Override
    public void printCar(){
        System.out.println(mark + " " + model);
    }

    @Override
    public void printBike(){
        System.out.println(mark + " " + model);
    }

    @Override
    public void readCar(){
        System.out.println("Toyota Auris");
    }

    @Override
    public void readBike(){
        System.out.println("Suzuki Zf");
    }
}
