import guideEntities.*;

import java.util.ArrayList;

public class guideMain {

    public static void main(String[] args) {

        animal a = new animal();
        animal b = new Dog();
        animal c = new Cat();

        ArrayList<animal> animals = new ArrayList<>();
        animals.add(a);
        animals.add(b);
        animals.add(c);

        animals.forEach((animal -> {
            System.out.print("the " + animal.getClass() + " says ");
            animal.makeNoise();
        }));

    }
}
