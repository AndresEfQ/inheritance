package services;

import entities.Building;
import entities.OfficeBuilding;
import entities.SportsCenter;
import enums.Type;

import java.util.Scanner;

public class BuildingService {

    private final Scanner sc;

    public BuildingService() {
        sc = new Scanner(System.in);
    }

    public Building createBuilding() {
        System.out.println("Welcome, please choose the characteristics of your building");
        System.out.println();
        System.out.println("Building Type");
        System.out.println("1. Sports Center");
        System.out.println("2. Office Building");
        System.out.println("0. Cancel");

        int op;
        do {
            op = Integer.parseInt(sc.nextLine());
            if (op < 0 || op > 2) {
                System.out.println("Invalid option, please choose again");
            }
        } while (op < 0 || op > 2);

        Building building;
        switch (op) {
            case 1 -> building = createSportsCenter();
            case 2 -> building = createOfficeBuilding();
            default -> building = null;
        }
        return building;
    }

    private Building createSportsCenter() {
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.print("Width: ");
        double width = Integer.parseInt(sc.nextLine());

        System.out.print("Height: ");
        double height = Integer.parseInt(sc.nextLine());

        System.out.print("Depth: ");
        double depth = Integer.parseInt(sc.nextLine());

        System.out.println("Is it covered (c) or opened (o)");
        char typeOp;
        do {
            typeOp = sc.nextLine().charAt(0);

            if (typeOp != 'c' && typeOp != 'o') {
                System.out.println("Invalid option, please choose 'o' or 'c'");
            }
        } while (typeOp != 'c' && typeOp != 'o');

        Type type = typeOp == 'c' ? Type.COVERED : Type.OPEN;

        return new SportsCenter(width, height, depth, name, type);
    }

    public Building createSportCenter(double width, double height, double depth, String name, Type type) {
        return new SportsCenter(width, height, depth, name, type);
    }

    private Building createOfficeBuilding() {

        System.out.print("Width: ");
        double width = Integer.parseInt(sc.nextLine());

        System.out.print("Height: ");
        double height = Integer.parseInt(sc.nextLine());

        System.out.print("Depth: ");
        double depth = Integer.parseInt(sc.nextLine());

        System.out.print("Offices/floors number: ");
        int officeNumber = Integer.parseInt(sc.nextLine());

        System.out.print("How many people is every office able to support? ");
        int peoplePerOffice = Integer.parseInt(sc.nextLine());

        return new OfficeBuilding(width, height, depth, officeNumber, peoplePerOffice, officeNumber);
    }

    public Building createOfficeBuilding(double width, double height, double depth, int officeNumber, int peoplePerOffice) {
        return new OfficeBuilding(width, height, depth, officeNumber, peoplePerOffice, officeNumber);
    }
}
