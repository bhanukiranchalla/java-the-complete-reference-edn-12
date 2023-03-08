package learn.lambda;

// Demonstrate a method reference to a generic method declared inside a non-generic class.
// typeName.super::name

// A functional interface that operate on an array and a value, and returns an int result.
interface MyArrayFunc<T> {
    int func(T[] values, T v);
}

// This class defines a method called countMatching() that returns the number of items in an array that are equal to a specified
// value. Notice that countMatching() is generic, but MyArrayOps is not.
class MyArrayOps {
    static <T> int countMatching(T[] values, T v) {
        int count = 0;
        for(T val : values)
           if(val == v)
               ++count;

        return count;
    }
}

class GenericMethodRefDemo {
    // This method has the MyArrayFunc functional interface as the type of its first parameter.
    // The other two parameters receive an array and a value, both of type T.
    static <T> int myOp(MyArrayFunc<T> f, T[] values, T v) {
        return f.func(values, v);
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{ 1, 2, 3, 4, 2, 3, 4, 4, 5 };
        String[] strings = { "One", "Two", "Three", "Two" };
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, integers, 4 );
        System.out.println("integers contains " + count + " 4s");

        count = myOp(MyArrayOps::<String>countMatching, strings, "Two" );
        System.out.println("strings contains " + count + " Twos");
    }
}
