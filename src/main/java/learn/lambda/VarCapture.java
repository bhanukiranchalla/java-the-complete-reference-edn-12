package learn.lambda;

// An example of capturing a local variable from the enclosing scope

interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String[] args) {
        // A local variable that can be captured.
        int num = 10;

        MyFunc myLambda = (n) -> {
            @SuppressWarnings("redundant")
            // This use of num is OK. It does not modify num. Concept of "variable capture".
            int v = num + n;

            // However, the following is illegal because it attempts to modify the value of num.
            // num++
            return v;
        };

        System.out.println("The function uses local variable num [" + num + "] to compute sum with value [20]: " + myLambda.func(20));

        // The following line would also cause an error, because it would remove effectively final status form num.
        // num = 9;
    }
}
