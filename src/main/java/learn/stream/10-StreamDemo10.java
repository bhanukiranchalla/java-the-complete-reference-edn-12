package learn.stream;

// Demonstrate trySplit()
// It split the elements being iterated in two, returning a new Spliterator to one of the partitions. The other partition
// remains accessible by the original Spliterator.

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

class StreamDemo10 {
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

        // Now, split the first iterator.
        Spliterator<String> splitItr2 = splitItr.trySplit();

        // If splitItr could be split, use splitItr2 first.
        if(splitItr2 != null) {
            System.out.println("Output from splitItr2: ");
            splitItr2.forEachRemaining(System.out::println);
        }

        // Now, use the splitItr.
        System.out.println("\nOutput from splitItr: ");
        splitItr.forEachRemaining(System.out::println);

        // Spliterator offers great value when parallel processing over large data sets.
    }
}
