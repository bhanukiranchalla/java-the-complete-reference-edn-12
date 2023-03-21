package learn.collections;

// Use the for-each loop to cycle through a collection.
// If you won't be modifying the contents of a collection or obtaining elements in reverse order, then for-each
// version of the for loop is often a more convenient alternative to cycling through a collection than is
// using an iterator.
// Ignore all the auto-boxing and unboxing.

import java.util.ArrayList;

class ForEachDemo {
    public static void main(String[] args){
        ArrayList<Integer> vals = new ArrayList<>();

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // Use for loop to display the values.
        System.out.print("Contents of vals: ");
        for(int i : vals)
            System.out.print(i + " ");
        System.out.println();

        // Now, sum the values by using a for loop.
        int sum = 0;
        for(int v : vals)
            sum += v;

        System.out.println("Sum of values: " + sum);
    }
}