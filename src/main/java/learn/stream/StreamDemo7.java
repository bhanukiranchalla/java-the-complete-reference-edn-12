package learn.stream;

// Use collect() to create a List and a Set from a stream.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        // A list of names, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary",  "555-3333", "Mary@HerbSchildt.com" ));

        System.out.println();
        System.out.println("Original values in myList: ");
        myList.stream().forEach( (NamePhoneEmail a) -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });

        // Map just the names and phone numbers to a new stream
        Stream<NamePhone> nameAndPhone = myList.stream().map((NamePhoneEmail a ) -> new NamePhone(a.name, a.phonenum));

        // Use collect to create a List of names and phone numbers.
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println();
        System.out.println("Names and phone numbers in a List: ");
        for(NamePhone e : npList) System.out.println(e.name + " " + e.phonenum);

        // Obtain another mapping of the names and phone numbers
        nameAndPhone = myList.stream().map((NamePhoneEmail a) -> new NamePhone(a.name, a.phonenum));

        // Now, create a set by use of collect().
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println();
        System.out.println("Names and phone numbers in a Set: ");
        for(NamePhone e : npSet) System.out.println(e.name + " " + e.phonenum);

        // Obtain yet another mapping of the names and phone numbers (as the previous ones are already consumed)
        nameAndPhone = myList.stream().map((NamePhoneEmail a) -> new NamePhone(a.name, a.phonenum));

        // Now, create a LinkedList by use of collect().
        LinkedList<NamePhone> npLL = nameAndPhone.collect(
                () -> new LinkedList<>(),
                (list, element) -> list.add(element),           // add() to add an element to the list
                (listA, listB) -> listA.addAll(listB)           // to combine two linked lists
        );
        System.out.println();
        System.out.println("Names and phone numbers in a LinkedList: ");
        npLL.forEach((NamePhone a) -> System.out.println(a.name + " " + a.phonenum));

        // Obtain yet another mapping of the names and phone numbers (as the previous ones are already consumed)
        nameAndPhone = myList.stream().map((NamePhoneEmail a) -> new NamePhone(a.name, a.phonenum));

        // Now, create a HashSet by use of collect(), using much more concise notation.
        HashSet<NamePhone> npHS = nameAndPhone.collect(HashSet::new, HashSet::add, HashSet::addAll);
        System.out.println();
        System.out.println("Names and phone numbers in a HashSet: ");
        npHS.forEach((NamePhone a) -> System.out.println(a.name + " " + a.phonenum));
    }
}
