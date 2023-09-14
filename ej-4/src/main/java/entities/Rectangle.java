package entities;

public class Rectangle {

    private double height;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle() {
    }

    public Rectangle(double height, double width, double area, double perimeter) {
        this.height = height;
        this.width = width;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
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
        return "Rectangle { area: " + getArea() + ", perimeter: " + getPerimeter() + " }";
    }
}
