/**
 * 
 * Last name: Ong
 * First name: Brandon
 * Student ID: 12105776
 * Period # 3
 */
public class CheckingAccount {
	// Your code goes here
	private double myBalance;
	private int myAccountNumber;
	
	/**
	 * Default constructor sets balance and account number to 0
	 */
	 
	public CheckingAccount()
	{
	   myBalance = 0.0;
	   myAccountNumber=0;
	}
	
	/**
	 * parameter constructor initializes balance and account number
	 * @param initialBalance - initial amount of money in account
	 * @param acctNum - account number
	 */
	public CheckingAccount(double initialBalance, int acctNum)
	{
	   myBalance = initialBalance;
	   myAccountNumber=acctNum;
	   if(initialBalance<0)
	   {
	      throw new IllegalArgumentException("Negative balance in account "+myAccountNumber);
	   }
	}
	
	/**
	 * gets the balance
	 * @return balance in account
	 */
	public double getBalance()
	{
	   return myBalance;
	}
	
	/**
	 * deposits money into account
	 * @param amount - amount of money to be deposited
	 */
	public void deposit(double amount)
	{
	   myBalance+=amount;
	   if(amount<0)
	   {
	      throw new IllegalArgumentException("Negative amount deposited in account "+myAccountNumber);
	   }
	}
	
	/**
	 * withdraws money from account
	 * @param amount - amount of money to be withdrawn
	 */
	public void withdraw(double amount)
	{
	   myBalance-=amount;
	   if(amount>myBalance)
	   {
	      throw new IllegalArgumentException("Account "+myAccountNumber+" overdrawn");
	   }
	}
}
