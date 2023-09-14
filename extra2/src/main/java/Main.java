import entities.Building;
import entities.OfficeBuilding;
import entities.SportsCenter;
import enums.Type;
import services.BuildingService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BuildingService bs = new BuildingService();
        ArrayList<Building> buildings = new ArrayList<>();

        buildings.add(bs.createSportCenter(45.0, 2.7, 90.0, "Soccer Field", Type.OPEN));
        buildings.add(bs.createSportCenter(15.24, 3.05, 28.65, "Basketball Court", Type.COVERED));
        buildings.add(bs.createOfficeBuilding(750, 15, 300, 10, 25));
        buildings.add(bs.createOfficeBuilding(350, 7, 100, 5, 15));

        buildings.forEach(building -> {
            if (building instanceof SportsCenter) {
                System.out.println(((SportsCenter) building).getName());
            }
            System.out.println("Surface= " + building.calculateSurface());
            System.out.println("Volume= " + building.calculateVolume());
            if (building instanceof SportsCenter) {
                System.out.println(((SportsCenter) building).getType().getPrettyString());
            } else if (building instanceof OfficeBuilding) {
                ((OfficeBuilding) building).peopleQuantity();
            }
            System.out.println();
        });

        int covered = 0;
        int open = 0;

        for (Building building : buildings) {
            if (building instanceof SportsCenter) {
                if (((SportsCenter) building).getType().equals(Type.COVERED)) {
                    covered++;
                } else if (((SportsCenter) building).getType().equals(Type.OPEN)) {
                    open++;
                }
            }
        }

        System.out.println("There are " + covered + " covered sport centers and " +  open + " open sport centers");
    }
}
