package entities;

import java.time.LocalDate;

public class Rent {

    private String clientName;
    private long clientDocument;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private String position;
    private Ship ship;
    private double cost;

    public Rent() {
    }

    public Rent(String clientName, long clientDocument, LocalDate rentDate, LocalDate returnDate, String position, Ship ship) {
        this.clientName = clientName;
        this.clientDocument = clientDocument;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.position = position;
        this.ship = ship;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public long getClientDocument() {
        return clientDocument;
    }

    public void setClientDocument(long clientDocument) {
        this.clientDocument = clientDocument;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Rent { " +
                "ship=" + ship +
                ", cost=" + cost +
                '}';
    }
}
