package TreeSet_lesson;

import java.util.TreeSet;

public class TAsk5 {

    public static void main(String[] args) {

        TreeSet<String> list = new TreeSet<>();
        list.add("White");
        list.add("Pink");
        list.add("Black");
        list.add("Brown");

        TreeSet <String> colors = new TreeSet<>();

        colors.addAll(list);
        System.out.println(colors);

        System.out.println(colors.size());
    }
}
