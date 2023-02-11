package kenchang8787.com;

public class Main {
  public static void main(String[] args) {

    IWeapon fireSword = new FireSword(new Weapon("火屬性劍", 13));

    IWeapon iceSword = new IceSword(new Weapon("冰屬性劍", 9));

    fireSword.attack();
    iceSword.attack();
  }
}
