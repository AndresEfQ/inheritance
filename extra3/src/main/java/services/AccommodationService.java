package services;

import entities.*;
import enums.Gym;

import java.util.ArrayList;
import java.util.Scanner;

import static utils.Comparators.compareHotelsByPriceDesc;

public class AccommodationService {

    private final Scanner sc;
    private final ArrayList<Accommodation> accommodations;

    public AccommodationService() {
        sc = new Scanner(System.in);
        accommodations = new ArrayList<>();
    }

    private void createAccommodation() {
        System.out.println("Insert the your preferred accommodation characteristics");
        System.out.println();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Zone: ");
        String zone = sc.nextLine();

        System.out.print("Manager: ");
        String manager = sc.nextLine();

        Accommodation accommodation = new Accommodation(name, address, zone, manager);

        System.out.println("Please choose the type of your accommodation");
        System.out.println("1. Hotel");
        System.out.println("2. Non hotel");
        System.out.println("0. Cancel");

        int op;
        do {
            op = Integer.parseInt(sc.nextLine());

            if (op < 0 || op > 2) {
                System.out.println("Invalid option, please try again");
            }
        } while (op < 0 || op > 2);

        Accommodation accommodationChild;
        switch (op) {
            case 1 -> accommodationChild = createHotel(accommodation);
            case 2 -> accommodationChild = createNonHotel(accommodation);
            default -> accommodationChild = null;
        }

        if (accommodationChild instanceof Hotel4) {
            ((Hotel4) accommodationChild).calculatePrice();
        }
        accommodations.add(accommodationChild);
    }

    private Hotel4 createHotel (Accommodation accommodation) {

        String name = accommodation.getName();
        String address = accommodation.getAddress();
        String zone = accommodation.getZone();
        String manager = accommodation.getManager();

        System.out.println("You selected Hotel, please choose the hotel characteristics");

        System.out.print("Number of rooms: ");
        int rooms = Integer.parseInt(sc.nextLine());

        System.out.print("Number of beds: ");
        int beds = Integer.parseInt(sc.nextLine());

        System.out.print("Number of floors: ");
        int floors = Integer.parseInt(sc.nextLine());

        Hotel hotel = new Hotel(name, address, zone, manager, rooms, beds, floors);

        System.out.println("Please select how many stars do you want in your hotel");
        System.out.println();
        System.out.println("1. 4 stars");
        System.out.println("2. 5 stars");
        System.out.println("0. Cancel");

        int hotelOp;
        do {
            hotelOp = Integer.parseInt(sc.nextLine());

            if (hotelOp < 0 || hotelOp > 2) {
                System.out.println("Invalid option, please try again");
            }
        } while (hotelOp < 0 || hotelOp > 2);

        if (hotelOp == 0) {
            return null;
        }

        Hotel4 hotelChild = createHotel4(hotel, hotelOp);

        if (hotelOp == 2) {
            hotelChild = createHotel5(hotelChild);
        }

        return hotelChild;
    }

    private Hotel4 createHotel4 (Hotel hotel, int hotelOp) {

        String name = hotel.getName();
        String address = hotel.getAddress();
        String zone = hotel.getZone();
        String manager = hotel.getManager();
        int rooms = hotel.getRooms();
        int beds = hotel.getBeds();
        int floors = hotel.getFloors();

        System.out.println("You selected " + (hotelOp + 3) + " stars, please choose the hotel characteristics");

        System.out.print("Gym class (A/B): ");
        char gymOp;
        do {
            gymOp = sc.nextLine().charAt(0);
            if (gymOp != 'A' && gymOp != 'B') {
                System.out.println("Invalid option, please choose 'A' or 'B'");
            }
        } while (gymOp != 'A' && gymOp != 'B');

        Gym gym = gymOp == 'A' ? Gym.A : Gym.B;

        System.out.print("Restaurant name: ");
        String restaurantName = sc.nextLine();

        System.out.print("Restaurant capacity: ");
        int restaurantCapacity = Integer.parseInt(sc.nextLine());

        return new Hotel4(name, address, zone, manager, rooms, beds, floors, gym, restaurantName, restaurantCapacity);
    }

