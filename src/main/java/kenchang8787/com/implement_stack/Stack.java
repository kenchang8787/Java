package kenchang8787.com.implement_stack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/** 用 Link List 實作 Stack, FILO */
@NoArgsConstructor
public class Stack {

  @AllArgsConstructor
  private static class Node {
    private Object data;
    private Node next;
  }

  /** the size of stack */
  @Getter private int size;
  /** the head of stack */
  private Node head;

  /** 將資料存入stack中, 放在頭 */
  public void push(Object data) {
    head = new Node(data, head);
    size++;
  }

  /** 從stack取得資料, 從頭取 */
  public Object pop() throws Exception {
    if (head == null) throw new Exception("No Head");

    Object temp = head.data;
    head = head.next;
    size--;

    return temp;
  }
}
