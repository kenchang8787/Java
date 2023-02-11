package kenchang8787.com;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weapon implements IWeapon {

  private String name;
  private int hitPoint;

  /** 武器攻擊行為 */
  @Override
  public void attack() {
    System.out.println("使用 " + name + " 造成 " + hitPoint + " 點傷害");
  }
}
