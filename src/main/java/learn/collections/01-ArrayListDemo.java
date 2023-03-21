package learn.collections;

import java.util.ArrayList;

// Demonstrate ArrayList.
class ArrayListDemo {
    public static void main(String[] args) {
        // Create an array list.
        ArrayList<String> al = new ArrayList<>();
        al.ensureCapacity(10);

        System.out.println("Initial size of al is " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Size after additions: " + al.size());

        // Display the array list.
        System.out.println("Contents of al: " + al);

        // Remove elements form the array list.
        al.remove("F");
        al.remove(2);

        System.out.println("Size after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}