package kenchang8787.com.oop_concept;

// 此類別繼承了父類, 故它會有父類所提供的屬性和方法 "getName", "work"..
// 此類別覆寫了父類別的work, 實現了多型
public class GoodEmployee extends Employee {
  public GoodEmployee(String name) {
    super(name);
  }

  @Override
  public String work() {
    return String.format("%s work great!", this.getName());
  }
}
