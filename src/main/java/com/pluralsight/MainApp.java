package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int width, height, choice, thickness, x, y,sideLength,hypotnuse;
        double radius;
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




        //decision structure based on shape


        switch (choice) {
            case 1:
                System.out.print("What is the length of each side: ");
                sideLength = keyboard.nextInt();
                Square square = new Square(turtle, location,getColor(tempColor),thickness,sideLength);
                square.paint();
                break;
            case 2:
                System.out.print("What is the radius? ");
                radius = keyboard.nextDouble();
                keyboard.nextLine();
                Circle circle = new Circle(turtle,location,getColor(tempColor),thickness,radius);
                circle.paint();
                break;
            case 3:
                System.out.print("What is the hypotnuse?");
                hypotnuse = keyboard.nextInt();
                keyboard.nextLine();
                Triangle triangle = new Triangle(turtle,location,getColor(tempColor),thickness,hypotnuse);
                triangle.paint();
        }


    }



    //decision structure based on color
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