/**
 * @author Brandon Ong
 * @period # 3
 */
import java.util.*;


/**
 * this class creates lists of random permutations of the nubmers one to ten
 */
public class PermutationGenerator {
	//Your code goes here
	private final Random r;
	private ArrayList<Integer> l1 ;
	
	/**
	 * sets the seed for the random number generator
	 * @param seed - seed of the random number generator
	 */
	public PermutationGenerator(int seed)
	{
	   r = new Random(seed);
	}
	
	/**
	 * creates a random permutation of the numbers one to ten
	 */
	public void nextPermutation()
	{
	   l1 = new ArrayList<Integer>(10);
	   ArrayList<Integer> l2 = new ArrayList<Integer>(10);
	   int n = 1;
	   while(n<=10)
	   {
	      l2.add(new Integer(n));
	      n++;
	   }
	   
	   int a =10;
	   while(a>0)
	   {
	      int num = r.nextInt(a);
	      l1.add(l2.get(num));
	      l2.remove(num);
	      
	      a--;
	   }
	}
	/**
	 * returns list of words as a string
	 * @return list of words
	 */
	public String toString()
	{
	   return l1.toString();
	}
}




