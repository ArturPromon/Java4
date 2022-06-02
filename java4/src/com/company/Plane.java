package com.company;

public class Plane extends Engine {
    int passenger_capacity;
    int wings_number;



    Plane(int passenger_capacity, int wings_number, int power, String fuel_type, boolean hybrid_or_not){
        super(power, fuel_type, hybrid_or_not);
        this.passenger_capacity = passenger_capacity;
        this.wings_number = wings_number;
    }

    public void getParam(){
        super.converte();
        System.out.println("Power of plane " + power + ", Number of wings is " + wings_number + ", passenger capacity is " +
                passenger_capacity + ", fuel type " + fuel_type + ", hybrid or not - " + hybridtype);
    }
}
