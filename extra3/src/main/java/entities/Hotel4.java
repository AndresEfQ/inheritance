package entities;

import enums.Gym;

public class Hotel4 extends Hotel {
    private Gym gym;
    private String restaurantName;
    private int restaurantCapacity;

    public Hotel4() {
    }

    public Hotel4(String name, String address, String zone, String manager, int rooms, int beds, int floors, Gym gym, String restaurantName, int restaurantCapacity) {
        super(name, address, zone, manager, rooms, beds, floors);
        this.gym = gym;
        this.restaurantName = restaurantName;
        this.restaurantCapacity = restaurantCapacity;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getRestaurantCapacity() {
        return restaurantCapacity;
    }

    public void setRestaurantCapacity(int restaurantCapacity) {
        this.restaurantCapacity = restaurantCapacity;
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice();
        if (getRestaurantCapacity() < 30) {
            price += 10;
        } else if (price < 50) {
            price += 30;
        } else {
            price += 50;
        }

        if (getGym().equals(Gym.A)) {
            price += 50;
        } else {
            price += 30;
        }

        setPrice(price);
        return price;
    }
}
