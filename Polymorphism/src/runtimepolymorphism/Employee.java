package runtimepolymorphism;

public class Employee {

	protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void calculateSalary() {
        System.out.println("Calculating salary for employee: " + name);
        // Default implementation, can be overridden by subclasses
        double salary = baseSalary;
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + salary);
    }
	
}
