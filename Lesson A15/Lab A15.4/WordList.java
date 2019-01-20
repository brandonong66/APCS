import java.util.*;

/**
 * 
 * @author Brandon Ong
 * period # 3
 *
 */
public class WordList extends ArrayList<String> {
	// Your code goes here
	/**
	 * method to returns the number of words in this WordList that are exactly len
	 * letters long
	 * 
	 * @param len - length of the words to search for
	 * @return number of words in this list of length len
	 */
	public int numWordsOfLength(int len) {
		int n;
		int wordCount = 0;
		for (n = 0; n < size(); n++) {
			if (get(n).length() == len)
				wordCount++;
		}
		return wordCount;
	}

	/**
	 * All words that are exactly len letters long are removed from this WordList,
	 * with the order of the remaining words unchanged
	 * 
	 * @param len - length of the word to remove
	 */
	public void removeWordsOfLength(int len) {
		int n = 0;
		while (n < size()) {
			if (get(n).length() == len)
				remove(n);
			else
				n++;
		}
	}

	/**
	 * method to calculate the length of the longest word
	 * 
	 * @return length of the longest word
	 */
	public int lengthOfLongestWord() {
		int n;
		int letterCount = 0;
		for (n = 0; n < size(); n++) {
			if (get(n).length() > letterCount)
				letterCount = get(n).length();
		}
		return letterCount;
	}

}// end WordList

