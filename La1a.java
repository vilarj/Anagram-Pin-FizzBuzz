import java.util.Scanner;
public class LA1a {
	
	/**
	 * Returns an array with counts for each
	 * letter from a-z (case-insensitive),
	 * ignoring all other characters:
	 * 
	 * [0]: number of a/A's
	 * [1]: number of b/B's
	 * ...
	 * [25]: number of z/Z's
	 * 
	 * @param word input word
	 * @return count of case-insensitive letters
	 */
	public static int[] countLetters(String word) {
		int[] counts = new int[26];
		
		for (char c : word.toCharArray()) {
			c = Character.toLowerCase(c);
			if (c >= 'a' && c <= 'z') {counts[c-'a']++;}
		}
		
		return counts;
	}
	
	/**
	 * Compares two arrays and
	 * returns true if they have
	 * the same contents
	 * 
	 * @param c1 array 1
	 * @param c2 array 2
	 * @return true if c1 and c2 have the same contents
	 */
	public static boolean sameCounts(int[] c1, int[] c2) {
		if(c1.length != c2.length) {return false;}
		
		for(int i = 0; i < c1.length; i++) {
			if(c1[i] != c2[i]) {return false;}
		}
		return true;
	}

	/**
	 * Inputs two phrases and outputs
	 * if they are anagrams (ignoring
	 * case and any non-letter
	 * characters)
	 * 
	 * @param args command-line arguments, ignored
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String case1, case2;
		boolean theCase;
		int[] word1, word2;
		
		// storing the user's value into the respected variable of type String
		System.out.print("Enter phrase 1: ");
		case1 = input.nextLine();
		
		System.out.print("Enter phrase 2: ");
		case2 = input.nextLine();
		
		// Counting the letters
		word1 = countLetters(case1);
		word2 = countLetters(case2);
		
		// checking to see if they have the same content
		theCase = sameCounts(word1, word2);
		
		if(theCase == true) {System.out.println("These phrases are anagrams.");}
		else {System.out.println("These phrases are not anagrams.");}
		
    // closing the Scanner class
		input.close();
	}
}
