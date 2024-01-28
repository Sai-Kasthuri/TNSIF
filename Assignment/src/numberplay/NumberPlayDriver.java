package numberplay;
import java.util.Scanner;

public class NumberPlayDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		NumberPlay np=new NumberPlay(number);
		np.numberPlay();
		sc.close();;
	}
}
