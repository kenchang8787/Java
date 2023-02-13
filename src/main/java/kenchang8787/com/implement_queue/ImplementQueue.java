package kenchang8787.com.implement_queue;

public class ImplementQueue {
  public static void main(String[] args) {
    Queue queue = new Queue();

    queue.put("123");
    queue.put("456");
    queue.put("abc");
    queue.put("def");

    try {
      System.out.println(queue.getSize());
      System.out.println(queue.get());
      System.out.println(queue.get());
      System.out.println(queue.get());
      System.out.println(queue.get());

    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
