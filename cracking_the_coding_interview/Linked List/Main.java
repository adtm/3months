package c_linked_list;


public class Main {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList(1);
    linkedList.add(2);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(4);
    linkedList.add(5);
    linkedList.removeDuplicates();
    linkedList.traverse();
  }
}
