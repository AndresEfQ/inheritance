package entities;

public class SailingShip extends Ship {

    private int mastNumber;

    public SailingShip() {
    }

    public SailingShip(String id, int size, int fabricationYear, int mastNumber) {
        super(id, size, fabricationYear);
        this.mastNumber = mastNumber;
    }

    public int getMastNumber() {
        return mastNumber;
    }

    public void setMastNumber(int mastNumber) {
        this.mastNumber = mastNumber;
    }

    public int calculateModulo () {
        return super.calculateModulo() + getMastNumber();
    }

    @Override
    public String toString() {
        return "SailingShip { id=" + super.getId() + ", mastNumber=" + mastNumber + " }";
    }
}
