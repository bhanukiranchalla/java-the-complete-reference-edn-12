package learn.stream;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

// Use a Spliterator.
class StreamDemo9 {
    public static void main(String[] args) {
        // Create a list of strings.
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        // Obtain a Stream to the ArrayList.
        Stream<String> myStream = myList.stream();

        // Obtain a Spliterator.
        Spliterator<String> splitItr = myStream.spliterator();

        // Iterate the elements of the stream.
        while(splitItr.tryAdvance((String s) -> System.out.println(s)));
        System.out.println("--------");

        splitItr = myList.stream().spliterator();
        while(splitItr.tryAdvance(System.out::println));    // more concise form.
    }
}
