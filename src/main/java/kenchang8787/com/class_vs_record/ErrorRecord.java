package kenchang8787.com.class_vs_record;

public record ErrorRecord(int num, String error) {

  // 在record中, 若宣告不為 status 的屬性會報錯
  // public final int DEFAULT_ERROR_NUM = 0;
  public static final String DEFAULT_ERROR = "DEFAULT";

  /** 雖然說record會自動幫你產生AllArgConstructor, 但你仍然可以覆寫他 */
  public ErrorRecord(int num, String error) {
    if (num < 0) throw new IllegalArgumentException("error number should be negative");

    this.num = num;
    this.error = error;
  }

  /** 另外record內部也可以寫方法 */
  public String errorToUpperCase() {
    return this.error.toUpperCase();
  }

  /** 也可以寫靜態方法 */
  public static void printWhatever() {
    System.out.println("Whatever");
  }
}
