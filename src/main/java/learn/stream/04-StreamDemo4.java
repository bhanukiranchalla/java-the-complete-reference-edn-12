package learn.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

// Map one stream to another

class StreamDemo4 {
    public static void main(String[] args) {
        // A list of double values.
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        System.out.print("Double list (printed using stream): ");
        myList.stream().forEach(a -> System.out.print(a + "  "));
        System.out.println();

        // Map the square root of the elements in myList to a new stream.
        Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));

        // Find the product of the square roots
        double productOfSqrtRoots = sqrtRootStrm.reduce(1.0, (a,b) -> a*b);
        System.out.println("Product of square roots is " + productOfSqrtRoots);
    }
}
