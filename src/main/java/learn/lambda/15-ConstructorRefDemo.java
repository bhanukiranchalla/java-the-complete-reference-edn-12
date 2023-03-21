package learn.lambda;

// Demonstrate a Constructor reference.
// classname::new

// MyFunc is a functional interface whose method returns a MyClass reference.
interface MyFuncThatReturnsMyClassRef {
    MyIntClass func(int n);
}

class MyIntClass {
    private final int value;

    // This constructor takes an argument.
    MyIntClass(int v) { value = v;}

    // This is the default constructor.
    MyIntClass() { value = 0; }

    int getValue() { return value; }
}

class ConstructorRefDemo {
    public static void main(String[] args) {
        // Create a reference to the MyClass constructor. Because func() in interface takes an argument, new refers to
        // the parametrized constructor in MyIntClass (not the default one).
        MyFuncThatReturnsMyClassRef myClassCons = MyIntClass::new;

        // Create an instance of MyIntClass via that constructor reference.
        MyIntClass mc = myClassCons.func(100);

        // Use the instance of MyClass just created.
        System.out.println("value in mc is " + mc.getValue());


        // in essence, myClassCons has become another way to call MyClass(int v).
    }
}
