package TreeSet_lesson;


import java.util.TreeSet;

public class Task7 {

    public static void main(String[] args) {

        TreeSet<Integer> list = new TreeSet<>();

        list.add(13);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(6);

        System.out.println(list.floor(12));

        for (Integer number : list){
            if (number <= 7){
                System.out.println(number);
            }
        }


    }
}
