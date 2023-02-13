package kenchang8787.com.class_vs_record;

public class ClassVsRecord {
  public static void main(String[] args) {

    var employeeClass = new EmployeeClass("Ken", 1);
    var employeeRecord = new EmployeeRecord("Ken", 1);

    System.out.println(employeeClass);
    System.out.println(employeeRecord);

    var errorRecord = new ErrorRecord(123, "Bad Request");
    System.out.println(errorRecord);
    System.out.println(errorRecord.errorToUpperCase());
    ErrorRecord.printWhatever();
  }
}
