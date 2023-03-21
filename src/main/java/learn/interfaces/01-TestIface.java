package learn.interfaces;

interface Callback {
    void callback(int param);
}

class Client implements Callback {
    // Implement Callback's interface
    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    public void greeting() {
        System.out.println("How u doin?");
    }
}

class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
        // c.greeting(); // cannot call other members of Client using interface
    }
}