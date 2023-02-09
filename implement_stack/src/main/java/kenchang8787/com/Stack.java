package kenchang8787.com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** implement stack by Link List */
@Data
@NoArgsConstructor
public class Stack {
  /** the size of stack */
  private int size;
  /** the node of head */
  private Node head;

  @Data
  @AllArgsConstructor
  static class Node {
    private Object data;
    private Node next;
  }

  /**
   * push data to stack
   *
   * @param data data
   */
  public void push(Object data) {
    head = new Node(data, head);
    size++;
  }

  /**
   * get head from stack
   *
   * @return head
   * @throws Exception throw if no head
   */
  public Object pop() throws Exception {
    if (head == null) {
      throw new Exception("No Head");
    }

    Object temp = head.getData();
    head = head.getNext();
    size--;

    return temp;
  }
}
