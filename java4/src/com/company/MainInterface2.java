package com.company;

public class MainInterface2 {
    public static void main(String[] args) {
        ArrayInterface2 a = new MyArray2();
        System.out.println(a.Add(5));
        System.out.println(a.Add(10));
        System.out.println(a.Add(4));
        System.out.println(a.Add(15));

        System.out.println(a.Get(1));
    }
}
