package learn.generics;

// Use a generic constructor. This allows various forms of numbers to be used to construct an object of type GenCons.
class GenCons {
    private final double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();    // neat!
    }

    void showVal() {
        System.out.println("val: " + val);
    }
}

class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test.showVal();
        test2.showVal();
    }
}
