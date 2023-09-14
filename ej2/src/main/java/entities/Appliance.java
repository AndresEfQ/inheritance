package entities;

import enums.Color;
import enums.Consume;

public class Appliance {

    protected double price;
    protected Color color;
    protected Consume consume;
    protected int weight;

    public Appliance() {
    }

    public Appliance(Color color, Consume consume, int weight) {
        this.color = color;
        this.consume = consume;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Consume getConsume() {
        return consume;
    }

    public void setConsume(Consume consume) {
        this.consume = consume;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
