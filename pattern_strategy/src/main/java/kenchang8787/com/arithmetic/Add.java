package kenchang8787.com.arithmetic;

/** 加法 */
class Add implements IStrategy {
  /** 計算 */
  @Override
  public int calculate(int a, int b) {
    return a + b;
  }
}
