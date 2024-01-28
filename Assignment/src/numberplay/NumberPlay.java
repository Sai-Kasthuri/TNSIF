package numberplay;

public class NumberPlay {
	
	int number;
	
	NumberPlay(int number)
	{
		this.number=number;
	}
	
	public void numberPlay()
	{
		int difference=0;
		if(number>9 && number<100)
		{
			int no=number;
			
			if(number>50)
			{
					int ones=no%10;
					int tens=no/10;
					difference=tens-ones;
			}
			else
			{
				int ones=no%10;
				int tens=no/10;
				int reverse=ones*10+tens;
				ones=reverse%10;
				tens=reverse/10;
				difference=tens-ones;
			}
			System.out.println("Difference is "+difference);
		}
		else 
		{
			System.out.println("Invalid number");
		}
	
	}

}
