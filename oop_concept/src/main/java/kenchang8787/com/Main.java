package kenchang8787.com;

import kenchang8787.com.BadEmployee;
import kenchang8787.com.Employee;
import kenchang8787.com.GoodEmployee;

public class Main {
    public static void main(String[] args) {

        Employee john = new BadEmployee("John");
        Employee ken = new GoodEmployee("Ken");

        System.out.println(john.work());
        System.out.println(ken.work());
    }
}
