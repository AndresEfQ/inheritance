package services;

import entities.Circle;
import interfaces.FormCalcs;

import java.util.ArrayList;
import java.util.Scanner;

public class CircleService implements FormCalcs {

    private final Scanner sc;
    private double circleRadius;

    public CircleService() {
        sc = new Scanner(System.in);
    }

    public Circle createCircle () {
        System.out.println("What's the radius of your circle");
        circleRadius = Double.parseDouble(sc.nextLine());
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        return new Circle(circleRadius, area, perimeter);
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(circleRadius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * circleRadius;
    }
}
