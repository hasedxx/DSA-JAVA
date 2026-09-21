
import java.util.ArrayList;
import java.util.Collections;


public class Basics {
    public static void main(String[] args) {
        //Create ArrayList
        ArrayList <Integer> arr = new ArrayList<>(); 

        //Add Values
        arr.add(1);
        arr.add(9);
        arr.add(13);
        arr.add(103);
        arr.add(14);

        //Print Values
        System.out.println(arr.get(2));

        //Replace value
        arr.set(2,89);
        System.out.println(arr.get(2));

        //Print all Elements
        System.out.println(arr);

        //Check the size
        System.out.println(arr.size());

        //Remove Element
        arr.remove(3);
        System.out.println(arr);

        //Reverse Arraylist
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
