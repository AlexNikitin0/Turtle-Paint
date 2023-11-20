package com.pluralsight;

import java.awt.*;

public class Square extends Shape{
        int sideLength;

    public Square(Turtle turtle, Point location, Color color, int border,int sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }


    @Override
    void paint() {
        //draw a square
        turtle.setPenWidth(border);
        turtle.setColor(color);
        turtle.penUp();
        turtle.cornerGoTo(location.x,location.y);
        turtle.penDown();
        turtle.forward(sideLength);
        turtle.turnRight(90);
        turtle.forward(sideLength);
        turtle.turnRight(90);
        turtle.forward(sideLength);
        turtle.turnRight(90);
        turtle.forward(sideLength);
    }
}
