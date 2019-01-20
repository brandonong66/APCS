import java.io.File;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * 
 * Last name: Ong
 * First name: Brandon
 * Student ID: 12105776
 * period: 3
 *
 */
public class StopWordRemover {
	String stopList;
	String inFile, outFile;
	int maxLineLength;
	/**
	 * Initializes the input and output files and the max
	 * characters per line
	 * @param in - name of input file
	 * @param out - name of output file
	 * @param max - max characters per line (including spaces)
	 */
	public StopWordRemover(String in, String out, int max){
		//Your code goes here
		inFile = in;
		outFile = out;
		stopList = "a an the for of at on in to her she him his he her's and with was is";
		maxLineLength=max;
	}
	/**
	 * Removes the stop words and outputs the text to a file
	 * Each line of output is not more than max characters long
	 * @return the number of words removed
	 */
	public int removeStopWords(){
		//Your code goes here
		try
		{
		   Scanner in = new Scanner(new File(inFile));
		}
		catch(FileNotFoundException e)
		{
		   System.out.println("Error1: File not found");
		}
		
		try
		{
		   Scanner stop = new Scanner(stopList);
		}
		catch(IOException i)
		{
		   System.out.println("Error2: File not found");
		}
		
		try
		{
		   FileWriter out = new FileWriter(outFile);
		}
		catch(IOException i)
		{
		   System.out.println("Error3: File not found");
		}
		
		int pos=0;
		//check if words are in stop list
		while(in.hasNext())
		{
		   boolean isStopWord = false;
		   String currentWord=in.next();
		   //check if first word is in stop list
		   while(stop.hasNext()||!isStopWord)
		   {
		      if(currentWord.equals(stop.next()))
		      {
		         isStopWord=true;
		      }
		      else
		      {
		         out.write(currentWord,pos,pos+currentWord.length());
		         pos+=currentWord.length();
		      }
		   }
		}
	}
	
}

