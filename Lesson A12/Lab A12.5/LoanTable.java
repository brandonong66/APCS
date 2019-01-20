/**
 * 
 * @author Brandon Ong
 * Period #3
 *
 */
public class LoanTable {
	//Declare your instance variables here
	private double ammountBorrowed;
	private double monthlyInterestRate;
	private double numMonthlyPayments;
	private double monthlyPayment;
	private double lowRate;
	private double highRate;
	private double annualRate;
	/**
	 * Constructor
	 * @param principal - principal amount borrowed
	 * @param years - number of years for the loan to be paid off
	 * @param low - low interest rate
	 * @param high - high interest rate
	 */
	public LoanTable(double principal, int years, double low, double high)
	{
		//Your code goes here
		ammountBorrowed = principal;
		lowRate=low;
		highRate=high;
		numMonthlyPayments=years*12;
		



	}
	/**
	 * Method to print the Loan table
	 */
	public void printTable()
	{
	   
	   
		
		
		//Print table heading
		System.out.println("Annual Interest Rate    Monthly Payment\n");
		//Your code goes here
		for(annualRate=lowRate;annualRate<=highRate;annualRate+=0.25){
		   //calculate
		   monthlyInterestRate=annualRate/1200.0;
		   double c=Math.pow((1+monthlyInterestRate),numMonthlyPayments);
		   monthlyPayment = (ammountBorrowed*monthlyInterestRate*c)/(c-1);
		System.out.printf("%15.2f %17.2f", annualRate, monthlyPayment);
		System.out.println();
		}
			

	}

}


