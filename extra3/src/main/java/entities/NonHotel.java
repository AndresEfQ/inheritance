package entities;

public class NonHotel extends Accommodation {

    protected boolean isPrivate;
    protected double size;

    public NonHotel() {
    }

    public NonHotel(String name, String address, String zone, String manager, boolean isPrivate, double size) {
        super(name, address, zone, manager);
        this.isPrivate = isPrivate;
        this.size = size;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
