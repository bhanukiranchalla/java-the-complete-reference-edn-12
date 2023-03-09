package learn.interfaces;

// A nested interface example.

// This class contains a nested interface.
class A {
    // this is a nested interface
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

// B implements the nested interface
class B implements A.NestedIf {
    @Override
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        // use a nested interface reference
        A.NestedIf nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if(nif.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}
