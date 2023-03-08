package learn.lambda;

// Use lambda expressions as an argument to a method.

class LambdasAsArgumentsDemo {

    // This method has a functional interface as the type of its first parameter. Thus, it can be passed a reference
    // to any instance of that interface, including the instances created by a lambda expression.
    // The second parameter specifies the string to operate on.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        System.out.println("Here is the input string; " + inStr);

        // Here, a simple expression lambda that uppercases a string is passed to stringOp().
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("The string in upper case is " + outStr);

        // This passes a block lambda that removes spaces
        outStr = stringOp((str) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0; i<str.length(); i++)
                if(str.charAt(i)!=' ')
                    stringBuilder.append(str.charAt(i));

            return stringBuilder.toString();
        }, inStr);
        System.out.println("The string with spaces removed is " + outStr);

        // Of course, it is also possible to pass a StringFunc instance created by an earlier lambda expression.
        StringFunc reverse = (str) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=str.length()-1; i>=0; i--)
                stringBuilder.append(str.charAt(i));

            return stringBuilder.toString();
        };

        // Now, reverse can be passed as the first parameter to stringOp(), since it refers to a StringFunc object.
        System.out.println("The string reversed: " + stringOp(reverse, inStr));
    }
}
