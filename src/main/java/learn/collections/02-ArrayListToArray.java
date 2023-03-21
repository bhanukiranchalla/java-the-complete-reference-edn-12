package learn.collections;

import java.util.ArrayList;

// Convert an ArrayList into an array.
class ArrayListToArray {
    public static void main(String[] args) {
        // Create an array list.
        ArrayList<Integer> al = new ArrayList<>();

        // Add elements to the array list.
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al: " + al);

        // Get the array.
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);    // what kind of sorcery is this? why do we need pass the same array list as input and again assign it to?

        int sum = 0;

        // Sum the array.
        for(int i : ia) sum += i;       // involves a lot of auto-boxing and unboxing, but ignore for now.

        System.out.println("Sum is " + sum);
    }
}