package kenchang8787.com.lambda_expression;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat implements IPrintable {

  private String name;

  private int age;

  @Override
  public void print() {
    System.out.println("Meow");
  }
}
