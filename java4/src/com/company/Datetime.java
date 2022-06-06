package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datetime {
    public static void main(String[] args){
        LocalDate obj = LocalDate.now();
//        System.out.println(obj);

        LocalTime obj2 = LocalTime.now();
//        System.out.println(obj2);

        LocalDateTime obj3 = LocalDateTime.now();
//        System.out.println(obj3);

        DateTimeFormatter formatobj2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedobj2 = obj3.format(formatobj2);

        System.out.println(formatedobj2);
    }
}
