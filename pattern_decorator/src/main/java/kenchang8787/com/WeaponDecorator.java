package kenchang8787.com;

public abstract class WeaponDecorator implements IWeapon {

  private final Weapon weapon;

  public WeaponDecorator(Weapon weapon) {
    this.weapon = weapon;
  }

  @Override
  public void attack() {
    weapon.attack();
  }
}
