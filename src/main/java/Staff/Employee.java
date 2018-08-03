package Staff;

public abstract class Employee {

    // Instance Variables

    private String name;
    private String ni;
    private double salary;

    // Constructor
    public Employee(String name, String ni, Double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    // GETTER METHODS

    //Name Getter method

    public String getName(){
        return this.name;
    }

    //ni Getter method

    public String getni(){
        return this.ni;
    }

    //Salary Getter method

    public double getsalary(){
        return this.salary;
    }


    //Method for raise salary

    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    // Method payBonus which is 1% of salary

    public double payBonus(){
        return (this.salary *0.01);
    }


}
