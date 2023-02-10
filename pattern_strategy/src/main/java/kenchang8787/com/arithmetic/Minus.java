package kenchang8787.com.arithmetic;

/** 減法 */
class Minus implements IStrategy {

  /** 計算 */
  @Override
  public int calculate(int a, int b) {
    return a - b;
  }
}
