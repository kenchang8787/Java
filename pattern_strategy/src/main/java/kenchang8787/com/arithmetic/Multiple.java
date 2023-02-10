package kenchang8787.com.arithmetic;

/** 乘法 */
class Multiple implements IStrategy {

  /** 計算 */
  @Override
  public int calculate(int a, int b) {
    return a * b;
  }
}
