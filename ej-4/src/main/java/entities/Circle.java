package entities;

import interfaces.FormCalcs;

public class Circle {

    private double radius;
    private double area;
    private double perimeter;

    public Circle() {
    }

    public Circle(double radius, double area, double perimeter) {
        this.radius = radius;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Circle { area: " + getArea() + ", perimeter: " + getPerimeter() + " }";
    }
}
