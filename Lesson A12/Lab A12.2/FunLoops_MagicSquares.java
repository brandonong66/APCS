/**
 * 
 * @author Brandon Ong
 * Period #3
 *
 */
public class FunLoops {
	
	
	
	
	/**
	 * Method to find the first n magic squares
	 * @param n - number of magic squares to find
	 */
	public static void magicSquares(int n)
	{
		//Your code goes here
		//finding sum
		int a;
		int num=1;
		int sum;
		int sumNextNum;
		int numOfMagicSquares=0;
		int squareTestNum;
		while(numOfMagicSquares<n)
		{
		   a=0;
		   sum=0;
		   sumNextNum=0;
		   while(a<=num)
		   {
		      
		      sum=sum+sumNextNum;
		      sumNextNum++;
		      a++;
		   }
		   //finding if sum is a perfect square
		   squareTestNum=1;
		   while(squareTestNum*squareTestNum<sum)
		   {
		      squareTestNum++;
		   }
		   if(Math.pow(squareTestNum,2)==sum)
		   {
		      numOfMagicSquares++;
		      System.out.print(sum+" ");
		   }
		   
		   
		   num++;
		   
		}

	}
	
}


