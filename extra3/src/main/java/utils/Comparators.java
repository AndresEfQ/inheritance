package utils;

import entities.Hotel;

import java.util.Comparator;

public class Comparators {

    public static Comparator<Hotel> compareHotelsByPriceDesc = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o2.getPrice().compareTo(o1.getPrice());
        }
    };
}
