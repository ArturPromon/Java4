package com.company;

public class Track extends Engine {
    int cargo_capacity;
    int wheels_number;

    Track(int cargo_capacity, int wheels_number, int power, String fuel_type, boolean hybrid_or_not){
        super(power, fuel_type, hybrid_or_not);
        this.cargo_capacity = cargo_capacity;
        this.wheels_number = wheels_number;
    }

    public void getParam(){
        super.converte();
        System.out.println("Power of track " + power + ", Number of wheels is " + wheels_number + ", cargo capacity is " +
                cargo_capacity + ", fuel type " + fuel_type + ", Hybrid or not- " + hybridtype);
    }
}
