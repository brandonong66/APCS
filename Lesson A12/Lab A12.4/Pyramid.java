/**
 * @author Brandon Ong
 * Period #3
 * 
 */
public class Pyramid {
	/**
	 * Method to make a pyramid
	 * @param n - height of the pyramid
	 */

	public static void pyramid(int n)
	{
	   int row;
	   int a;
	   int numOfSpaces;
	   int numOfStars=1;
	   for(row=1;row<=n;row++){
	      numOfSpaces = n-row;
	      a=2*row-1;
	      int space;
	      for(space=1;space<=n-row;space++){
	         System.out.print(" ");
	      }
	      while(a>0){
	      System.out.print("*");
	      a--;
	      }
	      System.out.println();
	   }
   }
}





