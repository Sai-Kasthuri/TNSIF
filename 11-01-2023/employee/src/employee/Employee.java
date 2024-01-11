package employee;

public class Employee {
	private String name;
	private int eid;
	private double salary;
	
	Employee()
	{
		name="Sai";
		eid=123;
		salary=35000;
	}
	
	Employee(String name1, int eid, double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	public void getDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Employee ID: "+eid);
		System.out.println("Salary: "+salary);
	}
}
