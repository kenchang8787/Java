package kenchang8787.com.generics_example;

import java.io.Serializable;

public class Printer<T extends Serializable> {

  T thingToPrint;

  public Printer(T thingToPrint) {
    this.thingToPrint = thingToPrint;
  }

  public void print() {
    System.out.println(this.thingToPrint);
  }
}
