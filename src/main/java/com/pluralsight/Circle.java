package com.pluralsight;

import java.awt.*;

public class Circle extends Shape{


    public Circle(Turtle turtle, Point location, Color color, int border) {
        super(turtle, location, color, border);
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

        for(int i = 0;i<45;i++){
            turtle.forward(8);
            turtle.turnLeft(8);
        }
    }
}
