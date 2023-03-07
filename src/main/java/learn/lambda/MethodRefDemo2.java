package learn.lambda;

// Demonstrate a method reference to an instance method
// objRef::methodName

// This class defines an instance method called strReverse().
class MyStringOps2 {
    String strReverse(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--)
            stringBuilder.append(str.charAt(i));

        return stringBuilder.toString();
    }
}

class MethodRefDemo2 {
    // This method has a functional interface as the type of its first parameter. Thus, it can be passed any instance of that interface,
    // including method references.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        // Create a MyStringOps object.
        MyStringOps2 strOps = new MyStringOps2();

        // Now, a method reference to the instance method strReverse is passed to stringOp().
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}