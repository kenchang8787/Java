package kenchang8787.com;

public class Main {
  public static void main(String[] args) {

    EmployeeClass employeeClass = new EmployeeClass("Ken", 1);
    System.out.println(employeeClass);

    EmployeeRecord employeeRecord = new EmployeeRecord("Ken", 1);
    System.out.println(employeeRecord);
    System.out.println(employeeRecord.nameToUpperCase());
    EmployeeRecord.printWhatever();
  }
}
