package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int width, height, choice, thickness, x, y;
        String tempColor;
        System.out.println("Welcome to Turtle Paint!");
        System.out.println("Please define the Canvas Dimensions");
        System.out.print("Width: ");
        width = keyboard.nextInt();
        System.out.print("Height: ");
        height = keyboard.nextInt();
        World world = new World(width, height);
        Turtle turtle = new Turtle(world, -100, -100);

        //home screen
        System.out.print("Which shape (1. square, 2. circle, 3. triangle)? ");
        choice = keyboard.nextInt();
        System.out.print("What is the border width? ");
        thickness = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("What is the border color? ");
        tempColor = keyboard.nextLine().toLowerCase();
        System.out.println("What is the location of the shape?");
        System.out.print("X: ");
        x = keyboard.nextInt();
        System.out.print("Y: ");
        y = keyboard.nextInt();
        Point location = new Point(x, y);
        System.out.println("Your selected shape should appear in the new java window!");
        //decision structure based on color


        //decision structure based on shape


        switch (choice) {
            case 1:

                Square square = new Square(turtle, location,getColor(tempColor),thickness);
                square.paint();
                break;
            case 2:
                Circle circle = new Circle(turtle,location,getColor(tempColor),thickness);
                circle.paint();
                break;
            case 3:
                Triangle triangle = new Triangle(turtle,location,getColor(tempColor),thickness);
                triangle.paint();
        }


    }




    public static Color getColor (String tempCol){
        switch (tempCol) {
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "blue":
                return Color.BLUE;
            case "white":
                return Color.WHITE;
            case "black":
                return Color.BLACK;
            case "yellow":
                return Color.YELLOW;
            default:
                return Color.PINK;

        }
    }

}