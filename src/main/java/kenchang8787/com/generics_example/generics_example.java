package kenchang8787.com.generics_example;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class generics_example {

  public static void main(String[] args) {

    Printer<Integer> integerPrinter = new Printer<>(23);
    integerPrinter.print();

    Printer<Double> doublePrinter = new Printer<>(33.5);
    doublePrinter.print();

    shout("My name is Ken Chang", "I'm a backend engineer");
    shout("I want a Job", "Give me a Job");

    var list = new ArrayList<Integer>();
    list.add(3);
    list.add(5);
    list.add(-19);
    printList(list);

    var anotherList = new ArrayList<String>();
    anotherList.add("Ken");
    anotherList.add("need");
    anotherList.add("a Job");
    printList(anotherList);
  }

  private static <T, V> void shout(T thingToShout, V otherThingToShout) {
    System.out.println(thingToShout + "!!!!!");

    System.out.println(otherThingToShout + "!!!!!!");
  }

  private static void printList(List<?> myList) {
    System.out.println(Arrays.toString(myList.toArray()));
  }
}
