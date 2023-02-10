package kenchang8787.com.price;

/** 交通工具費用計算機 */
public class PriceCalculator {

  IStrategy strategy;

  /** 設定交通工具 (這是屬於工廠模式的概念) */
  public void setStrategy(Transportation transportation) {
    switch (transportation) {
      case BUS -> this.strategy = new TakeBus();
      case MRT -> this.strategy = new TakeMRT();
    }
  }

  /** 計算票價 */
  public void execute(int km) {
    System.out.println("$" + strategy.calculate(km));
  }

  /** 交通工具 */
  public enum Transportation {
    BUS,
    MRT
  }
}
