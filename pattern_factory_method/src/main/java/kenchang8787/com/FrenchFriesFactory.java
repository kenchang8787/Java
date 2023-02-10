package kenchang8787.com;

/** 薯條工廠 */
public class FrenchFriesFactory implements Factory {

  /** 薯條工廠返回商品 */
  @Override
  public Product getProduct() {
    return new FrenchFries();
  }

  /**
   * 薯條工廠返回商品
   *
   * @param type 薯條類型
   */
  public Product getProduct(String type) {
    return new FrenchFries(type);
  }
}
