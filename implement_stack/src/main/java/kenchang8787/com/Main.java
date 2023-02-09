package kenchang8787.com;

public class Main {
  public static void main(String[] args) {
    Stack s1 = new Stack();
    Stack s2 = new Stack();
    s1.push("abc");
    s1.push("def");
    s2.push("123");
    s2.push("456");

    try {
      System.out.println(s1.pop());
      System.out.println(s2.pop());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
