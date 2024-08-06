package TreeSet_lesson;

import java.util.TreeSet;

public class Task6 {

    public static void main(String[] args) {

        TreeSet<String> list = new TreeSet<>();

        list.add("White");
        list.add("Pink");
        list.add("Black");
        list.add("Brown");
        TreeSet <String> colors = new TreeSet<>();

        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Brown");
        if (list.equals(colors)){
            System.out.println("Sets are equal");
        }else {
            System.out.println("Sets are not equal");
        }
        colors.remove("Black");
        System.out.println(colors);
        if (list.equals(colors)){
            System.out.println("Sets are equal");
        }else {
            System.out.println("Sets are not equal");
        }


    }
}
