package task3;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        animals.add(0, "Dog");
        animals.add(1, "Cat");
        animals.add(2, "Lion");
        animals.add(3, "Horse");
        animals.add(4, "Panda");
        animals.add(5, "Fox");
        animals.add(6, "Cow");
        animals.add(7, "Deer");

        System.out.println("Size of list before remove: " + animals.size());

        animals.remove(3);
        animals.remove(5);
        animals.remove(7); // IndexOutOfBoundsException

        System.out.println("Size of list after remove: " + animals.size());

        for (String animal: animals) {
            System.out.println(animal);
        }

    }
}
