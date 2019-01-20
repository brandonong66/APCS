import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * last name: Ong
 * first name: Brandon
 * student ID: 12105776
 * period: 3
 *
 */
public class Squeeze {
	String fname;//name of the file that contains text to be squeezed
	
	/**
	 * Constructor to initialize fname
	 * @param name - name of the file to be squeezed
	 */
	public Squeeze(String name)
	{
		//Your code goes here
		fname = name;
	}
	/**
	 * Method to remove and count any extra 
	 * leading spaces
	 * 
	 */
	public void squeezeText()
	{
		//Your code goes here
		Scanner in;
		try
		{
		   in = new Scanner(new File(fname));
		   //check if theres a line to read
		   while(in.hasNextLine())
		   {
		      //count how many spaces there are
		      int n=0;
		      String line = in.nextLine();
		      boolean hasSpace;
		      //check if line starts with space
		      if(line.charAt(0)==' ')
		      hasSpace = true;
		      else
		      hasSpace = false;
		      while(hasSpace)
		      {
		         n++;
		         line = line.substring(1,line.length());
		         //check again if line starts with space (after cutting one space from beginning)
		         if(line.charAt(0)==' ')
		         hasSpace = true;
		         else
		         hasSpace = false;
		      }
		      System.out.println(n+" "+line);
		   }
		}
		catch(IOException e)
		{
		   System.out.println("Error: " + e.getMessage());
		}
	}
}


