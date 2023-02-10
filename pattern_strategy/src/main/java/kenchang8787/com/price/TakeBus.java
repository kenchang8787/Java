package kenchang8787.com.price;

/** 搭乘公車 */
class TakeBus implements IStrategy {

  /** 計算 */
  @Override
  public int calculate(int km) {
    //  一段票15元
    //  十公里內一段票，超過十公里兩段票

    int count = 0;

    if (km <= 10) {
      count = 1;
    } else {
      count = 2;
    }

    return count * 15;
  }
}
