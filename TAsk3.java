package TreeSet_lesson;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TAsk3 {

    public static void main(String[] args) {

        TreeSet<String> list = new TreeSet<>();
        TreeSet <String> colors = new TreeSet<>();
        list.add("White");
        list.add("Pink");
        list.add("Black");
        list.add("Brown");
        colors.addAll(list);
        System.out.println(colors);
        Iterator<String> color = colors.descendingIterator();
        while(color.hasNext()){
            System.out.println(color.next());
        }
    }
}
