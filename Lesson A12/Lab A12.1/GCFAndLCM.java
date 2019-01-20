/**
 * 
 * @author Brandon Ong
 * Period #3
 *
 */
public class GCFAndLCM {
	/**
	 * Method to find the greatest common divisor
	 * of the given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - the greatest common divisor
	 */
	public static int GCF(int a, int b) 
	{
		//Your code goes here
		int initialA=a;
		int initialB=b;
		while(a!=b){
		   if(a>b){
		      a=a-b;
		   }
		   else{
		      b=b-a;
		   }
		}
	
return a;
	}
	/**
	 * Method to find the least common multiple of the 
	 * given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - the least common multiple
	 */
	public static int LCM(int a, int b)
	{
		//Your code goes here
		return (a*b)/GCF(a,b);

	}

}

