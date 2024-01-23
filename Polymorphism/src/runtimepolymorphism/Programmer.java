package runtimepolymorphism;

public class Programmer extends Employee{

	private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for programmer: " + super.name);
        double salary = super.baseSalary + overtimePay;
        System.out.println("Base Salary: $" + super.baseSalary);
        System.out.println("Overtime Pay: $" + overtimePay);
        System.out.println("Total Salary: $" + salary);
    }
	
}
