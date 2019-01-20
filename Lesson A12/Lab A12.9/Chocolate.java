
/**
 * 
 * @author Brandon Ong
 * Period  #3
 *
 */
public class Chocolate {
	/**
	 * Checks if we can make chocolate bars
	 * @param big - number of big bricks
	 * @param small - number of small bricks
	 * @param goal - length of chocolate bar
	 * @return - true if we have enough bricks to make a chocolate bar, false otherwise
	 */
	public boolean canMakeBricks(int small, int big, int goal)
	{
		//Your code goes here	
		int x=0;
		while(goal-5*(big-x)<0){
		   x++;
		   
		}
		if(goal-5*(big-x)+small>=0)
		{
		   return true;
		}
		else
		{
		   return false;
		}
		
	}
	/**
	 * Determines number of small bricks needed to make the chocolate bar
	 * @param big - number of big bricks
	 * @param small - number of small bricks
	 * @param goal - length of chocolate bar
	 * @return number of small bricks needed
	 */
	
	public int numberOfSmallBricksNeeded(int small, int big, int goal)
	{
		//Your code goes here
		if(canMakeBricks(small, big, goal))
		{
		   int x=0;
		   while(goal-5*(big-x)<0){
		   x++;
		   }
		   return goal-5*(big-x);
		}
		else
		{
		   return -1;
		}
	}

}


