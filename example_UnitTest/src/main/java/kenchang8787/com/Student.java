package kenchang8787.com;

public class Student {

  String firstName;
  String lastName;

  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFullName() {
    return this.firstName + " " + lastName;
  }
}
