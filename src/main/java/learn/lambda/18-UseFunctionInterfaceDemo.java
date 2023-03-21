package learn.lambda;

import java.util.function.Function;

// Use the Function built-in functional interfaces.

class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        // This block lambda computes the factorial of an int value.
        // This time, Function is the functional interface.
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for(int i=1; i<=n; i++)
                result = result * i;
            return result;
        };

        System.out.println("The factorial of 5 is " + factorial.apply(5));
        System.out.println("The factorial of 3 is " + factorial.apply(3));
    }
}

// java.util.function
// UnaryOperator<T> - apply a unary operation to an object of type T and return the result, which is also of type T. Its method is called apply().
// BinaryOperator<T> - apply an operation to two objects of type T and return the result, which is also of type T. Its method is called apply().
// Consumer<T> - apply an operation on an object of type T. Its method is called accept().
// Supplier<T> - apply an object of type T. Its method is called get().
// Function<T, R> - apply an operation to an object of type T and return the result as an object of type R. Its method is called apply().
// Predicate<T> - determine if an object of type T fulfills some constraint. Return a boolean value that indicates the outcome. Its method is called test().