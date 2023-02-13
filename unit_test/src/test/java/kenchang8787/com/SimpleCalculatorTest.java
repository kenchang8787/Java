package kenchang8787.com;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

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
