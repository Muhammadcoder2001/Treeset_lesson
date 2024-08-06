package TreeSet_lesson;

import java.util.TreeSet;

public class TAsk9 {

    public static void main(String[] args) {

        TreeSet<Integer> list = new TreeSet<>();

        list.add(9);
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(90);
        System.out.println(list);

        if (list.remove(90)){
            System.out.println("Element is deleted");
        }else{
            System.out.println("Element is not deleted");
        }
        System.out.println(list);

    }
}
