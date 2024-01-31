package oxygenplants;
import java.util.Scanner;

public class OxygenPlantsDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the length of the room(in m): ");
		double length=sc.nextDouble();
		if(length<=0)
		{
			System.out.println("Invalid length");
			return;
		}
		System.out.println("Enter the breadth of the room(in m): ");
		double breadth=sc.nextDouble();
		if(breadth<=0)
		{
			System.out.println("Invalid breadth");
			return;
		}
		System.out.println("Enter the plant area of a single plant(in cm2): ");
		double plantArea=sc.nextDouble();
		if(plantArea<=0)
		{
			System.out.println("Invalid plant area");
			return;
		}
		double totalPlants=0;
		double oxygenProduction=0;
		totalPlants=((length*breadth)/plantArea)*100*100;
		int ones=(int)totalPlants%10;
		totalPlants-=ones; //totalplants=totalplants-ones;
		oxygenProduction=totalPlants*0.9;

		System.out.println("Total number of plants is "+(int)totalPlants);
		System.out.printf("Total oxygen production is %.2f",oxygenProduction);
		
		
		
		
		
		
		
	}

}
