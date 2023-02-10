package kenchang8787.com.arithmetic;

/** 四則運算的計算機 */
public class ArithmeticCalculator {

  private IStrategy strategy;

  /** 設定演算法 (這是屬於工廠模式的概念) */
  public void setStrategy(Algorithm algorithm) {

    switch (algorithm) {
      case Add -> this.strategy = new Add();
      case Minus -> this.strategy = new Minus();
      case Multiple -> this.strategy = new Multiple();
      case Divide -> this.strategy = new Divide();
    }
  }

  /** 執行運算 */
  public void execute(int a, int b) {
    System.out.println(strategy.calculate(a, b));
  }

  /** 演算法 */
  public enum Algorithm {
    Add,
    Minus,
    Multiple,
    Divide
  }
}
