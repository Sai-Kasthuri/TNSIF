package numbernames;

public class NumberNames {
	
	String number;
	NumberNames(String number)
	{
		this.number=number;
	}
	
	public void printNumber()
	{
		char leftbit=number.charAt(0);
		if(leftbit=='0')
		{
			System.out.println("Number should not start with zero");
			return;
		}
		else
		{
			for (int i=0;i<number.length();i++) 
			{
	            char n=number.charAt(i);
	            String nName=getName(n);
	            System.out.print(nName + " ");
	        }
		}
	}
	
	public String getName(char n)
	{
		switch(n)
		{
			case '0': return "zero";
			case '1': return "one";
			case '2': return "two";
			case '3': return "three";
			case '4': return "four";
			case '5': return "five";
			case '6': return "six";
			case '7': return "seven";
			case '8': return "eight";
			case '9': return "nine";
		}
		return " ";
	}

}
