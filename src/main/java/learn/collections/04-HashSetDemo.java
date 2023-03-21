package learn.collections;

// Demonstrate HashSet. A collection that uses a hash table for storage.
// Uses hashing to store/retrieve information in hash tables. Allows the execution
// time of add(), contains(), remove(), and size() to remain constant even for large sets.

import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {
        // Create a hash set.
        HashSet<String> hs = new HashSet<>();

        // Add elements to the hash set.
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");

        System.out.print("Contents of HashSet: ");
        hs.forEach((String x) -> System.out.print(x + " "));
        System.out.println();

        if( hs.contains("Gamma") ) System.out.println("Gamma is present in the set");
        if( hs.contains("Delta") ) System.out.println("Delta is present in the set"); // False
        if( hs.contains("eta")) System.out.println("eta is present in the set; hash-set is not case-sensitive"); // False

        if(hs.remove("Gamma")) System.out.println("Successfully deleted Gamma from the set");
        if(hs.remove("alpha")) System.out.println("Successfully deleted alpha from the set"); // False

        System.out.print("Contents of HashSet after deletion: ");
        hs.forEach((String x) -> System.out.print(x + " "));
        System.out.println();
    }
}
