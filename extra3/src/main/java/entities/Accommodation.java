package entities;

public class Accommodation {
    protected String name;
    protected String address;
    protected String zone;
    protected String manager;

    public Accommodation() {
    }

    public Accommodation(String name, String address, String zone, String manager) {
        this.name = name;
        this.address = address;
        this.zone = zone;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", address='" + address + '\'' +
                (this instanceof Hotel ? ", price='" + ((Hotel) this).getPrice() + '\'' : "");
    }
}
