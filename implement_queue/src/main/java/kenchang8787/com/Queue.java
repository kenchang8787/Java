package kenchang8787.com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** implement queue by Link List */
@Data
@NoArgsConstructor
public class Queue {

  @Data
  @AllArgsConstructor
  static class Node {
    private Object data;
    private Node next;
  }

  private int size;
  private Node head;
  private Node tail;

  public void put(Object data) {

    Node temp = new Node(data, null);

    if (tail != null) tail.next = temp;
    else head = temp;

    tail = temp;
    size++;
  }

  public Object get() throws Exception {

    if (head == null) throw new Exception("No Head!");

    Object temp = head.data;
    head = head.next;

    if (head == null) tail = null;

    size--;

    return temp;
  }
}
