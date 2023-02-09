package kenchang8787.com;

/**
 * record cannot extend any class, but record could implement the interfaces.
 *
 * <p>record is implicitly to be a final class.
 *
 * <p>record's field cannot be changed.
 *
 * @param name
 * @param id
 */
public final record EmployeeRecord(String name, int id) {

  public static final String DEFAULT_EMPLOYEE_NAME = "George";

  // these will get error
  // private String someField;
  private static String someField = "QQ";

  /**
   * record will automatically generate canonical constructor, but you could still overwrite it in
   * customize way.
   *
   * @param name
   * @param id
   */
  public EmployeeRecord(String name, int id) {
    if (id < 0) {
      throw new IllegalArgumentException("employee id cannot be negative");
    }

    this.name = name;
    this.id = id;
  }

  public String nameToUpperCase() {
    return this.name.toUpperCase();
  }

  public static void printWhatever() {
    System.out.println("Whatever");
  }
}
