package learn.interfaces;

import java.util.Random;

interface MyIF3 {
    // This is a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getNumber();

    // This is a default method. Notice that it provides a default implementation.
    default int getRandomNumber() {
        return _nextRandomInteger();
    }

    // This is a static interface method.
    static int getDefaultNumber() {
        return 0;
    }

    private int _nextRandomInteger() {
        return new Random().nextInt();
    }
}

class MyIFImp3 implements MyIF3 {
    // Only getNumber() defined by MyIF3 needs to be implemented.
    // getString() can be allowed to default.
    @Override
    public int getNumber() {
        return 42;
    }
}

class PrivateMethodDemo {
    public static void main(String[] args) {
        MyIFImp3 obj = new MyIFImp3();

        System.out.println(obj.getNumber());
        System.out.println(MyIF3.getDefaultNumber());
        System.out.println(obj.getRandomNumber());
    }
}
