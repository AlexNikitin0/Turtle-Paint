package com.pluralsight;

import java.awt.*;

public class Square extends Shape{


    public Square(Turtle turtle, Point location, Color color, int border) {
        super(turtle, location, color, border);

    }


    @Override
    void paint() {
        //draw a square
        turtle.setPenWidth(3);
        turtle.setColor(Color.RED);
        turtle.penUp();
        turtle.cornerGoTo(150,150);
        turtle.penDown();
        turtle.forward(200);
        turtle.turnRight(90);
        turtle.forward(200);
        turtle.turnRight(90);
        turtle.forward(200);
        turtle.turnRight(90);
        turtle.forward(200);
    }
}
