package kenchang8787.com.data_types;

public class DataTypes {

  public static void main(String[] args) {

    primitiveTypes();
    referenceTypes();
  }

  /** to print the primitive data types */
  private static void primitiveTypes() {
    // primitive data types
    boolean a = false;
    byte b = 127;
    short c = 32767;
    char d = '\u4fe5';
    int e = 2147483647;
    long f = 822337766;
    float g = 5.75f;
    double h = -3.25;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
  }

  /** to print the reference data types */
  private static void referenceTypes() {

    String a = "AA";
    Integer b = 323;
    Float c = 1.25F;
    Double d = 0.22;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
