package kenchang8787.com;

public class FireSword extends WeaponDecorator {
  public FireSword(Weapon weapon) {
    super(weapon);
  }

  @Override
  public void attack() {
    super.attack();

    System.out.println("敵人被攻擊的地方被灼傷了, 攻擊相同位置會讓敵人更痛");
  }
}
