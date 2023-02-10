package kenchang8787.com;

import kenchang8787.com.arithmetic.ArithmeticCalculator;
import kenchang8787.com.price.PriceCalculator;

public class Main {
  public static void main(String[] args) {

    // arithmetic calculator
    ArithmeticCalculator calculator = new ArithmeticCalculator();

    calculator.setStrategy(ArithmeticCalculator.Algorithm.Add);
    calculator.execute(10, 2);

    calculator.setStrategy(ArithmeticCalculator.Algorithm.Minus);
    calculator.execute(10, 2);

    calculator.setStrategy(ArithmeticCalculator.Algorithm.Multiple);
    calculator.execute(10, 2);

    calculator.setStrategy(ArithmeticCalculator.Algorithm.Divide);
    calculator.execute(10, 2);

    // transportation price calculator
    PriceCalculator priceCalculator = new PriceCalculator();

    priceCalculator.setStrategy(PriceCalculator.Transportation.BUS);
    priceCalculator.execute(100);

    priceCalculator.setStrategy(PriceCalculator.Transportation.MRT);
    priceCalculator.execute(100);
  }
}
