package entities;

public class Hostel extends NonHotel {

    private int rooms;
    private boolean hasGuildDiscount;
    private boolean hasSportsCenter;

    public Hostel() {
    }

    public Hostel(String name, String address, String zone, String manager, boolean isPrivate, double size, int rooms, boolean hasGuildDiscount, boolean hasSportsCenter) {
        super(name, address, zone, manager, isPrivate, size);
        this.rooms = rooms;
        this.hasGuildDiscount = hasGuildDiscount;
        this.hasSportsCenter = hasSportsCenter;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isHasGuildDiscount() {
        return hasGuildDiscount;
    }

    public void setHasGuildDiscount(boolean hasGuildDiscount) {
        this.hasGuildDiscount = hasGuildDiscount;
    }

    public boolean isHasSportsCenter() {
        return hasSportsCenter;
    }

    public void setHasSportsCenter(boolean hasSportsCenter) {
        this.hasSportsCenter = hasSportsCenter;
    }
}
