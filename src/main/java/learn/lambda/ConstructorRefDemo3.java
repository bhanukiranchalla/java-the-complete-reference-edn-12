package learn.lambda;

// Implement a simple class factory using a constructor reference.

interface MyGenericFunc<R, T> {
    R func(T n);
}

// A simple generic class.
class MySecondGenericClass<T> {
    private final T value;

    // A constructor that takes an argument.
    MySecondGenericClass(T v) { value = v; }

    // The default constructor. This constructor is NOT used by this program.
    MySecondGenericClass() { value = null; }

    public T getValue() { return value; }
}

// A simple, non-generic class
class MyClass2 {
    final String str;

    // A constructor that takes an argument.
    MyClass2(String s) { str = s; }

    // The default constructor. This constructor is NOT used by this program.
    MyClass2() { str = ""; }

    String getValue() { return str; }
}

class ConstructorRefDemo3 {
    // A factory method for class objects. The class must have a constructor that takes one parameter of type T.
    // R specifies the type of object being created.
    static <R, T> R myClassFactory(MyGenericFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Create a reference to a MySecondGenericClass constructor. In this case, new refers to the constructor that takes an argument.
        MyGenericFunc< MySecondGenericClass<Double>, Double> myClassCons = MySecondGenericClass<Double>::new;

        // Create an instance of MySecondGenericClass by use of the factory method.
        MySecondGenericClass<Double> mc = myClassFactory(myClassCons, 100.1);

        // Use the instance of MySecondGenericClass just created.
        System.out.println("val in mc is " + mc.getValue());

        // Now, create a different class by use of myClassFactory().
        MyGenericFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        // Create an instance of MyClass2 by use of the factory method.
        MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");

        // Use the instance of MyClass just created.
        System.out.println("str in mc2 is " + mc2.getValue());
    }
}
