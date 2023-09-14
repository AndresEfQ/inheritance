package services;

import entities.Rent;
import entities.Ship;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class RentService {

    private final Scanner sc;
    private final ShipService ss;
    private final ArrayList<Rent> rents;
    private final ArrayList<Ship> ships;

    public RentService() {
        sc = new Scanner(System.in);
        ss = new ShipService();
        rents = new ArrayList<>();
        ships = new ArrayList<>();
    }

    public void createRent() {
        System.out.println("Please insert the rent data");

        System.out.print("Client name: ");
        String clientName = sc.nextLine();

        System.out.print("Client document: ");
        Long clientDocument = Long.parseLong(sc.nextLine());

        System.out.print("Rent date: ");
        LocalDate rentDate = getDate();

        System.out.print("Return date: ");
        LocalDate returnDate = getDate();

        System.out.print("Position: ");
        String position = sc.nextLine();

        System.out.println("Choose a ship");
        Ship ship = getShip();

        Rent rent = new Rent(clientName, clientDocument, rentDate, returnDate, position, ship);

        double cost = rentDate.until(returnDate).getDays() * ship.calculateModulo();
        rent.setCost(cost);
        System.out.println("The ship's space cost is $" + cost);
        rents.add(rent);
    }

    public void createRent (String clientName, Long clientDocument, LocalDate rentDate, LocalDate returnDate, String position, Ship ship) {
        Rent rent = new Rent(clientName, clientDocument, rentDate, returnDate, position, ship);

        double cost = rentDate.until(returnDate).getDays() * ship.calculateModulo();
        rent.setCost(cost);
        System.out.println("The ship's space cost is $" + cost);
        rents.add(rent);
    }

    private void createShip () {
        Ship ship = ss.createShip();
        ships.add(ship);
    }

    private LocalDate getDate () {
        System.out.println("Insert date");

        System.out.print("Day: ");
        int day = Integer.parseInt(sc.nextLine());

        System.out.print("Month: ");
        int month = Integer.parseInt(sc.nextLine());

        System.out.print("Year: ");
        int year = Integer.parseInt(sc.nextLine());

        return LocalDate.of(year, month, day);
    }

    public Ship getShip () {
        int counter = 1;
        for (Ship ship : ships) {
            System.out.println(counter + ". " + ship);
            counter++;
        }
        int op;
        do {
            op = Integer.parseInt(sc.nextLine());

            if (op < 1 || op > ships.size() + 1) {
                System.out.println("Invalid option, please try again");
            }
        } while (op < 1 || op > ships.size() + 1);

        return ships.remove(op - 1);
    }

    private void showAllRents () {
        rents.forEach(rent -> System.out.println(rent));
    }

    public void showMenu () {

        int op;
        do {
            do {
                System.out.println("Please choose an option");
                System.out.println();
                System.out.println("1. Create Ship");
                System.out.println("2. Rent Ship");
                System.out.println("3. Show all rents");
                System.out.println("0. Exit");
                op = Integer.parseInt(sc.nextLine());

                if (op < 0 || op > 3) {
                    System.out.println("Invalid option, please try again");
                }
            } while (op < 0 || op > 3);

            switch (op) {
                case 1 -> createShip();
                case 2 -> createRent();
                case 3 -> showAllRents();
                case 0 -> System.out.println("Bye...");
            }
        } while (op != 0);
    }

}