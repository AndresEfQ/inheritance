import services.AnimalService;

public class main {
    public static void main(String[] args) {

        AnimalService as = new AnimalService();

        // Declaration of the Dog object
        as.createAnimal("Dog", "Stich", "Meat", 15, "Doberman");

        // Declaration of another Dog object
        as.createAnimal("Dog", "Teddy", "Treats", 10, "Chihuahua");

        // Declaration of Cat object
        as.createAnimal("Cat", "Pelusa", "Cookies", 15, "Siamese");

        // Declaration of Horse object
        as.createAnimal("Horse", "Spark", "Grass", 25, "Fine");

        as.feedAllAnimals();
    }

}
