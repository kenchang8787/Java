package kenchang8787.com;


/**
 * This class is represents the concept of Polymorphism,
 * it overrides the 'work' method from parent class
 */
public class GoodEmployee extends Employee {

    public GoodEmployee(String name) {
        super(name);
    }

    @Override
    public String work() {
        return this.getName() + " work great!";
    }
}
