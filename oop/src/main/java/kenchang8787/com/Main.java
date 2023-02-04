package kenchang8787.com;

import kenchang8787.com.entities.BadEmployee;
import kenchang8787.com.entities.Employee;
import kenchang8787.com.entities.GoodEmployee;

public class Main {
    public static void main(String[] args) {

        Employee john = new BadEmployee("john");
        Employee ken = new GoodEmployee("ken");


        System.out.println(john.work());
        System.out.println(ken.work());
    }
}