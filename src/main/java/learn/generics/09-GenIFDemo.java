package learn.generics;

// A generic interface example

// A Min/Max interface. The type parameter T has an upperbound Comparable. In the object graph (invert tree - object at the
// root and the subclasses flowing downwards), we restrict the scope at Comparable
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// Now, implement MinMax. The implementing class must specify the same bound as that of the MinMax interface.
// Also note that the type param need not be specified the second (so it is simply MinMax<T>), as we need to establish the type just once.
// Note that class MyClass implements MinMax<T> {  is wrong, as the class must work on the same type parameter as of that the interface.
// class MyClass implements MinMax<Integer> { is OK.
// Generic interface offers two benefits.
//      1) can be implemented for different types of data.
//      2) allows us to put constraints (bounds) on types of data for which the interface can be implemented.
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) { vals = o; }

    @Override
    public T min() {
        T v = vals[0];      // ignore bound checks for now
        for(int i=1; i<vals.length; i++)
            if(vals[i].compareTo(v) < 0)
                v = vals[i];

        return v;
    }

    @Override
    public T max() {
        T v = vals[0];      // ignore bound checks for now
        for(int i=1; i<vals.length; i++)
            if(vals[i].compareTo(v) > 0)
                v = vals[i];

        return v;
    }
}
class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = { 3, 6, 2, 8, 6 };
        Character[] chs = { 'b', 'r', 'p', 'w' };

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());

        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());
    }
}
