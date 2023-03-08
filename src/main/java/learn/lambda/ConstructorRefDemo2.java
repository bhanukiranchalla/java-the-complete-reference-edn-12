package learn.lambda;

// Demonstrate a constructor reference with a generic class.

// MyInterfaceFunc is (now) a generic functional interface.
interface MyInterfaceFunc<T> {
    MyGenericClass<T> func(T n);
}

class MyGenericClass<T> {
    private final T value;

    // A constructor that takes an argument.
    MyGenericClass(T v) { value = v; }

    // This is the default constructor.
    MyGenericClass() { value = null; }

    T getValue() { return value; }
}

class ConstructorRefDemo2 {
    public static void main(String[] args) {
        // Create a reference to the MyGenericClass<T> constructor
        MyInterfaceFunc<Integer> myClassCons = MyGenericClass<Integer>::new;

        // Create an instance of MyGenericClass<T> via that constructor reference.
        MyGenericClass<Integer> mc = myClassCons.func(100);

        // Use the instance of MyGenericClass<T> just created.
        System.out.println("value in mc is " + mc.getValue());

        // Although the preceding examples demonstrate the mechanics of using a constructor reference, no one would use
        // a constructor reference as just shown because nothing is gained. Furthermore, having two names for the same
        // constructor creates a confusing situation. This is only for illustration purposes.
        // Let us consider next example (ConstructorRefDemo3) which is a factory for objects of any type of MyGenericFunc objects.
        // It can be used to create any type of object that has a constructor compatible with its first parameter.
    }
}
