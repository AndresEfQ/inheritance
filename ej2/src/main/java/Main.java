import entities.*;
import enums.Color;
import enums.Consume;
import services.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        WashingMachineService wms = new WashingMachineService();
        WashingMachine wm = wms.createWashingMachine();
        System.out.println("A washing machine like " + wm.toString() + " costs " + wm.getPrice());

        TvService tvs = new TvService();
        Tv tv = tvs.createTv();
        System.out.println("A tv like " + tv.toString() + " costs " + tv.getPrice());
        */

        WashingMachineService wms = new WashingMachineService();
        TvService tvs = new TvService();

        ArrayList<Appliance> appliances = new ArrayList<>();

        appliances.add(wms.createWashingMachine(Color.BLUE, Consume.A, 18, 45));
        appliances.add(wms.createWashingMachine(Color.BLACK, Consume.C, 10, 25));
        appliances.add(tvs.createTv(Color.GREY, Consume.B, 15, 45, true));
        appliances.add(tvs.createTv(Color.BLACK, Consume.F, 35, 60, false));

        double washingMachinePrices = 0.0;
        double tvPrices = 0.0;

        appliances.forEach(appliance -> {
            if (appliance instanceof Tv) {
                tvs.finalPrice((Tv) appliance);
                System.out.println("TV " + appliance.getPrice());

            } else if (appliance instanceof WashingMachine) {
                wms.finalPrice((WashingMachine) appliance);
                System.out.println("Washing Machine " + appliance.getPrice());
            }
        });

        for (Appliance aux : appliances) {
            if (aux instanceof Tv) {
                tvPrices += aux.getPrice();
            } else if (aux instanceof WashingMachine) {
                washingMachinePrices += aux.getPrice();
            }
        }

        System.out.println("tvPrices = " + tvPrices);
        System.out.println("washingMachinePrices = " + washingMachinePrices);

        System.out.println("appliancePrices = " + (tvPrices + washingMachinePrices));
    }
}
