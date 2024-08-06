package TreeSet_lesson;

import java.util.TreeSet;

public class Task8 {

    public static void main(String[] args) {

        TreeSet <Integer> list = new TreeSet<>();

        list.add(9);
        list.add(19);
        list.add(12);
        list.add(7);
        list.add(10);
        System.out.println(list);
        list.pollFirst();
        System.out.println(list);

        list.pollLast();
        System.out.println(list);


    }
}
