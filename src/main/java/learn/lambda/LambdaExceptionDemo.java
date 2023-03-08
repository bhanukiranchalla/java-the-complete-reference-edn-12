package learn.lambda;

// Throw an exception from a lambda expression

interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array Empty");
    }
}

class LambdaExceptionDemo {
    public static void main(String[] args) {
        double[] values = { 1.0, 2.0, 3.0, 4.0, 5.0 };

        // This block lambda computes the avg of array of doubles
        /* Please note that though the interface takes array as argument, we still use the same syntax (n), not (n[]) */
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if(n.length == 0) throw new EmptyArrayException();

            for (double v : n) sum += v;

            return sum / n.length;
        };

        try{
            System.out.println("The average of non-empty array is " + average.func(values));
        } catch (EmptyArrayException ignored) {}

        try{
            System.out.println("The average of empty array is " + average.func(new double[0]));
        } catch (EmptyArrayException e) {
            System.out.println("Caught exception with message: " + e.getMessage() );
        }
    }
}
