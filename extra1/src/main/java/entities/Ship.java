package entities;

public class Ship {


    private String id;
    private int size;
    private int fabricationYear;

    public Ship() {
    }

    public Ship(String id, int size, int fabricationYear) {
        this.id = id;
        this.size = size;
        this.fabricationYear = fabricationYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public int calculateModulo () {
        return 10 * getSize();
    }

}
