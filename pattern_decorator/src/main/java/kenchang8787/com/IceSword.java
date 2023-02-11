package kenchang8787.com;

public class IceSword extends WeaponDecorator {
  public IceSword(Weapon weapon) {
    super(weapon);
  }

  @Override
  public void attack() {
    super.attack();

    System.out.println("敵人被攻擊的地方凍傷了, 行動力下降");
  }
}
