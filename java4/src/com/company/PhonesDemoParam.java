package com.company;

public class PhonesDemoParam extends PhonesDemo2{
    String system;
    int core;
    int memory;

    PhonesDemoParam(){

    }

    PhonesDemoParam(String system, int core, int memory){
        this.system = system;
        this.core = core;
        this.memory = memory;
    }

    PhonesDemoParam(String system, int core, int memory, String model, String number, int price){
        super(model, number, price);
        this.system = system;
        this.core = core;
        this.memory = memory;
    }

        public void tellModel(){
            System.out.println(super.model);
        }

    public void tellphone10(){
        System.out.println(this.model + this.number + this.price + system + core + memory);
    }

    public void print(){
        System.out.println("Hello!!!");
    }


    public void test(){
        this.print();
        super.print();
    }


}
