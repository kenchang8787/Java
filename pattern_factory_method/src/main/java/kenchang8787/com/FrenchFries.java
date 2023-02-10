package kenchang8787.com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 薯條商品 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FrenchFries implements Product {

  /** 薯條類型 */
  private String type = "";

  /** 描述自己是甚麼商品 */
  @Override
  public void describe() {
    System.out.println("我是" + type + "薯條");
  }
}
