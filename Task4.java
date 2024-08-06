package TreeSet_lesson;

import java.awt.*;
import java.util.TreeSet;

public class Task4 {

    public static void main(String[] args) {

        TreeSet<String> list = new TreeSet<>();
        list.add("White");
        list.add("Pink");
        list.add("Black");
        list.add("Brown");
        System.out.println(list);
        System.out.println("First is " + list.first() + "  Last is " + list.last());

    }
}
