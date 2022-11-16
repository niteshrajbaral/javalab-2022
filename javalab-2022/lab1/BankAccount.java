
import java.util.Scanner;
public class BankAccount
{
	String id;
	float balance;
	int transactionCount;
	String name;
	public BankAccount(String id, float balance, String name )
	{
		this.id = id;
		this.balance = balance;
		this.transactionCount = 0;
		this.name = name;
	}
	public void readAccountDetails()
	{
		Scanner b = new Scanner (System.in);
		System.out.println("Enter name: ");
		name = b.nextLine();
		System.out.println("Enter id: ");
		id = b.nextLine();
		System.out.println("Enter balance: ");
		balance = b.nextFloat();
	}
	String getAccountDetails()
	{
		return("ID: " + id + "Balance: " + balance + "Name: " + name );
	}
	void deposit(float amount)
	{
		balance = balance + amount;
		transactionCount++;
	}
	void withdraw(float amount)
	{
		balance = balance - amount;
		transactionCount++;
	}
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("", 1000 , "" );
		acc1.readAccountDetails();
		System.out.println( "Details \n"+ acc1.getAccountDetails());
		acc1.deposit(50);
		acc1.getAccountDetails();
		acc1.withdraw(25);
		acc1.getAccountDetails();
	}
}