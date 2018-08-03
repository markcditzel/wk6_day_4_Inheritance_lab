package Management;

import Staff.Employee;

public class Manager extends Employee {

    // Instance Variables

    private String deptName;

    // Constructor

    public Manager(String name, String ni, double salary, String deptName) { // open constructor
        super(name, ni, salary);
        this.deptName = deptName;
    } // close constructor

    // GETTER Method

    public String getDeptName() {
        return this.deptName;
    }

}
