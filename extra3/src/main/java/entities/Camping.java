package entities;

public class Camping extends NonHotel {

    private int maxTents;
    private int toilets;
    private boolean hasRestaurant;

    public Camping() {
    }

    public Camping(String name, String address, String zone, String manager, boolean isPrivate, double size, int maxTents, int toilets, boolean hasRestaurant) {
        super(name, address, zone, manager, isPrivate, size);
        this.maxTents = maxTents;
        this.toilets = toilets;
        this.hasRestaurant = hasRestaurant;
    }

    public int getMaxTents() {
        return maxTents;
    }

    public void setMaxTents(int maxTents) {
        this.maxTents = maxTents;
    }

    public int getToilets() {
        return toilets;
    }

    public void setToilets(int toilets) {
        this.toilets = toilets;
    }

    public boolean isHasRestaurant() {
        return hasRestaurant;
    }

    public void setHasRestaurant(boolean hasRestaurant) {
        this.hasRestaurant = hasRestaurant;
    }
}
