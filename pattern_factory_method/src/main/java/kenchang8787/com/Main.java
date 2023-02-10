package kenchang8787.com;

public class Main {
  public static void main(String[] args) {

    FrenchFriesFactory friesFactory = new FrenchFriesFactory();

    Product fries = friesFactory.getProduct();
    Product typeFries = friesFactory.getProduct("無鹽");

    fries.describe();
    typeFries.describe();
  }
}
