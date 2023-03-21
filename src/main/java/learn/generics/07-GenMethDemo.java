package learn.generics;

// Demonstrate a simple generic method. Creates a generic method that is enclosed within a non-generic class.

import java.util.Arrays;
import java.util.stream.Collectors;

class GenMethDemo {
    // Determine if an object is in an array. The type parameters are declared before the return type of the method.
    // Generic methods can be static or non-static.
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for(V v : y)
            if (x.equals(v))
                return true;
        return false;
    }

    public static void main(String[] args) {
        // Use isIn on integers.
        Integer[] nums = { 1, 2, 3, 4, 5 };
        System.out.println("nums: " + Arrays.stream(nums).collect(Collectors.toList()));

        if(isIn(2, nums))
            System.out.println("2 is in nums");

        if(!isIn(7, nums))
            System.out.println("7 is not in nums");

        System.out.println();

        // Use isIn() on Strings.
        String[] strs = { "one", "two", "three", "four", "five" };
        System.out.println("strs: " + Arrays.stream(strs).collect(Collectors.toList()));

        if(isIn("two", strs))
            System.out.println("two is in strs");

        if(!isIn("seven", strs))
            System.out.println("seven is not in strs");

        // Oops! Won't compile! TYpes must be compatible.
        // if(isIn("two", nums))
        //     System.out.println("two is in nums");
    }
}
