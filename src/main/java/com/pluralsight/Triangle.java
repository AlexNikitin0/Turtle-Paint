package com.pluralsight;

import java.awt.*;

public class Triangle extends Shape{

    int sideLength;

    public Triangle(Turtle turtle, Point location, Color color, int border,int sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }

    @Override
    void paint() {
    //draw a triangle
        turtle.setColor(color);
        for(int i = 0; i < 3;i++){
           turtle.forward(sideLength);
            turtle.turnRight(120);
        }

    }
}



//    public void drawTriangle(int sideLength){
//        turtle.setColor(color);
//        for(int i = 0; i < 3;i++){
//            turtle.forward(sideLength);
//            turtle.turnRight(120);
//        }