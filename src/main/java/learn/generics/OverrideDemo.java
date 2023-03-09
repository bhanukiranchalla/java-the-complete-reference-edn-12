package learn.generics;

// Overriding a generic method in a generic class. Classes are made private static to avoid clashing of names across multiple files.

class OverrideDemo {
    private static class Gen<T> {
        T ob;
        Gen(T o) { ob = o; }
        T getOb() {
            System.out.println("Gen's getOb(): " );
            return ob;
        }
    }

    // A subclass of Gen that overrides getOb().
    private static class Gen2<T> extends Gen<T> {
        Gen2(T o) { super(o); }

        // Override getOb().
        T getOb() {
            System.out.println("Gen2's getOb(): ");
            return ob;
        }
    }

    // Demonstrate generic method override.
    public static void main(String[] args) {
        // Create a Gen object for Integers.
        Gen<Integer> iOb = new Gen<Integer>(42);

        // Create a Gen2 object for Integers
        Gen2<Integer> iOb2 = new Gen2<Integer>(43);

        // Create a Gen2 object for Strings.
        Gen2<String> strOb2 = new Gen2<String>("Generics Test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
