package services;

import entities.Rectangle;
import interfaces.FormCalcs;

import java.util.Scanner;

public class RectangleService implements FormCalcs {

    private final Scanner sc;
    private double rectangleHeight;
    private double rectangleWidth;

    public RectangleService() {
        sc = new Scanner(System.in);
    }

    public Rectangle createRectangle () {
        System.out.println("Insert the parameters of your rectangle");

        System.out.print("Height: ");
        rectangleHeight = Double.parseDouble(sc.nextLine());

        System.out.print("Width: ");
        rectangleWidth = Double.parseDouble(sc.nextLine());

        double area = calculateArea();
        double perimeter = calculatePerimeter();

        return new Rectangle(rectangleHeight, rectangleWidth, area, perimeter);
    }

    @Override
    public double calculateArea() {
        return rectangleHeight * rectangleWidth;
    }

    @Override
    public double calculatePerimeter() {
        return (rectangleHeight + rectangleWidth) * 2;
    }
}
