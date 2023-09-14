package entities;

public class OfficeBuilding extends Building{

    private int officeNumber;
    private int personsPerOffice;
    private int floors;

    public OfficeBuilding(double width, double height, double depth, int officeNumber, int personsPerOffice, int floors) {
        super(width, height, depth);
        this.officeNumber = officeNumber;
        this.personsPerOffice = personsPerOffice;
        this.floors = floors;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public int getPersonsPerOffice() {
        return personsPerOffice;
    }

    public void setPersonsPerOffice(int personsPerOffice) {
        this.personsPerOffice = personsPerOffice;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public double calculateSurface() {
        double surface = getWidth() * getDepth() * getFloors();
        return (double)(Math.round(surface * 100)) / 100;
    }

    @Override
    public double calculateVolume() {
        double volume = getWidth() * getDepth() * getHeight();
        return (double)(Math.round(volume * 100)) / 100;
    }

    public void peopleQuantity() {

        int totalPeople = getPersonsPerOffice() * getFloors();

        System.out.println("This office building supports " + totalPeople + " people in total, " + getPersonsPerOffice() + " people per office in " + getFloors() + " floors (there's one office in each floor)");
    }
}
