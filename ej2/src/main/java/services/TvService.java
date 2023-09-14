package services;

import entities.Tv;
import entities.Appliance;
import enums.Color;
import enums.Consume;

import java.util.Scanner;

public class TvService extends ApplianceService {

    private final Scanner sc;

    public TvService() {
        sc = new Scanner(System.in);
    }

    public void finalPrice (Tv tv) {
        super.finalPrice(tv);
        if (tv.getResolution() > 40) {
            tv.setPrice(tv.getPrice() * 1.3);
        }
        if (tv.hasTdt()) {
            tv.setPrice(tv.getPrice() + 500);
        }
    }

    public Tv createTv () {

        System.out.println("What are the specs for the tv you want");
        Appliance appliance = super.createAppliance();

        System.out.print("Resolution: ");
        int resolution = Integer.parseInt(sc.nextLine());

        char op;
        do {
            System.out.println("Do you want TDT? (y/n)");
            op = sc.nextLine().charAt(0);

            if (op != 'y' && op != 'n') {
                System.out.println("Invalid option, select 'y' or 'n'");
            }
        } while (op != 'y' && op != 'n');

        boolean tdt = op == 'y';

        Tv tv = new Tv(appliance.getColor(), appliance.getConsume(), appliance.getWeight(), resolution, tdt);

        finalPrice(tv);

        return tv;
    }

    public Tv createTv (Color color, Consume consume, int weight, int resolution, boolean hasTdt) {
        return new Tv (color, consume, weight, resolution, hasTdt);
    }
}
