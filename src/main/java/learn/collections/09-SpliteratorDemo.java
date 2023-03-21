package learn.collections;

// A simple spliterator demonstration.
// Spliterator cycles through a sequence of elements, similar to the iterators. But if offers more.
// It supports parallel programming. You can use Spliterator even if you won't be using parallel execution. This is
// because it offers a streamlined approach that combines the hasNext and next operations in one method.

import java.util.ArrayList;
import java.util.Spliterator;

class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Use tryAdvance() to display contents of vals.
        System.out.print("Contents of vals: ");
        Spliterator<Double> spltitr = vals.spliterator();
        while(spltitr.tryAdvance((n) -> System.out.print(n + "\t\t"))){}
        System.out.println();

        // Create new list that contains square roots.
        spltitr = vals.spliterator();       // must reset spliterator as we have finished one iterator in while above.
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))){}

        // Use forEachRemaining() to display the contents of sqrs.
        System.out.print("Contents of sqrs: ");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.print(n + "\t\t"));
        System.out.println();
    }
}
