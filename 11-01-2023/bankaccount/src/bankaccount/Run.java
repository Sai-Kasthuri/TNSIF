package bankaccount;

public class Run {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount(123, "AAA", 5000);
		b1.accountCreation();
		
		BankAccount b2=new BankAccount(456, "BBB");
		b2.accountCreation();
		
		BankAccount b3=new BankAccount(789);
		b3.accountCreation();

	}

}
