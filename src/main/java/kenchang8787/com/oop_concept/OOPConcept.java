package kenchang8787.com.oop_concept;

public class OOPConcept {
  public static void main(String[] args) {
    Employee john = new BadEmployee("John");
    Employee ken = new GoodEmployee("Ken");

    System.out.println(john.work());
    System.out.println(ken.work());
  }
}
