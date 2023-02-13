package kenchang8787.com.custom_exception;

public class AgeLessThanZeroException extends IllegalArgumentException {

  public AgeLessThanZeroException(String message) {
    super(message);
  }

  public AgeLessThanZeroException(Throwable cause) {
    super(cause);
  }

  public AgeLessThanZeroException(String message, Throwable cause) {
    super(message, cause);
  }
}
