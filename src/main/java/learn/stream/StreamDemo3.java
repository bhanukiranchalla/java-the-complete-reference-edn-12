package learn.stream;

import java.util.ArrayList;

// Demonstrate the use of a combiner with reduce() when used with parallel streams.
// <U> U reduce(U identityVal, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
class StreamDemo3 {
    public static void main(String[] args) {
        // A list of double values.
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        System.out.println("Double list: " + myList);

        double productOfSqrRoots = myList.stream().reduce(
                1.0,
                (Double a, Double b) -> a * Math.sqrt(b),
                (Double a, Double b) -> a * b
        );
        System.out.println("Product of square roots (using parallel stream and accumulator+combiner): " + productOfSqrRoots);

        // However, one can achieve the same product-of-square-roots without using parallel stream and combiner
        double productOfSqrRootsSimple = myList.stream().reduce(1.0, (Double a, Double b) -> a * Math.sqrt(b));
        System.out.println("Product of square roots (using sequential stream and just accumulator): " + productOfSqrRootsSimple);
    }
}
