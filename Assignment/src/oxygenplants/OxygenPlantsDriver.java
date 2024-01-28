package oxygenplants;
import java.util.Scanner;

public class OxygenPlantsDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the length of the room(in m): ");
		double length=sc.nextDouble();
		System.out.println("Enter the breadth of the room(in m): ");
		double breadth=sc.nextDouble();
		System.out.println("Enter the plant area of a single plant(in cm2): ");
		double plantArea=sc.nextDouble();
		
		OxygenPlants op=new OxygenPlants(length, breadth, plantArea);
		
		op.calculate();
		
	}

}
