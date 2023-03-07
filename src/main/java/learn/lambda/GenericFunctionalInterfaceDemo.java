package learn.lambda;

// Use a generic functional interface with lambda expressions

interface SomeFunc<T> {
    T func(T t);
}

class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Use a String-based version of SomeFunc.
        SomeFunc<String> reverse = (str) -> {
            StringBuilder result = new StringBuilder();
            for(int i=str.length()-1; i >= 0; i--)
                result.append(str.charAt(i));

            return result.toString();
        };

        System.out.println("Lambda reversed is " + reverse.func("Lambda"));
        System.out.println("Expression reversed is " + reverse.func("Expression"));

        // Now, use an Integer-based version of SomeFunc. Ignore the cost of auto-boxing.
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for(int i=1; i<=n; i++)
                result = result * i;

            return result;
        };

        System.out.println("Factorial of 5 is " + factorial.func(5));
        System.out.println("Factorial of 3 is " + factorial.func(3));
    }
}
