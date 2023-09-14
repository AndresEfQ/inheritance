package entities;

public class Motorboat extends Ship {

    private int cvPower;

    public Motorboat() {
    }

    public Motorboat(String id, int size, int fabricationYear, int cvPower) {
        super(id, size, fabricationYear);
        this.cvPower = cvPower;
    }

    public int getCvPower() {
        return cvPower;
    }


    public void setCvPower(int cvPower) {
        this.cvPower = cvPower;
    }

    public int calculateModulo () {
        return super.calculateModulo() + getCvPower();
    }

    @Override
    public String toString() {
        return "Motorboat { id=" + super.getId() + ", cvPower=" + cvPower + " }";
    }
}
