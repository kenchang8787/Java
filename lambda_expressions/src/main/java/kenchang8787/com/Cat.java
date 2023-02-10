package kenchang8787.com;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat implements Printable {
  /** the name fo the cat */
  private String name;
  /** the age of the cat */
  private int age;

  @Override
  public void print() {
    System.out.println("Meow");
  }
}
