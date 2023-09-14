import entities.*;

// This exercise is solved using inheritance without services
public class Main {
    public static void main(String[] args) {

        // Declaration of the Dog object
        Animal dog1 = new Dog("Stich", "Meat", 15, "Doberman");
        dog1.feed();

        // Declaration of another Dog object
        Animal dog2 = new Dog("Teddy", "treats", 10, "Chihuhua");
        dog2.feed();

        // Declaration of Cat object
        Animal cat1 = new Cat("Pelusa", "Cookies", 15, "Siamese");
        cat1.feed();

        // Declaration of Horse object
        Animal horse1 = new Horse("Spark", "Grass", 25, "Fine");
        horse1.feed();
    }
}
