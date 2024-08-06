package TreeSet_lesson;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {

    public static void main(String[] args) {

        TreeSet<String> list = new TreeSet<>();

        list.add("White");
        list.add("Pink");
        list.add("Black");
        list.add("Brown");

        Iterator<String> list_copy = list.iterator();
        while(list_copy.hasNext()){
            System.out.println(list_copy.next());
        }
         System.out.println(list);

    }
}
