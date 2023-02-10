package kenchang8787.com;

public class Main {
  public static void main(String[] args) {

    Cat cat = new Cat("Jess", 3);

    printThing(cat);

    printThing(
        () -> {
          System.out.println("Meow");
        });

    Printable lambdaPrintable = () -> System.out.println("Meow");
    printThing(lambdaPrintable);

    // --
    PrintableWithParam lambdaPrintableWithParam = (s) -> System.out.println("Meow " + s);
    printThing(lambdaPrintableWithParam);

    // --
    CombineString combineString = (p, s) -> p + "Meow" + s;
    combineThing(combineString);
  }

  static void printThing(Printable printable) {
    printable.print();
  }

  static void printThing(PrintableWithParam printableWithParam) {
    printableWithParam.print("!");
  }

  static void combineThing(CombineString combineString) {
    System.out.println(combineString.combineString("! ", " !"));
  }
}
