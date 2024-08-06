package TreeSet_lesson;

import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {

        TreeSet<String> list = new TreeSet<>();

        list.add("White");
        list.add("Pink");
        list.add("Black");
        list.add("Brown");

        list.forEach(s-> {
            System.out.println(s);
        });
        System.out.println(list);

    }
}
