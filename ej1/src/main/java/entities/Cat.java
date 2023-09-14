package entities;

public class Cat extends Animal {
    public Cat(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void feed() {
        System.out.println(name + " is eating " + food);
    }
}
