package entities;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void feed() {
        System.out.println(name + " is eating " + food);
    }
}
