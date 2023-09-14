package entities;

import enums.Type;

public class SportsCenter extends Building {

    private String name;
    private Type type;

    public SportsCenter(double width, double height, double depth, String name, Type type) {
        super(width, height, depth);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public double calculateSurface() {
        double surface = getWidth() * getDepth();
        return (double)(Math.round(surface * 100)) / 100;
    }

    @Override
    public  double calculateVolume() {
        double volume = getHeight() * getWidth() * getDepth();
        return (double)(Math.round(volume * 100)) / 100;
    }
}
