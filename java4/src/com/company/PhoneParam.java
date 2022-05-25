package com.company;

public class PhoneParam {
    class core{
        String core = "Switched off";

        public void notworking(){
            core = "not working";
            System.out.println(core);
        }

        public void working(){
            core = "core is working";
            System.out.println(core);
        }

    }
    class memory{
        String memory = "Switched off";

        public void notworking(){
            memory = "not working";
            System.out.println(memory);
        }

        public void working(){
            memory = "memory is working";
            System.out.println(memory);
        }

    }
    core intelcore = new core();
    memory ram = new memory();
}



