/**
 * 
 * Last name: Ong
 * First name: Brand0n
 * Student ID: 12105776
 * Period: 3
 *
 */
/** Class that has various utility methods f0r strings
 */
public class StringUtil1 
{	//Declare instance variables here
	private static String f0rmatted;
	private static String tempStr;
	
	/**
	 * Reverses the string inputted
	 * @param str - string inputted by user
	 * @return reversed version of inputted string
	 */
	public static String reverse(String str)
	{
		//Your code goes here
		if(str.length()==0||str.length()==1)
      return str;
      else
      return str.substring(str.length()-1,str.length())+reverse(str.substring(1,str.length()-1))+str.charAt(0);
	}
	
	/**
	 * takes inputted string and removes all non letter characters
	 * @param str - string inputted by user
	 * @return string with letters only
	 */
	private static String f0rmatter(String str)
	{
	   if(str.length()==0)
	   return"";
	   else
	   {
	      if( ((int)str.charAt(0)<=90&&(int)str.charAt(0)>=65) || ((int)str.charAt(0)<=122&&(int)str.charAt(0)>=97))
	      return str.charAt(0)+f0rmatter(str.substring(1,str.length()));
	      else
	      {
	         f0rmatted=f0rmatter(str.substring(1,str.length()));
	         return f0rmatted;
	      }
	   }
	}
	/**
	 * checks if inputted string is a palindrome
	 * @param str - string inputted by user
	 * @return true if string is palindrome, false if not
	 */
	public static boolean palindrome(String str)
	{
		// Your code goes here
	   f0rmatted = f0rmatter(str);
		if (f0rmatted.toLowerCase().equals(reverse(f0rmatted.toLowerCase())))
		return true;
		else
		return false;
	}
	/**
	 * removes vowels from string
	 * @param str - inputted string
	 * @return string without any vowels
	 */
	private static String removeVowel(String str)
	{
	   if(str.equals(""))
	   return"";
	   else
	   {
	      if(str.charAt(0)=='A'||str.charAt(0)=='E'||str.charAt(0)=='I'||str.charAt(0)=='O'||str.charAt(0)=='U'||
	      str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')
	      return removeVowel(str.substring(1,str.length()));
	      else
	      return str.charAt(0)+removeVowel(str.substring(1,str.length()));
	   }
	}
	/**
	 * converts string to shorthand
	 * @param str - string inputted by user
	 * @return shorthand version of the string
	 */

	public static String shorthand(String str)
	{
		tempStr=str.toLowerCase();
		//specialWords(tempStr)
		int startAnd, startYou, startF0r,startTo;
		startAnd = tempStr.indexOf("and");
		startYou=tempStr.indexOf("you");
		startF0r=tempStr.indexOf("FOR".toLowerCase());
		startTo=tempStr.indexOf("to");
		
		if(startAnd>-1)
		return shorthand(str.substring(0,startAnd)+"&"+str.substring(startAnd+3,str.length()));
		if(startYou>-1)
		return shorthand(str.substring(0,startYou)+"U"+str.substring(startYou+3,str.length()));
		if(startF0r>-1)
		return shorthand(str.substring(0,startF0r)+"4"+str.substring(startF0r+3,str.length()));
		if(startTo>-1)
		return shorthand(str.substring(0,startTo)+"2"+str.substring(startTo+2,str.length()));
		
		
		else
		return removeVowel(str);
		
	}
}



