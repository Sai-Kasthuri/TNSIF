package oxygenplants;

public class OxygenPlants {
	
	double length;
	double breadth;
	double plantArea;
	
	OxygenPlants(double length, double breadth, double plantArea)
	{
		this.length=length;
		this.breadth=breadth;
		this.plantArea=plantArea;
	}
	
	public void calculate()
	{
		double totalPlants=0;
		double oxygenProduction=0;
		if(length<0)
			System.out.println("Invalid length");
		else if(breadth<0)
			System.out.println("Invalid breadth");
		else if(plantArea<0)
			System.out.println("Invalid plant area");
		else if((length>0)&&(breadth>0)&&(plantArea>0))
		{
			totalPlants=((length*breadth)/plantArea)*100*100;
			int ones=(int)totalPlants%10;
			if(ones>5)
			{
				int difference=10-ones;
				totalPlants+=difference;
			}
			else
			{
				totalPlants-=ones;
			}
			oxygenProduction=totalPlants*0.9;
		}
		System.out.println("Total number of plants is "+(int)totalPlants);
		System.out.println("Total oxygen production is "+oxygenProduction);
	}

}
