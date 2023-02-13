package kenchang8787.com.unit_test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

  @Test
  public void twoPlusTwoIsFour() {

    var calculator = new SimpleCalculator();
    var actual = calculator.add(2, 2);

    assertEquals(4, actual);
  }

  @Test
  public void threePlusSevenIsTen() {

    var calcualtor = new SimpleCalculator();
    var actual = calcualtor.add(3, 7);

    assertEquals(10, actual);
  }
}
