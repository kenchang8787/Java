package kenchang8787.com.price;

/** 搭乘捷運 */
class TakeMRT implements IStrategy {
  /** 計算 */
  @Override
  public int calculate(int km) {

    //  小於十公里20元，超過每五公里多五元

    if (km <= 0) return 0;

    if (km <= 10) return 20;

    int count = ((km - 10) / 5) + 1;
    return 20 + 5 * count;
  }
}
