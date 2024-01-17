package labs_examples.datastructures.stack.examples;

import java.util.LinkedList;

public class CustomStackExample<V> {
    // create the LinkedList that will be used
    // as the underlying data structure
    private LinkedList<V> list = new LinkedList<>();
    /**
     * Adds an item to the stack
     * @param item to be added
     */
    public void push(V item) {
        // insert item into front of list
        list.addFirst(item);
    }

    /**
     * Removes an item from the stack
     * @return the removed item
     */
    public V pop() {
        try {
            // retrieve, remove, and return the first item
            return list.removeFirst();
        } catch (NullPointerException ex) {
            System.out.println("Exception" + ex);
            return null;
        }
    }

    /**
     * Determines if the stack is empty
     * @return true if empty, false if not empty
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * This empties the stack
     * @return void
     */
    public void clear() {
        // empty the linkedlist
        list.clear();
    }
}
