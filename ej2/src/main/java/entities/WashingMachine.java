package entities;

import enums.*;

public class WashingMachine extends Appliance {

    private int load;

    public WashingMachine() {
    }

    public WashingMachine(Color color, Consume consume, int weight, int load) {
        super(color, consume, weight);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "load=" + load +
                ", price=" + price +
                ", color=" + color +
                ", consume=" + consume +
                ", weight=" + weight +
                '}';
    }
}
