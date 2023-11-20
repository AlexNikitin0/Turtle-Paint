package com.pluralsight;

import java.awt.*;

public class Triangle extends Shape{


    public Triangle(Turtle turtle, Point location, Color color, int border) {
        super(turtle, location, color, border);
    }

    @Override
    void paint() {
        //draw a triangle
        turtle.setPenWidth(border);
        turtle.setColor(color);
        turtle.penUp();
        turtle.cornerGoTo(location.x,location.y);
        turtle.penDown();
        turtle.forward(50);
        turtle.turnRight(-240);
        turtle.forward(50);
        turtle.turnRight(-240);
        turtle.forward(50);
    }
}
