package entities;

import enums.Gym;

public class Hotel5 extends Hotel4 {
    private int conferenceRooms;
    private int suites;
    private int limousines;

    public Hotel5() {
    }

    public Hotel5(String name, String address, String zone, String manager, int rooms, int beds, int floors, Gym gym, String restaurantName, int restaurantCapacity, int conferenceRooms, int suites, int limousines) {
        super(name, address, zone, manager, rooms, beds, floors, gym, restaurantName, restaurantCapacity);
        this.conferenceRooms = conferenceRooms;
        this.suites = suites;
        this.limousines = limousines;
    }

    public int getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(int conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimousines() {
        return limousines;
    }

    public void setLimousines(int limousines) {
        this.limousines = limousines;
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice();
        price += (getLimousines() * 15);

        setPrice(price);
        return price;
    }
}
