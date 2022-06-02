package com.company;

public class Vehicles {
    public static void main(String[] args){
        Plane Aerobus = new Plane(144, 2, 1500, "Diesel", true);
        Track Scania = new Track(15, 12, 700, "Diesel", false);

        Aerobus.getParam();
        Scania.getParam();
    }
}
