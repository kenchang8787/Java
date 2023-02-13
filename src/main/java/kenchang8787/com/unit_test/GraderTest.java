package kenchang8787.com.unit_test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GraderTest {

  @Test
  public void fiftyNineShouldReturnF() {
    var grader = new Grader();

    var actual = grader.determineLetterGrade(59);

    assertEquals('F', actual);
  }

  @Test
  public void sistyNineShoudReturnD() {
    var grader = new Grader();

    var actual = grader.determineLetterGrade(69);

    assertEquals('D', actual);
  }

  @Test
  public void seventyNineShoudReturnC() {
    var grader = new Grader();

    var actual = grader.determineLetterGrade(79);

    assertEquals('C', actual);
  }

  @Test
  public void eightyNineShoudReturnB() {
    var grader = new Grader();

    var actual = grader.determineLetterGrade(89);

    assertEquals('B', actual);
  }

  @Test
  public void nintyNineShoudReturnA() {
    var grader = new Grader();

    var actual = grader.determineLetterGrade(99);

    assertEquals('A', actual);
  }

  @Test
  public void negativeOneShouldReturnException() {
    var grader = new Grader();

    assertThrows(
        IllegalArgumentException.class,
        () -> {
          grader.determineLetterGrade(-1);
        });
  }
}
