package task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);

        ListIterator<Integer> list = numberList.listIterator();

        while (list.hasNext()) {
            Integer integer = list.next();
            System.out.println(integer + 1);
        }

    }
}