    public void addHotel4(String name, String address, String zone, String manager, int rooms, int beds, int floors, Gym gym, String restaurantName, int restaurantCapacity) {
        Hotel4 hotel4 = new Hotel4(name, address, zone, manager, rooms, beds, floors, gym, restaurantName, restaurantCapacity);
        hotel4.calculatePrice();
        accommodations.add(hotel4);
    }

    private Hotel5 createHotel5(Hotel4 hotel) {
        String name = hotel.getName();
        String address = hotel.getAddress();
        String zone = hotel.getZone();
        String manager = hotel.getManager();
        int rooms = hotel.getRooms();
        int beds = hotel.getBeds();
        int floors = hotel.getFloors();
        Gym gym = hotel.getGym();
        String restaurantName = hotel.getRestaurantName();
        int restaurantCapacity = hotel.getRestaurantCapacity();

        System.out.print("Number of conference rooms: ");
        int conferenceRooms = Integer.parseInt(sc.nextLine());

        System.out.print("Number of suites: ");
        int suites = Integer.parseInt(sc.nextLine());

        System.out.print("Number of limousines: ");
        int limousines = Integer.parseInt(sc.nextLine());

        return new Hotel5(name, address, zone, manager, rooms, beds, floors, gym, restaurantName, restaurantCapacity, conferenceRooms, suites, limousines);
    }

    public void addHotel5(String name, String address, String zone, String manager, int rooms, int beds, int floors, Gym gym, String restaurantName, int restaurantCapacity, int conferenceRooms, int suites, int limousines) {
        Hotel5 hotel5 = new Hotel5(name, address, zone, manager, rooms, beds, floors, gym, restaurantName, restaurantCapacity, conferenceRooms, suites, limousines);
        hotel5.calculatePrice();
        accommodations.add(hotel5);
    }

    private NonHotel createNonHotel (Accommodation accommodation) {
        String name = accommodation.getName();
        String address = accommodation.getAddress();
        String zone = accommodation.getZone();
        String manager = accommodation.getManager();

        System.out.println("You selected non hotel, please choose the non hotel characteristics");
        System.out.println();
        System.out.print("Is your accommodation private? (Y/N): ");
        char isPrivate;
        do {
            isPrivate = sc.nextLine().charAt(0);
            if (isPrivate != 'Y' && isPrivate != 'N') {
                System.out.println("Invalid option, please choose 'Y' or 'N'");
            }
        } while (isPrivate != 'Y' && isPrivate != 'N');
        boolean privacy = isPrivate == 'Y';

        System.out.print("Size in meters of your accommodation: ");
        double size = Double.parseDouble(sc.nextLine());

        NonHotel nonHotel = new NonHotel(name, address, zone, manager, privacy, size);

        System.out.println("Choose the type of non hotel accommodation.");
        System.out.println();
        System.out.println("1. Camping");
        System.out.println("2. Hostel");
        System.out.println("0. Cancel");
        int nonHotelOp;
        do {
            nonHotelOp = Integer.parseInt(sc.nextLine());
            if (nonHotelOp < 0 || nonHotelOp > 2) {
                System.out.println("Invalid option, please choose 1 or 2");
            }
        } while (nonHotelOp < 0 || nonHotelOp > 2);

        NonHotel nonHotelChild;
        switch (nonHotelOp) {
            case 1 -> nonHotelChild = createCamping(nonHotel);
            case 2 -> nonHotelChild = createHostel(nonHotel);
            default -> nonHotelChild = null;
        }

        return nonHotelChild;
    }

    private Camping createCamping (NonHotel nonHotel) {
        String name = nonHotel.getName();
        String address = nonHotel.getAddress();
        String zone = nonHotel.getZone();
        String manager = nonHotel.getManager();
        boolean isPrivate = nonHotel.isPrivate();
        double size = nonHotel.getSize();

        System.out.println("You selected camping. Please choose the camping characteristics");
        System.out.println();

        System.out.print("Maximum number of tents: ");
        int maxTents = Integer.parseInt(sc.nextLine());

        System.out.println("Number of toilets: ");
        int toilets = Integer.parseInt(sc.nextLine());

        System.out.print("Does the camping have a restaurant? (Y/N): ");
        char restaurantOp;
        do {
            restaurantOp = sc.nextLine().charAt(0);
            if (restaurantOp != 'Y' && restaurantOp != 'N') {
                System.out.println("Invalid option, please choose 'Y' or 'N'");
            }
        } while (restaurantOp != 'Y' && restaurantOp != 'N');
        boolean hasRestaurant = restaurantOp == 'Y';

        return new Camping(name, address, zone, manager, isPrivate, size, maxTents, toilets, hasRestaurant);
    }

