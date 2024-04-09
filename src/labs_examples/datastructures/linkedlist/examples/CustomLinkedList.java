package labs_examples.datastructures.linkedlist.examples;

/**
 * Example 1: Defining a Linked List class Can store any data which can be
 * compared (to enable searching) Has an internal Node class to manage each node
 */
public class CustomLinkedList<T extends Comparable<T>> {

  /**
   * Defines a Node for a Linked List Accepts any data which can be compared (to
   * enable searching)
   */
  class Node<T extends Comparable<T>> {
    public T data;
    public Node<T> next;

    /**
     * Constructor
     *
     * @param data The value to be stored
     */
    Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  // Tracks the head of the list
  private Node head;

  /**
   * Constructs an empty list
   */
  public CustomLinkedList() {
    this.head = null;
  }

  /**
   * Adds data to the head of the list
   *
   * @param data The value to add to the list
   */
  public void addHead(T data) {
    Node newNode = new Node(data);
    newNode.next = this.head;
    this.head = newNode;
  }

  /**
   * Adds data to the tail of the list
   *
   * @param data The value to add to the list
   */
  public void addTail(T data) {
    Node newNode = new Node(data);

    // Is the list empty?
    if (this.head == null) {
      this.head = newNode;
      return;
    }

    // Find the last item in the list
    Node currentNode = this.head;

    // Find the end of the list
    while (currentNode.next != null)
      currentNode = currentNode.next;

    // Link the new node here
    currentNode.next = newNode;

  }

  /**
   * Adds data before the node containing the compare value
   *
   * @param data    The value to add to the list
   * @param compare The value which should appear after data in the list
   */
  public void addBefore(T data, T compare) {
    Node newNode = new Node(data);

    // Is the list empty?
    if (this.head == null) {
      this.head = newNode;
      return;
    }

    // Is the head what we want to follow our new node?
    if (this.head.data == compare) {
      newNode.next = this.head;
      this.head = newNode;
      return;
    }

    // Find the node we want to follow the new node
    // This uses a trailing reference traversal
    Node compareNode = this.head;
    Node trailingNode = null;

    while (compareNode != null && compareNode.data != compare) {
      trailingNode = compareNode;
      compareNode = compareNode.next;
    }

    // We are either at the end of the list, or we found the compare data
    // In either case, we can insert newNode between previousNode and compareNode
    trailingNode.next = newNode;
    newNode.next = compareNode;

  }

  /**
   * Remove the head of the list and return that data item
   *
   * @return The data item removed from the list. If the list is empty, this
   *         returns null.
   */
  public T removeHead() {
    // Empty list
    if (this.head == null)
      return null;

    // Save the head to return
    Node returnNode = this.head;

    // Make the head the next item in the list
    this.head = this.head.next;

    // Return the saved head
    return (T) returnNode.data;
  }

  /**
   * Remove the tail of the list, and return that data item
   *
   * @return The value at the tail of the list. If the list is empty, this returns
   *         null.
   */
  public T removeTail() {
    // Empty list
    if (this.head == null)
      return null;

    // Only one item in the list?
    if (this.head.next == null) {
      // We just need to return it
      Node returnNode = this.head;
      this.head = null;
      return (T) returnNode.data;
    }

    // Otherwise, we walk the list with two nodes
    Node returnNode = this.head;
    Node trailingNode = returnNode;

    // As long as we're not at the end
    while (returnNode.next != null) {
      // Make sure trailing node follows one link back
      trailingNode = returnNode;
      returnNode = returnNode.next;
    }

    // We set trailing node as the new end of the list.
    trailingNode.next = null;
    return (T) returnNode.data;
  }

  /**
   * Removes the first occurrence of specific data item from the list if it
   * exists.
   *
   * @param data The value to look for in the list
   */
  public void remove(T data) {
    // Is the list empty?
    if (this.head == null)
      return;

    Node removeNode = this.head;
    Node trailingNode = removeNode;

    // As long as we haven't:
    // - Reached the end of the list, and
    // - Found the data item
    // Keep walking the list
    while (removeNode != null && removeNode.data != data) {
      trailingNode = removeNode;
      removeNode = removeNode.next;
    }

    // If remove_node is null, then we didn't find anything
    if (removeNode != null)

      // Are we removing the head?
      if (removeNode == trailingNode)
        this.head = this.head.next;
      else
        // Excise this node from the list
        trailingNode.next = removeNode.next;

    // Question: Why don't we use find() here first?
  }

  /**
   * Indicates whether a piece of data is in the list
   *
   * @param data The value to find in the list
   * @return `true` if the data is found, `false` otherwise
   */
  public boolean find(T data) {
    // Set the current node to the head of the list
    Node currentNode = this.head;

    // As long as we haven't:
    // - Reached the end of the list, and
    // - Found the data item
    // Keep walking the list
    while (currentNode != null && currentNode.data != data)
      currentNode = currentNode.next;

    // If currentNode is null, then we never found it
    return currentNode != null;
  }
}
