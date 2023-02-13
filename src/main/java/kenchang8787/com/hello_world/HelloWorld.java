package kenchang8787.com.hello_world;

public class HelloWorld {
  public static void main(String[] args) {

    sayHello(1);

    sayHello(3);
  }

  private static void sayHello(int num) {

    for (int i = 0; i < num; i++) System.out.println("Hello Java");
  }
}
