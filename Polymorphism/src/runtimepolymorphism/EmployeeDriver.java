package runtimepolymorphism;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
        
        employees[0] = new Manager("aaa", 50000, 10000);
        employees[1] = new Programmer("bbb", 45000, 5000);
        employees[2] = new Employee("ccc", 40000);
        
        employees[0].calculateSalary();
        employees[1].calculateSalary();
        employees[2].calculateSalary();
        
	}

}
