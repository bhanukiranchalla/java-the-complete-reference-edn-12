package learn.lambda;

// A block lambda that reverses the characters in a string

interface StringFunc {
    String func(String n);
}
class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            StringBuilder result = new StringBuilder();
            int i;
            for(i = str.length()-1; i>=0; i--)
                result.append(str.charAt(i));

            return result.toString();
        };

        System.out.println("Lambda reversed is " + reverse.func("Lambda"));
        System.out.println("Expression reversed is " + reverse.func("Expression"));
    }
}
