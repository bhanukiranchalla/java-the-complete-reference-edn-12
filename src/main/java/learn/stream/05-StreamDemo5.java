package learn.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

// Use map() to create a new stream that contains only selected aspects of the original stream.
class NamePhoneEmail {
    final String name;
    final String phonenum;
    final String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone {
    final String name;
    final String phonenum;

    NamePhone(String n, String p) {
        name = n;
        phonenum = p;
    }
}

class StreamDemo5 {
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
        Stream<NamePhone> nameAndPhone = myList.stream().map((NamePhoneEmail a) -> new NamePhone(a.name, a.phonenum));
        System.out.println();
        System.out.println("List of names and phone numbers: ");
        nameAndPhone.forEach((NamePhone a) -> System.out.println(a.name + " " + a.phonenum));

        // Because we can pipeline more than one intermediate operation together, we can easily create very powerful actions.
        // We can use filter and map to produce a new stream that contains only the name and phone number of the elements with name "James"
        Stream<NamePhone> nameAndPhoneJames = myList.stream().filter((NamePhoneEmail a) -> a.name.equals("James")).map((NamePhoneEmail a) -> new NamePhone(a.name, a.phonenum));
        System.out.println();
        System.out.println("James' names and phone numbers: ");
        nameAndPhoneJames.forEach((NamePhone a) -> System.out.println(a.name + " " + a.phonenum));
    }
}
