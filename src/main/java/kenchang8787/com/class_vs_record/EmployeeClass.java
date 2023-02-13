package kenchang8787.com.class_vs_record;

import java.util.Objects;

/** 定義一個類別, 並定義內容如下, 若是直接 class -> record, 就會幫你做了 */
public class EmployeeClass {

  private final String name;
  private final int id;

  public EmployeeClass(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return String.format("%s(name=%s, id=%s)", "EmployeeClass", this.getName(), this.getId());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmployeeClass that = (EmployeeClass) o;
    return id == that.id && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }
}
