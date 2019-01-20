/**
 *   
 * @author Brandon Ong
 * Period #3
 */
/** Class for finding fibonacci number
 */
public class Fibonacci {
	/**
	 * takes in a number n and finds the fibonacci number for that position
	 * @param n - position number
	 * @return - fibonacci number
	 */

	public int fib(int n)
	{
		//Your code goes here
		if(n>1)
		return  fib(n-1) + fib(n-2);
		if(n==1)
		return 1;
		else
		return 0;
	}//end method

}//end class




