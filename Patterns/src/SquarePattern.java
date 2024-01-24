
public class SquarePattern {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++)
		{
			for (int j=1; j<=6; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
//outer for loop -> row
//inner for loop -> column
//always consider left empty spaces