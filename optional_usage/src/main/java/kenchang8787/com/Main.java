package kenchang8787.com;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        /**
         * is important that the Optional<T> should better use only as a return type.
         *
         * <p>Although technically it support to declare it as a parameter
         *
         * <p>please refer this discussion on stack overflow:
         * https://stackoverflow.com/questions/31922866/why-should-java-8s-optional-not-be-used-in-arguments
         */
        Optional<Cat> optionalCat = findCatByName("Fred");

        if (optionalCat.isPresent()) System.out.println(optionalCat.get().getName());

        if (optionalCat.isEmpty()) System.out.println("Is empty");

        // or else ( if null then return a default that pass in )
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

        // return Optional.ofNullable(cat);
        return Optional.ofNullable(null);
    }
}
