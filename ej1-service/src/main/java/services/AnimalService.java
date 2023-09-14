package services;

import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Horse;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalService {

    private final ArrayList<Animal> animals;
    private final Scanner sc;

    public AnimalService() {
        animals = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void createAnimal () {
        System.out.println("Please choose the animal you want to create");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Horse");
        System.out.println("0. Cancel");

        int op;

        do {
            op = Integer.parseInt(sc.nextLine());
            if (op < 0 || op > 3) {
                System.out.println("Invalid option, try again");
            }
        } while (op < 0 || op > 3);

        System.out.println("Choose the atributes of your animal");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Food: ");
        String food = sc.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Breed: ");
        String breed = sc.nextLine();

        Animal animal;
        switch (op) {
            case 1 -> animal = new Dog(name, food, age, breed);
            case 2 -> animal = new Cat(name, food, age, breed);
            case 3 -> animal = new Horse(name, food, age, breed);
            default -> {
                animal = null;
                System.out.println("bye");
            }
        }

        animals.add(animal);
    }

    public void createAnimal (String kind, String name, String food, int age, String breed) {
        Animal animal;

        switch (kind) {
            case "Dog" -> animal = new Dog(name, food, age, breed);
            case "Cat" -> animal = new Cat(name, food, age, breed);
            case "Horse" -> animal = new Horse(name, food, age, breed);
            default -> {
                animal = null;
                System.out.println("Invalid animal kind");
            }
        }
        animals.add(animal);
    }

    public void feed (Animal animal) {

        System.out.println(animal.getName() + " is eating " + animal.getFood());
    }

    public void feedAllAnimals () {
        animals.forEach(this::feed);
    }
}
