package kenchang8787.com.custom_exception;

public class CustomException {

  public static void main(String[] args) throws AgeLessThanZeroException {
    // 基本上自定義Exception
    // 就是一個類繼承自現有的Exception類別
    // 再額外定義出自己的邏輯
    validateAge(10);
    validateAge(-1);
  }

  private static void validateAge(int age) throws AgeLessThanZeroException {

    if (age < 0) throw new AgeLessThanZeroException("age must be negative");

    if (age == 0) throw new AgeLessThanZeroException(new RuntimeException("age cannot be zero"));

    if (age > 200)
      throw new AgeLessThanZeroException("long live the king", new IllegalArgumentException());
  }
}
