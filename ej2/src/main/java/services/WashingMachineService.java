package services;

import entities.WashingMachine;
import entities.Appliance;
import enums.Color;
import enums.Consume;

import java.util.Scanner;

public class WashingMachineService extends ApplianceService {

    private final Scanner sc;

    public WashingMachineService() {
        sc = new Scanner(System.in);
    }

    public void finalPrice (WashingMachine washingMachine) {
        super.finalPrice(washingMachine);
        if (washingMachine.getLoad() > 30) {
            washingMachine.setPrice(washingMachine.getPrice() + 500);
        }
    }

    public WashingMachine createWashingMachine () {

        System.out.println("What are the specs for the washing machine you want");
        Appliance appliance = super.createAppliance();

        System.out.print("Load: ");
        int load = Integer.parseInt(sc.nextLine());

        WashingMachine washingMachine = new WashingMachine(appliance.getColor(), appliance.getConsume(), appliance.getWeight(), load);

        finalPrice(washingMachine);

        return washingMachine;
    }

    public WashingMachine createWashingMachine (Color color, Consume consume, int weight, int load) {
        return new WashingMachine(color, consume, weight, load);
    }
}
