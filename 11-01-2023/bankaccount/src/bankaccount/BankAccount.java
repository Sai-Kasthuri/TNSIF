package bankaccount;

public class BankAccount {
	private int accountno;
	private String accountname;
	private int balance;
	
	BankAccount(int accountno)
	{
		this.accountno=accountno;
	}
	
	BankAccount(int accountno, String accountname)
	{
		this.accountno=accountno;
		this.accountname=accountname;
	}
	
	BankAccount(int accountno, String accountname, int balance)
	{
		this.accountno=accountno;
		this.accountname=accountname;
		this.balance=balance;
	}
	
	public void accountCreation()
	{
		System.out.println("Account number: " + accountno + "\nAccount name:" + accountname + "\nAccount balance: " + balance);
	}
}
