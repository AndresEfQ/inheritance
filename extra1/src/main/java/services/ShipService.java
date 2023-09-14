package services;

import entities.Motorboat;
import entities.SailingShip;
import entities.Ship;
import entities.Yacht;

import java.util.Scanner;

public class ShipService {

    private final Scanner sc;

    public ShipService() {
        sc = new Scanner(System.in);
    }

    public Ship createShip () {
        System.out.println("Please enter the characteristics of your ship");

        System.out.println("Type of ship:");
        System.out.println();
        System.out.println("1. Sailing Ship");
        System.out.println("2. Motorboat");
        System.out.println("3. Yacht");

        int op;
        do {
            op = Integer.parseInt(sc.nextLine());
            if (op < 1 || op > 3) {
                System.out.println("Invalid option, try again");
            }
        } while (op < 1 || op > 3);

        System.out.print("Ship ID Number: ");
        String id = sc.nextLine();

        System.out.print("Ship size in meters: ");
        int size = Integer.parseInt(sc.nextLine());

        System.out.print("Ship fabrication year: ");
        int year = Integer.parseInt(sc.nextLine());

        Ship parentShip = new Ship(id, size, year);
        Ship ship;

        switch (op) {
            case 1 -> ship = createSailingShip(parentShip);
            case 2 -> ship = createMotorBoat(parentShip);
            case 3 -> ship = createYacht(parentShip);
            default -> ship = null;
        }

        return ship;
    }

    private Ship createSailingShip (Ship ship) {
        System.out.print("Number of masts: ");
        int masts = Integer.parseInt(sc.nextLine());

        return new SailingShip(ship.getId(), ship.getSize(), ship.getFabricationYear(), masts);
    }

    private Ship createMotorBoat (Ship ship) {
        System.out.print("Motorboat power in CV: ");
        int cv = Integer.parseInt(sc.nextLine());

        return new Motorboat(ship.getId(), ship.getSize(), ship.getFabricationYear(), cv);
    }

    private Ship createYacht (Ship ship) {
        System.out.print("Yacht power in CV: ");
        int cv = Integer.parseInt(sc.nextLine());

        System.out.print("Number of cabins: ");
        int cabins = Integer.parseInt(sc.nextLine());

        return new Yacht(ship.getId(), ship.getSize(), ship.getFabricationYear(), cv, cabins);
    }

}
