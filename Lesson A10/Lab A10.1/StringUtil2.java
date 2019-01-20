/**
 * 
 * Last name: Ong 
 * First name: Brand0n
 * Student ID: 12105776
 * Period: 3
 *
 */
public class StringUtil2 
{
     /**
      * @param check - Character used to check
      * @return - returns boolean - to determine if character is a vowel/not vowel.
      */
     private static boolean isVowel(char check)
     {
        return check == 'a' || check == 'e' || check == 'i' || check == 'o' || check== 'u'
        || check == 'A' || check == 'E' || check == 'I' || check == 'O' || check == 'U';
     }
     /**
      * @param vowel - String to locate first vowel in.
      * @return - Returns location of first value, -1 if no values.
      */
     private static int locateVowel(String vowel)
     {
        for(int i = 0; i < vowel.length(); i++)
        {
           if(isVowel(vowel.charAt(i)))
           {
              return i;
           }
        }
        return -1;
     }
     /**
      * @param word - The word to convert to pig latin.
      * @return - Returns the word converted to pig latin.
      */
     private static String wordToPigLatin(String word)
     {
        String endString = "";
        char endLetter = word.charAt(word.length() - 1);
        if((endLetter >= 'a' && endLetter <= 'z') || (endLetter >= 'A' && endLetter <= 'Z'))
        {
            endString = "";  
        }
        else
        {
           endString += endLetter;
           word = word.substring(0, word.length() - 1);
        }
        int vowelLocation = locateVowel(word);
        if(vowelLocation < 0)
        {
           return word + "ay" + endString;
        }
        else if(vowelLocation == 0)
        {
           return word + "yay" + endString;
        }
        else
        {
           
           String end = word.substring(vowelLocation, word.length());
           String start = word.substring(0, vowelLocation);
           if(start.charAt(0) >= 'A' && start.charAt(0) <= 'Z')
           {
              end = (char)(end.charAt(0) - 32) + end.substring(1, end.length());
              start = (char)(start.charAt(0) + 32) + start.substring(1, start.length());
           }
           return end + start + "ay" + endString;
        }
     }
	  /** 
	  * Converts a string to it piglatin form according to the following rules:
	  * a. If there are no vowels in englishWord, then pigLatinWord is just
	  * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o',
	  * and 'u', and their uppercase counterparts.)
	  * b. Else, if englishWord begins with a vowel, then pigLatinWord is just
	  * englishWord + "yay".
	  * c. Otherwise (if englishWord has a vowel in it and yet doesn't start
	  * with a vowel), then pigLatinWord is end + start + "ay", where end
	  * and start are defined as follows:
	  * 1. Let start be all of englishWord up to (but not including) its
	  * first vowel.
	  * 2. Let end be all of englishWord from its first vowel on.
	  * 3. But, if englishWord is capitalized, then capitalize end and
	  * "uncapitalize" start.
	  *
	  * 
	  * @return piglatin version of text as a String 
	  * @param text - Phrase to be converted to pig latin.
	  */
	  public static String phraseToPigLatin(String text) 
	  {
	     boolean phraseComplete = false;
	     String returningPhrase = "";
	     int counter = 0;
	     String wordCurrent = "";
	     for(int i = 0; i < text.length(); i++)
	     {
	        if(text.charAt(i) == ' ')
	        {
	           returningPhrase += wordToPigLatin(wordCurrent) + " ";
	           wordCurrent = "";
	        }
	        else
	        {
	           wordCurrent += text.charAt(i);
	        }
	     }
	     returningPhrase += wordToPigLatin(wordCurrent);
	     return returningPhrase;
	  }
	  
}
