package labs_examples.datastructures.queue.examples;

// Queue is generic so it can hold any object type
public class CustomQueue<V> {
  // create a LinkedList for to use as 
  // the underlying data structure
  // keep this private so it can't be modified
  // outside of this class
  private LinkedList<V> list = new LinkedList<>();

  /**
   * Adds an item to the Queue
   * @param item to be added
   */
  public void enqueue(V item) {
    // insert item into front of list
    list.addLast(item);
  }

  /**
   * Removes an item from the Queue
   * @return the removed item
   */
  public V dequeue() {
    if (list.isEmpty()){
      return null;
      // you could also throw an exception here
    }
    try {
      // get item from the front of the Queue
      V item = list.removeFirst();

      // return first item that you got just above
      return item;
    } catch (NullPointerException ex) {
      return null;
    }
  }

   /**
   * Removes true if the Queue is empty false
   * if the queue is not empty
   * @return boolean isEmpty
   */
  public boolean isEmpty(){
    // surface this method to be called for functionality
    return list.isEmpty();
  }
}	
