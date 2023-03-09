package learn.generics;

// A subclass can add its own type parameters.

class Generic<T> {
    T ob;   // declare an object of Type T

    // Pass the constructor a reference to an object of type T.
    Generic(T o) { ob = o; }

    // Return ob.
    T getOb() { return ob; }
}

// A subclass of Generic that defines a second type parameter, called V.
class Generic2<T, V> extends Generic<T> {
    V ob2;

    Generic2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() { return ob2; }
}

// create an object of type Generic2.
class HierDemo {
    public static void main(String[] objs) {
        // Create a Gen2 object for String and Integer.
        Generic2<String, Integer> x = new Generic2<String, Integer>("Value is: ", 99);

        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}
