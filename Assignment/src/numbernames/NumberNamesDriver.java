package numbernames;
import java.util.Scanner;

public class NumberNamesDriver {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		String number=sc.nextLine();
		sc.close();
		NumberNames n=new NumberNames(number);
		n.printNumber();
		
	}

}
