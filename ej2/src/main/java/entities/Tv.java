package entities;

import enums.Color;
import enums.Consume;

public class Tv extends Appliance {

    private int resolution;
    private boolean tdt;

    public Tv() {
    }

    public Tv(Color color, Consume consume, int weight, int resolution, boolean tdt) {
        super(color, consume, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean hasTdt() {
        return tdt;
    }

    public void setHasTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "resolution=" + resolution +
                ", tdt=" + tdt +
                ", price=" + price +
                ", color=" + color +
                ", consume=" + consume +
                ", weight=" + weight +
                '}';
    }
}
