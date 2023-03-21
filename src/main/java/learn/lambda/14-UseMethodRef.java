package learn.lambda;

// Use a method reference to help find the maximum value in a collection.

import java.util.ArrayList;
import java.util.Collections;

class MyClass {
    private final int value;

    MyClass(int v) { value = v; }

    int getValue() { return value; }
}
class UseMethodRef {
    // A compare() method compatible with the one defined by Comparator<T>.
    static int compareMC(MyClass a, MyClass b) {
        return a.getValue() - b.getValue();     // -ve in comparator world means smaller
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();

        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        // Find the maximum value in al using the compareMC() method
        MyClass maxValueObj = Collections.max(al, UseMethodRef::compareMC);

        System.out.println("Maximum value is " + maxValueObj.getValue());

        // Please note that MyClass neither defines any comparison method of its own, nor does it implement Comparator.
        // This is possible because UseMethodRef defines the static method compareMC(), which is compatible with the
        // compare() method defined by Comparator. Therefore, there is no need to explicitly implement and create an instance
        // of Comparator.
    }
}
