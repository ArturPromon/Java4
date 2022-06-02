package com.company;

public class MainAbstract {
    public static void main(String[] args){
        FigureAbstract circle = new CircleAbstract();
        FigureAbstract triangle = new TriangleAbstract();

        circle.draw();
        triangle.draw();
    }
}
