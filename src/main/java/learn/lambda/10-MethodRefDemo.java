package learn.lambda;

// Demonstrate a method reference for a static method.
// className::methodName

// This class defines a static method called strReverse().
class MyStringOps {
    // a static method that reverses a string
    static String strReverse(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--)
            stringBuilder.append(str.charAt(i));

        return stringBuilder.toString();
    }
}

class MethodRefDemo {
    // This method has a functional interface as the type of its first parameter. Thus, it can be passed any instance of that interface,
    // including a method reference.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        // Here, as method reference to strReverse is passed to stringOp().
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}