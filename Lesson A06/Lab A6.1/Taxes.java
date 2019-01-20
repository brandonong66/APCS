/**
 * Taxes class - class used to calculate the federal, social security and state
 * taxes
 * 
 * @author Brandon Ong
 * period #3
 */

public class Taxes {
	// declare instance variables

	// Your code goes here

	// declare constants

	// Your code goes here
	private double hoursWorked;
	private double hourlyRate;
	private final double FEDERALTAX = 0.15;
	private final double FICA = 0.0765;
	private final double STATETAX = 0.04;
/**
 * constructor
 * @param hours Hours worked
 * @param rate Hourly rate dollars per hour
 */
 
	public Taxes(double hours, double rate) {

		// Your code goes here
		hourlyRate = rate;
		hoursWorked = hours;
	}// end constructor
/**
 * gets amount of hours worked
 * @return hours worked
 */
 
	public double getHoursWorked() {

		// Your code goes here
		return hoursWorked;
	}// end method
/**
 * gets hourly rate 
 * @return hourly rate
 */
	public double getHourlyRate() {

		// Your code goes here
		return hourlyRate;
	}// end method
/**
 * gets federal tax rate
 * @return federal tax rate
 */
 
	public double getFedTaxRate() {

		// Your code goes here
		return FEDERALTAX;
	}// end method
/**
 * gets social security tax rate
 * @return social security tax rate
 */
 
	public double getSocSecurityRate() {

		// Your code goes here
		return FICA;
	}// end method
/**
 * gets state tax rate
 * @return state tax rate
 */
 
	public double getStateTaxRate() {
		return STATETAX;
		// Your code goes here

	}// end method
/**
 * calculates gross pay
 * @return gross pay
 */
 
	public double computeGrossPay() {

		// Your code goes here
		double grossPay = hoursWorked * hourlyRate;
		return grossPay;
	}// end method
/**
 * calculates total money taken for federal tax
 * @return money taken for federal tax
 */
 
	public double computeFedTax() {

		// Your code goes here
		double fedTax = computeGrossPay() * FEDERALTAX;
		return fedTax;
	}// end method
/**
 * calculates money taken for social security tax
 * @return money taken for social security tax
 */
 
	public double computeSocSecurity() {
		double socSecurity = computeGrossPay() * FICA;
		return socSecurity;
		// Your code goes here

	}// end method
/**
 * calculates money taken for state tax
 * @return money taken for state tax
 */
 
	public double computeStateTax() {

		// Your code goes here
		double stateTax = computeGrossPay() * STATETAX;
		return stateTax;
	}// end method
/**
 * calculates total money taken for all taxes
 * @return money taken for all taxes
 */
 
	private double computeTotalTax() {

		// Your code goes here
		double totalTax = computeFedTax() + computeSocSecurity() + computeStateTax();
		return totalTax;
	}// end method
/**
 * calculates net pay
 * @return net pay
 */
 
	public double computeNetPay() {

		// Your code goes here
		double netPay = computeGrossPay() - computeTotalTax();
		return netPay;
	}// end method

}





