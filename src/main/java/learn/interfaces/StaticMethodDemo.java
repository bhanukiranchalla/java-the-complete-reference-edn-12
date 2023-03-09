package learn.interfaces;

interface MyIF2 {
    // This is a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getNumber();

    // This is a default method. Notice that it provides a default implementation.
    default String getString() {
        return "Default String";
    }

    // This is a static interface method.
    static int getDefaultNumber() {
        return 0;
    }
}

class StaticMethodDemo {
    public static void main(String[] args) {
        System.out.println("Default number: " + MyIF2.getDefaultNumber() );
    }
}