    public void addCamping(String name, String address, String zone, String manager, boolean isPrivate, int size, int maxTents, int toilets, boolean hasRestaurant) {
        accommodations.add(new Camping(name, address, zone, manager, isPrivate, size, maxTents, toilets, hasRestaurant));
    }

    private Hostel createHostel (NonHotel nonHotel) {
        String name = nonHotel.getName();
        String address = nonHotel.getAddress();
        String zone = nonHotel.getZone();
        String manager = nonHotel.getManager();
        boolean isPrivate = nonHotel.isPrivate();
        double size = nonHotel.getSize();

        System.out.println("You selected hostel. Please choose the hostel characteristics");
        System.out.println();

        System.out.print("Number of rooms: ");
        int rooms = Integer.parseInt(sc.nextLine());

        System.out.print("Does the hostel have discount for guilds? (Y/N): ");
        char guildDiscountOp;
        do {
            guildDiscountOp = sc.nextLine().charAt(0);
            if (guildDiscountOp != 'Y' && guildDiscountOp != 'N') {
                System.out.println("Invalid option, please choose 'Y' or 'N'");
            }
        } while (guildDiscountOp != 'Y' && guildDiscountOp != 'N');
        boolean hasGuildDiscount = guildDiscountOp == 'Y';

        System.out.print("Does the hostel have a sports center? (Y/N): ");
        char sportCenterOp;
        do {
            sportCenterOp = sc.nextLine().charAt(0);
            if (sportCenterOp != 'Y' && sportCenterOp != 'N') {
                System.out.println("Invalid option, please choose 'Y' or 'N'");
            }
        } while (sportCenterOp != 'Y' && sportCenterOp != 'N');
        boolean hasSportCenter = sportCenterOp == 'Y';

        return new Hostel(name, address, zone, manager, isPrivate, size, rooms, hasGuildDiscount, hasSportCenter);
    }

    public void addHostel(String name, String address, String zone, String manager, boolean isPrivate, int size, int rooms, boolean hasGuildDiscount, boolean hasSportCenter) {
         accommodations.add(new Hostel(name, address, zone, manager, isPrivate, size, rooms, hasGuildDiscount, hasSportCenter));
    }

    public void showMenu () {
        System.out.println("Welcome, please choose an option");
        int op;
        do {
            System.out.println();
            System.out.println("1. Show all accommodations");
            System.out.println("2. Show all hotels by price");
            System.out.println("3. Show all camping with restaurant");
            System.out.println("4. Show all hostels with guild discount");
            System.out.println("5. Add new accommodation");
            System.out.println("0. Exit");

            do {
                op = Integer.parseInt(sc.nextLine());
                if (op < 0 || op > 5) {
                    System.out.println("Invalid option, please choose between 0 and 5");
                }
            } while (op < 0 || op > 5);

            switch (op) {
                case 1 -> showAllAccommodations();
                case 2 -> showAllHotelsByPrice();
                case 3 -> showAllCampingWithRestaurant();
                case 4 -> showAllHostelsWithDiscount();
                case 5 -> createAccommodation();
                default -> System.out.println("Bye");
            }
        } while (op != 0);
    }

    private void showAllAccommodations() {
        accommodations.forEach(System.out::println);
    }


    private void showAllHotelsByPrice() {
        ArrayList<Hotel> hotels = new ArrayList<>();
        accommodations.forEach(accommodation -> {
            if (accommodation instanceof Hotel) {
                hotels.add((Hotel) accommodation);
            }
        });
        hotels.sort(compareHotelsByPriceDesc);
        hotels.forEach(System.out::println);
    }

    private void showAllCampingWithRestaurant() {
        for (Accommodation aux : accommodations) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isHasRestaurant()) {
                    System.out.println(aux);
                }
            }
        }
    }

    private void showAllHostelsWithDiscount() {
        for (Accommodation aux : accommodations) {
            if (aux instanceof Hostel) {
                if (((Hostel) aux).isHasGuildDiscount()) {
                    System.out.println(aux);
                }
            }

        }
    }
}
