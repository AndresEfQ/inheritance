package entities;

public class Horse extends Animal {
    public Horse(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    public void feed() {
        System.out.println(name + " is eating " + food);
    }
}
