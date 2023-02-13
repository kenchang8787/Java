package kenchang8787.com.oop_concept;

// 此類別把 "員工姓名" 設為 private
// 因此所有要取得員工姓名的人都要透過 getName
// 這樣就是對外封裝了 "員工姓名" 這個欄位
// 好處就是在此類中, 員工物件一但被宣告, 就不能被改名字了
// (也可以寫 setter, 讓要改名字的人都必定要經過我的 setter)
public abstract class Employee {

  /** 員工姓名 */
  private String name;

  public Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String work() {
    return String.format("%s work", name);
  }
}
