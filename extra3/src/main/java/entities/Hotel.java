package entities;

public class Hotel extends Accommodation {
    private int rooms;
    private int beds;
    private int floors;
    private Double price;

    public Hotel() {
    }

    public Hotel(String name, String address, String zone, String manager, int rooms, int beds, int floors) {
        super(name, address, zone, manager);
        this.rooms = rooms;
        this.beds = beds;
        this.floors = floors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double calculatePrice() {
        double price = 50 + (getBeds());
        setPrice(price);
        return price;
    }
}
