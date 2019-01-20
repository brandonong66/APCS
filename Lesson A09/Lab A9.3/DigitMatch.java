/**
 * 
 * @author Brandon Ong
 * period #3
 */
public class DigitMatch {
	/**
	 * Counts the number of matching digits in the two given integers
	 * @param x - first integer
	 * @param y - second integer
	 * @return number of matching digits
	 */
	public int countMatch(int x, int y) {
		//Your code goes here
		if(x==0&&y==0)
		{
		   return 1;
		}
		else
		{
		   int num=0;
		   if(x%10==y%10)
		   {
		   num++;
		   }
		   if(x<10||y<10)
		   {
		   return num;
		   }
		   return num+countMatch(x/10,y/10);
		}
   }
}
