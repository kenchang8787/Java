package kenchang8787.com;

public class Main {
  public static void main(String[] args) throws AgeLessThanZeroException {
    validateAge(-1);
  }

  private static void validateAge(int age) throws AgeLessThanZeroException {

    if (age < 0) {
      throw new AgeLessThanZeroException(new RuntimeException());
    }
  }
}
