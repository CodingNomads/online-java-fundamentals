import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    // Create a LinkedList
    LinkedList<String> linkedList = new LinkedList<>();

    // Add elements to the LinkedList
    linkedList.add("linked");
    linkedList.add("lists");
    linkedList.add("are");
    linkedList.add("neat");

    // Print the LinkedList
    System.out.println(
      "LinkedList elements: " + linkedList);

    // Add an element to the front of the list
    linkedList.addFirst("Java");
    System.out.println(
      "After addFirst() " + linkedList);

    // Add an element at the back of the list
    linkedList.addLast("!!!");
    System.out.println(
      "After addLast()" + linkedList);

    // Remove an element from the LinkedList
    linkedList.remove("Java");
    System.out.println(
      "After remove(): " + linkedList);

    // Check if list contains an element
    if (linkedList.contains("neat")) {
      System.out.println("LinkedList contains neat");
    }

    // Check the size of the LinkedList
    System.out.println(
      "Size of the LinkedList: " + linkedList.size());

    // Iterate the LinkedList using enhanced for loop
    System.out.print("LinkedList elements (iterating): ");
    for (String word : linkedList) {
      System.out.print(word + " ");
    }
  }
}
