package services;

import entities.Appliance;
import enums.*;
import java.util.Scanner;

public class ApplianceService {

    private final Scanner sc;

    public ApplianceService() {
        sc = new Scanner(System.in);
    }

    protected Consume checkElectricConsume(char letter) {
        for (Consume aux : Consume.values()) {
            if (aux.toString().equalsIgnoreCase(String.valueOf(letter))) {
                return aux;
            }
        }
        return Consume.F;
    }

    protected Color checkColor(String color) {
        for (Color aux : Color.values()) {
            if (aux.getPretty().equalsIgnoreCase(color)) {
                return aux;
            }
        }
        return Color.WHITE;
    }

    protected void finalPrice (Appliance appliance) {
        Consume consume = appliance.getConsume();
        int weight = appliance.getWeight();
        double price = 1000d;

        switch (consume.name()) {
            case "A" -> price += 1000;
            case "B" -> price += 800;
            case "C" -> price += 600;
            case "D" -> price += 500;
            case "E" -> price += 300;
            case "F" -> price += 100;
        }

        if (weight >= 1 && weight <= 19) {
            price += 100;
        } else if (weight >= 20 && weight <= 49) {
            price += 500;
        } else if (weight >= 50 && weight <= 79) {
            price += 800;
        } else if (weight > 80) {
            price += 1000;
        }

        appliance.setPrice(price);
    }

    protected Appliance createAppliance () {

        System.out.print("Consume: ");
        char consume = sc.nextLine().charAt(0);
        Consume validConsume = checkElectricConsume(consume);

        System.out.print("Color: ");
        String color = sc.nextLine();
        Color validColor = checkColor(color);

        System.out.print("Weight: ");
        int weight = Integer.parseInt(sc.nextLine());

        Appliance newAppliance = new Appliance(validColor, validConsume, weight);

        finalPrice(newAppliance);

        return newAppliance;
    }

    protected Appliance createAppliance (Color color, Consume consume, int weight) {
        return new Appliance(color, consume, weight);
    }
}
