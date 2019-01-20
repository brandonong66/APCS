import java.io.*;
import java.util.*;
/**
 * 
 * Last name: Ong
 * First name: Brandon
 * Student ID: 12105776
 * Period: 3
 *
 */
public class Average {
	//Your code goes here
	private long total;
	private String fileName;
	
	/**
	 * constructor initializes the file name to fileName
	 * @param name - file name
	 */
	public Average(String name)
	{
	   fileName = name;
	}
	
	/**
	 * scans the file and reads the data. returns the average
	 * @return average of the numbers
	 */
	public double scanDataAndCalculateAverage()
	{
	   try
	   {
	      int total=0;
	      int num=0;
	      Scanner in = new Scanner(new File(fileName));
	      if(!in.hasNext())
	      throw new NullPointerException(fileName +" is empty");
	      if(!in.hasNextInt())
	      throw new IllegalArgumentException(fileName+" does not have numeric data");
	      while(in.hasNext())
	      {
	         total+=in.nextInt();
	         num+=1;
	      }
	      return (double) total/num;
	   }
	   catch(IOException e)
	   {
	      System.out.println("Error: "+fileName+" (No such file or directory)");
	      return 0;
	   }
	}
}

