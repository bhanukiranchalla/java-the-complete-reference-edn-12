package learn.collections;

import java.util.LinkedList;

// Demonstrate LinkedList. LinkedList implements the Deque interface.
class LinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list.
        LinkedList<String> ll = new LinkedList<>();

        // Add elements to the linked list.
        ll.add("L");
        ll.add("N");
        ll.add("K");
        ll.add("E");
        ll.add("D");

        ll.add(1, "I");

        System.out.println("Original contents: " + ll);

        // Remove elements from the linked list.
        ll.remove("E");
        ll.remove(4);

        System.out.println("Contents are deletion: " + ll);

        // Remove first and last elements.
        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll after deleting first and last: " + ll);

        // Get and set a value.
        String val = ll.get(1);
        ll.set(1, val + " Changed");

        System.out.println("ll after change: " + ll);
    }
}
