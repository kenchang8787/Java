package kenchang8787.com;

/**
 *  This class represents the concept of Encapsulation,
 *  the 'name' of an employee is kept as private or 'encapsulated'.
 *  This defined the program could only access the name through the methods 'getName',
 *  so the name value will be safe and change predictably.
 */
public abstract class Employee {

    /**
     * Employee's constructor
     * @param name employee's name
     */
    public Employee(String name) {
        this.name = name;
    }

    /**
     * for store employee's name
     */
    private String name;

    /**
     * to get employee's name
     * @return employee's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * employee work
     * @return work result
     */
    public String work() {
        return this.name + " work...";
    }
}