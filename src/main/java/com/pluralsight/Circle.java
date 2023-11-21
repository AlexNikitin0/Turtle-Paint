package com.pluralsight;

import java.awt.*;

public class Circle extends Shape{

    double radius;


    public Circle(Turtle turtle, Point location, Color color, int border,double radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    void paint() {
        //draw a circle

        turtle.setPenWidth(border);
        turtle.setColor(color);
        turtle.penUp();
        turtle.cornerGoTo(200,200);
        turtle.cornerGoTo(location.x,location.y);
        turtle.turnLeft(90);
        turtle.penDown();
        turtle.setDelay(.00001);
        for(int i=0; i<360; i++){
            turtle.turnLeft(1);
            turtle.forward(2 * Math.PI * radius / 360);
        }
    }
}
