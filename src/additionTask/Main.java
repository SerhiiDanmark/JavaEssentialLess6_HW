package additionTask;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Teacher> arr = new ArrayList<>();

        Teacher t1 = new Teacher("Lubov", "Ivanivna");
        Teacher t2 = new Teacher("Pavlo", "Zakharovich");
        Teacher t3 = new Teacher("Galina", "Alexandrovna");
        Teacher t4 = new Teacher("Zoya", "Stepanovna");

        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
        arr.add(t4);

        System.out.println("Index the best of teacher: ");
        System.out.println(arr.indexOf(t1));
        System.out.println("Index the worst of teacher: ");
        System.out.println(arr.indexOf(t4));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName() + " " + arr.get(i).getPatronimic());
        }
    }
}
