import enums.Gym;
import services.AccommodationService;

public class Main {
    public static void main(String[] args) {

        AccommodationService as = new AccommodationService();

        as.addHotel4("El guerrero", "Avenida 5ta", "Rosa", "Joaquin", 25, 50, 5, Gym.B, "Cafetería de Rosa", 20);
        as.addHotel4("El guerrero2", "Avenida 4ta", "Poblado", "Joaquin", 25, 60, 5, Gym.B, "Cafetería de Rosa", 20);
        as.addHotel4("El guerrero3", "Avenida 4ta", "Bello", "Joaquin", 25, 75, 5, Gym.B, "Cafetería de Rosa", 20);
        as.addHotel5("Luxor", "Calle falsa 123", "Centro", "Rodolfo", 125, 250, 16, Gym.A, "Ohh Lala", 35, 7, 5, 10);
        as.addCamping("Rio Claro", "Rio Claro", "Caldas", "Enrique", false, 500, 70, 15, false);
        as.addCamping("Rio Claro2", "Rio Claro2", "Caldas", "Enrique", false, 500, 70, 15, true);
        as.addCamping("Rio Claro3", "Rio Claro3", "Caldas", "Enrique", false, 500, 70, 15, true);
        as.addCamping("Rio Claro4", "Rio Claro4", "Caldas", "Enrique", false, 500, 70, 15, false);
        as.addCamping("Rio Claro5", "Rio Claro5", "Caldas", "Enrique", false, 500, 70, 15, false);
        as.addHostel("Lollis HomeStay", "BorsbergStrasse 9", "NewStadt", "Julie", false, 200, 25, false, false);
        as.addHostel("Lollis HomeStay2", "BorsbergStrasse 9", "NewStadt", "Julie", false, 200, 25, true, false);
        as.addHostel("Lollis HomeStay3", "BorsbergStrasse 9", "NewStadt", "Julie", false, 200, 25, false, false);
        as.addHostel("Lollis HomeStay4", "BorsbergStrasse 9", "NewStadt", "Julie", false, 200, 25, true, false);
        as.addHostel("Lollis HomeStay5", "BorsbergStrasse 9", "NewStadt", "Julie", false, 200, 25, false, false);

        as.showMenu();

    }
}
