package entities;

public class Yacht extends Ship {

    private int cvPower;
    private int cabinsAmount;

    public Yacht() {
    }

    public Yacht(String id, int size, int fabricationYear, int cvPower, int cabinsAmount) {
        super(id, size, fabricationYear);
        this.cvPower = cvPower;
        this.cabinsAmount = cabinsAmount;
    }

    public int getCvPower() {
        return cvPower;
    }

    public void setCvPower(int cvPower) {
        this.cvPower = cvPower;
    }

    public int getCabinsAmount() {
        return cabinsAmount;
    }

    public void setCabinsAmount(int cabinsAmount) {
        this.cabinsAmount = cabinsAmount;
    }

    public int calculateModulo () {
        return super.calculateModulo() + getCvPower() + getCabinsAmount();
    }

    @Override
    public String toString() {
        return "Yacht { id=" + super.getId() + ", cvPower=" + cvPower + ", cabinsAmount=" + cabinsAmount + "}";
    }
}
