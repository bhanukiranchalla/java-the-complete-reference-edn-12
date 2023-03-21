package learn.collections;

// A simple mailing list example.
// The power of collections is that they can store any type of object, including objects of classes that you create.

import java.util.LinkedList;

class UserClassesInCollectionsDemo {
    static class Address {
        final private String name;
        final private String street;
        final private String city;
        final private String state;
        final private String code;
        Address(String n, String s, String c, String st, String cd) {
            name = n;
            street = s;
            city = c;
            state = st;
            code = cd;
        }

        public String toString() {
            return name + "\n" + street + "\n" + city + " " + state + " " + code;
        }
    }

    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        // Add elements to the linked list.
        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        // Display the mailing list.
        ml.forEach((a) -> System.out.println(a + "\n"));
    }
}
