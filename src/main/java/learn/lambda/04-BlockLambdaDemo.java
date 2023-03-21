package learn.lambda;

// A block lambda that computes the factorial of an int value

interface  NumericFunc {
    int func(int n);
}

class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for(int i=1; i<=n; i++)
                result = result * i;
            return result;
        };

        System.out.println("Factorial of 5 is " + factorial.func(5));
        System.out.println("Factorial of 3 is " + factorial.func(3));
    }
}
