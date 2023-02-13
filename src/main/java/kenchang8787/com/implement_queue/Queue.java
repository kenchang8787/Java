package kenchang8787.com.implement_queue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/** 實作隊列 FIFO */
@NoArgsConstructor
public class Queue {

  /** 隊列內部儲存資料、和下一個Node的結構 */
  @AllArgsConstructor
  private static class Node {
    private Object data;

    private Node next;
  }

  /** 隊列的大小 */
  @Getter private int size;
  /** 隊頭 */
  private Node head;
  /** 隊尾 */
  private Node tail;

  /** 放資料進入隊列, 塞至隊尾 */
  public void put(Object data) {

    var temp = new Node(data, null);

    // 如果沒有隊尾, 新成員就是頭
    if (tail == null) head = temp;
    // 如果有隊尾, 直接把新成員加在隊尾的下一個
    else tail.next = temp;

    tail = temp;
    size++;
  }

  /** 從隊列中取資料, 從隊頭取 */
  public Object get() throws Exception {
    // 隊列中沒有資料
    if (head == null) throw new Exception("No Head");
    // 先把隊頭存到temp, 方便資料移位
    var temp = head.data;
    // 下一個Node當頭
    head = head.next;
    // 如果下一個Node沒資料, 重製一下尾巴
    if (head == null) tail = null;

    size--;

    return temp;
  }
}
