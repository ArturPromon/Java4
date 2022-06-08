package com.company;

enum level{
    Low,
    Medium,
    Hard
}

public class Main35 {
    public static void main(String[] args) {
        level var = level.Low;

        switch (var){
            case Low:
                System.out.println("Level is Low");
                break;
            case Medium:
                System.out.println("Level is Medium");
                break;
            case Hard:
                System.out.println("Level is Hard");
                break;
        }
    }
}
