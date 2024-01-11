package car;

public class Car {
	private String make;
	private String model;
	private int year;
	
	
	Car()
	{
		make="Toyota";
		model="Camry";
		year=2023;
	}
	
	Car(String make, String model, int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	public void display()
	{
		System.out.println("Make: " + make + " Model: " + model + " Year:" + year);
	}

}
