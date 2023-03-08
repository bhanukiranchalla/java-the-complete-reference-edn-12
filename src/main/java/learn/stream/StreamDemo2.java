package learn.stream;

import java.util.ArrayList;
import java.util.Optional;

// Demonstrate the reduce() method.
class StreamDemo2 {
    public static void main(String[] args) {
        // Create a list of Integer values.
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        System.out.println("Integer list: " + myList);

        // Two ways to obtain the integer product of the elements in myList by use of reduce().
        Optional<Integer> productObj = myList.stream().reduce((Integer a, Integer b) -> a * b);
        productObj.ifPresent((x) -> System.out.println("Product as optional: " + productObj.get()));

        int product = myList.stream().reduce(1, (Integer a, Integer b) -> a*b);
        System.out.println("Product as int: " + product);

        int evenProduct = myList.stream().reduce(1, (Integer a, Integer b) -> {
            if(b%2 == 0)
                return a*b;
            else
                return a;
        });
        System.out.println("Product of even numbers: " + evenProduct);
        // here a holds the current value and b holds the next element.
        // Follows from
        //          T reduce(T identityVal, BinaryOperator<T> accumulator)
        // The accumulator operates on two values and produces a result. identityVal is a value such that an accumulator
        // operation involving identityVal and any element of the stream yields that element, unchanged.

        // In my own words, (a,b) here "a" is used to accumulate the result, which is initialized to 1.
        // Then "b" represents each element of the list, which we iterate upon.
        // While iterating, if "b" is even, then "a" is replaced by result (a*b).
        // Otherwise, we keep  "a" unchanged. Which achieves the effect of multiplying only even numbers in the list.
    }
}
