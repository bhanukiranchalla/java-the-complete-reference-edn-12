package learn.collections;

import java.util.ArrayDeque;

// Demonstrate ArrayDeque. Extends AbstractCollection and implements the Deque interface.
class ArrayDequeDemo {
    public static void main(String[] args) {
        // Create an array deque.
        ArrayDeque<String> adq = new ArrayDeque<>();

        // Use an ArrayDeque like a stack.
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("ArrayDeque (used as stack): " + adq);

        System.out.print("Popping the stack: ");
        while(adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();

        System.out.println("ArrayDeque (used as stack) after popping all elements: " + adq);
    }
}
