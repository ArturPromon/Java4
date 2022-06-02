package com.company;

public class Countryresolve implements Countryint{
    String country;
    Countryresolve(String country){
        this.country = country;
    }
    @Override
    public void printCapital(String capital){
        System.out.println("The capital of " + country + " is " + capital);
    }
}
