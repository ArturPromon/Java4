package com.company;

public class RandomExam {
    public static void main(String[] args) {
        int random = (int) Math.round(Math.random()*100);
        System.out.println(radmozier(random));
    }
    public static boolean radmozier(int random){
        if(random>50){
            return true;
        }else{
            return false;
        }
    }
}

