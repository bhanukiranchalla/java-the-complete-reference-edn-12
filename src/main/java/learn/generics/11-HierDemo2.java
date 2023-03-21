package learn.generics;

// A non-generic subclass can be the superclass of a generic subclass.

// A non-generic class.
class NonGeneric {
    int num;

    NonGeneric(int i) { num = i; }

    int getNum() { return num; }
}

// A generic subclass
class GenericSub<T> extends NonGeneric {
    T ob;   // declare an object of type T

    // Pass the constructor a reference to an object of type T.
    GenericSub(T o, int i) {
        super(i);
        ob = o;
    }

    // Return ob.
    T getOb() { return ob; }
}

// Create a Gen object.
class HierDemo2 {
    public static void main(String[] args) {
        // Create a Gen object for String.
        GenericSub<String> w = new GenericSub<String>("Hello", 47);

        System.out.println(w.getOb());
        System.out.println(w.getNum());
    }
}
