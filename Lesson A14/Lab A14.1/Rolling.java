import java.util.*;
/**
 *   
 * @author Brandon Ong
 * period # 3
 */
  
public class Rolling {
	Random rand;
	/**
	 * constructor to initialize the random number
	 * generator
	 * @param s - seed for the random number generator
	 */
	public Rolling(int s)
	{
		rand = new Random(s);//makes new number generator
	}
	/**
	 * Method to simulate a dice roll
	 * @return an integer between 1 and 6
	 */
    private int roll() 
    { 
        //Your code goes here
        return rand.nextInt(6)+1;
    }
    
    /**  
     * Roll the dice three times and count the
     * number of tries it took to get all three
     * different rolls. In the end print a message
     * displaying the number of tries
     */
    public  void play() {
        //Your code goes here
        int count = 0;
        boolean different=false;
        while(!different)
        {
         int a = roll();
         int b = roll();
         int c = roll();
         count++;
         System.out.println(a+" "+ b +" "+c);
           if(!(a==b||a==c||b==c))
           {
              different = true;
           }
        }
        System.out.println("Rolled "+count+" times before all the rolls were different");
    }


    /** 
     * Answer to question 3 goes here
     * when a doesnt equal b, a doesnt equal c, and b doesnt equal c the loop finishes
     * (!(a==b||a==c||b==c))
     */
  
} 

