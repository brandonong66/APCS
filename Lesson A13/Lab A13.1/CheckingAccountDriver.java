/**
 * 
 * @author Brandon Ong
 * Period #3
 */
public class CheckingAccountDriver {
	public static void main(String[] args)
	{
		// Your code goes here
		try
		{
		   CheckingAccount acc1 = new CheckingAccount(-100,100);
		}
		catch(IllegalArgumentException a)
		{
		   System.out.println("Negative balance in account 100");
		   try
		   {
		      CheckingAccount acc2 = new CheckingAccount(100,100);
		      acc2.deposit(-100);
		   }
		   catch(IllegalArgumentException b)
		   {
		      System.out.println("Negative amount deposited in account 102");
		      try
		      {
		         CheckingAccount acc3 = new CheckingAccount(100,100);
		         acc3.withdraw(200);
		      }
		      catch(IllegalArgumentException c)
		      {
		         System.out.println("Account 103 overdrawn");
		      }
		   }
		}
	}
}
