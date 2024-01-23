package runtimepolymorphism;

public class Manager extends Employee {
	
	private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for manager: " + super.name);
        double salary = super.baseSalary + bonus;
        System.out.println("Base Salary: $" + super.baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + salary);
    }

}
