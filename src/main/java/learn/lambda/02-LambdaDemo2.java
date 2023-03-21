package learn.lambda;

// Demonstrate a lambda expression that takes a parameter.

// Another functional interface.
interface NumericTest {
    boolean test(int n);
}
class LambdaDemo2 {
    public static void main(String[] args) {
        // A lambda expression that tests whether a number is even
        NumericTest isEven = (n) -> (n % 2)==0;

        if(isEven.test(10)) System.out.println("10 is even");
        if(!isEven.test(9)) System.out.println("9 is not even");

        // Now, use the lambda expression that tests if a number is non-negative
        NumericTest isNonNeg = (n) -> n >= 0;
        if(isNonNeg.test(3)) System.out.println("3 is non-negative");
        if(!isNonNeg.test(-2)) System.out.println("-2 is negative");
    }
}
