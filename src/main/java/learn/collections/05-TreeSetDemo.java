package learn.collections;

// Demonstrate TreeSet. Objects are stored in sorted, ascending order. Access and retrieval times are
// quite fast, which makes TreeSet an excellent choice when storing large amounts of sorted information
// that must be found quickly.
// Extends AbstractSet and implements the NavigableSet interface.

import java.util.TreeSet;

class TreeSetDemo {
    public static void main(String[] args) {
        // Create a tree set.
        TreeSet<String> ts = new TreeSet<>();

        // Add elements to the tree set.
        ts.add("C");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        ts.add("A");
        ts.add("1");
        ts.add("@");
        ts.add(" ");
        ts.add(" A");
        ts.add("8");
        ts.add("82");

        System.out.println("Original set: " + ts);
        System.out.println("Subset: " + ts.subSet("2", "E")); // use a non-existent element
    }
}
