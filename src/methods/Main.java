package methods;

public class Main {

    public static void main(String[] args) {

        MyArraylist list = new MyArraylist();

        list.add(1);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(11);
        list.add(18);
        list.add(7);
        list.add(22);
        list.add(88);


        System.out.println(list);
        System.out.println("-------------------------------------");
        System.out.println(list.get(6));
        System.out.println(list.set(11, 56));
        System.out.println(list.size());
        System.out.println(list.contains(88));
        list.remove(7);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
