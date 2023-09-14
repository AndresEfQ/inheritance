package entities;

public abstract class Building {

    private double width;
    private double height;
    private double depth;

    public Building() {
    }

    public Building(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double dept) {
        this.depth = dept;
    }

    public abstract double calculateSurface();
    public abstract double calculateVolume();
}
