package kenchang8787.com.optional_usage;

import java.util.Optional;

public class OptionalUsage {

  public static void main(String[] args) {

    // 雖然沒有硬性規定, 但 Optional<T> 最好是用在方法的返回值
    // 請參考此篇文章
    // https://stackoverflow.com/questions/31922866/why-should-java-8s-optional-not-be-used-in-arguments

    var optionalCat = findCatByName("Fred");

    optionalCat.ifPresent(cat -> System.out.println(cat.getName()));

    if (optionalCat.isEmpty()) System.out.println("Is empty");

    // orElse, 如果是null, 則允許填入一個預設值
    System.out.println(optionalCat.orElse(new Cat("Unknown", 0)).getName());

    // use lambda expression
    // optionalCat.orElseGet();

    // just optionalCat.get()
    // optionalCat.orElseThrow();

    System.out.println(optionalCat.map(Cat::getAge));
    System.out.println(optionalCat.map(Cat::getAge).orElse(0));
  }

  private static Optional<Cat> findCatByName(String name) {
    Cat cat = new Cat(name, 3);

    return Optional.ofNullable(cat);
    // return Optional.empty();
  }
}
