package kenchang8787.com.custom_annotation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@VeryImportant
public class Cat {

  @ImportantString public String name;
  public int age;

  @RumImmediately(times = 3)
  public void meow() {
    System.out.println("meow");
  }

  public void eat() {
    System.out.println("munch");
  }
}
