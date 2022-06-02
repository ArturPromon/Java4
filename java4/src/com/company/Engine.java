package com.company;

public class Engine {
    int power;
    String fuel_type;
    boolean hybrid_or_not;
    String hybridtype;

    Engine(int power, String fuel_type, boolean hybrid_or_not){
        this.power = power;
        this.fuel_type = fuel_type;
        this.hybrid_or_not = hybrid_or_not;
    }

    public void converte(){
        if(!hybrid_or_not){
            hybridtype = "not hybrid";
        }else{
            hybridtype = "hybrid engine";
        }
    }


}
