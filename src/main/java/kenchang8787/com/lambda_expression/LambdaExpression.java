package kenchang8787.com.lambda_expression;

import org.jetbrains.annotations.NotNull;

public class LambdaExpression {

  public static void main(String[] args) {

    Cat cat = new Cat("Jess", 3);

    printThing(cat);

    printThing(() -> System.out.println("Meow"));

    IPrintable lambdaPrintable = () -> System.out.println("Meow");
    printThing(lambdaPrintable);

    // --
    IPrintableWithParam lambdaPrintableWithParam = (s) -> System.out.println("Meow " + s);
    printThing(lambdaPrintableWithParam);

    // --
    ICombineString combineString = (p, s) -> p + "Meow" + s;
    combineThing(combineString);
  }

  static void printThing(@NotNull IPrintable printable) {
    printable.print();
  }

  static void printThing(@NotNull IPrintableWithParam printableWithParam) {
    printableWithParam.print("!");
  }

  static void combineThing(@NotNull ICombineString combineString) {
    System.out.println(combineString.combineString("! ", " !"));
  }
}
