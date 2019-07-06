import java.util.Scanner;
public class LA2a {
	
	/**
	 * Number of digits in a valid value sequence
	 */
	public static final int SEQ_DIGITS = 10;
	
	/**
	 * Error for an invalid sequence
	 * (not correct number of characters
	 * or not made only of digits)
	 */
	public static final String ERR_SEQ = "Invalid sequence";
	
	/**
	 * Error for an invalid pin
	 * (not made entirely of 
	 * uppercase letters)
	 */
	public static final String ERR_PIN = "Invalid PIN";
	
	/**
	 * Converts an uppercase letter
	 * to the corresponding number on
	 * a standard phone
	 * 
	 * 1:
	 * 2: ABC
	 * 3: DEF
	 * 
	 * 4: GHI
	 * 5: JKL
	 * 6: MNO
	 * 
	 * 7: PQRS
	 * 8: TUV
	 * 9: WXYZ
	 * 
	 * *:
	 * 0: +
	 * #:
	 * 
	 * @param c assumed to be uppercase letter
	 * @return corresponding phone number
	 */
	public static int letterToPhone(char c) {
		
		if(c == 'A' || c == 'B' || c == 'C') {c = 2; return c;}
		else if(c == 'D' || c == 'E' || c == 'F') {c = 3; return c;}
		else if(c == 'G' || c == 'H' || c == 'I') {c = 4; return c;}
		else if(c == 'J' || c == 'K' || c == 'L') {c = 5; return c;}
		else if(c == 'M' || c == 'N' || c == 'O') {c = 6; return c;}
		else if(c == 'P' || c == 'Q' || c == 'R' || c == 'S') {c = 7; return c;} 
		else if(c == 'T' || c == 'U' || c == 'V') {c = 8; return c;}
		else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z'){c = 9; return c;}
		else if(c == '+') {return 0;}
		else {return 0;}
		
	}
	
	/**
	 * Takes an input PIN and produces a response
	 * via first converting each character via phone
	 * number, then using that as an index
	 * to a value sequence
	 * 
	 * @param pin input PIN (assumed to be uppercase letters)
	 * @param values input value sequence
	 * @return response
	 */
	public static int[] getResponse(String pin, int[] values) {
		int[] response = new int[pin.length()];
		
		for(int i = 0; i < response.length; i++) {response[i] = values[letterToPhone(pin.charAt(i))];}
		
		return response;
	}
	
	/**
	 * Returns true if the length of the
	 * input string is equal to the k
	 * parameter
	 * 
	 * @param s input string
	 * @param k length to check
	 * @return true if length of string 
	 */
	public static boolean stringIsKDigits(String s, int k) {
		boolean value;
		
		value = s.length() == k;
		
		return value;
	}
	
	/**
	 * Returns true if all the characters
	 * in the input string are '0' through '9'
	 * 
	 * @param s input string
	 * @return true if all characters in s are digits
	 */
	public static boolean allDigits(String s) {
		// hint: the Character class has a good method to test if one char is a digit
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))){return false;}
			}
		return true;
	}
	
	/**
	 * Returns true if all the characters
	 * in the input string are 'A' through 'Z'
	 * 
	 * @param s input string
	 * @return true if all characters are uppercase letters
	 */
	public static boolean allUppercaseLetters(String s) {
		// hint: the Character class has a good method to test if one char is an uppercase letter
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))){return false;}
			}
		return true;
	}
	
	/**
	 * Converts a string of digits to an
	 * array of integers (e.g. "12" -> {1, 2})
	 * 
	 * Assumes string is comprised of only digits!
	 * 
	 * @param s digit string
	 * @return corresponding integer array
	 */
	public static int[] digitStringToIntArray(String s) {
		// hint: the Character class has a good method to convert a char into an int
		int digit[] = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {digit[i] = Character.getNumericValue(s.charAt(i));}
		
		return digit;
	}
	
	/**
	 * Returns how many times a value
	 * occurs within an array
	 * 
	 * @param value needle
	 * @param values haystack
	 * @return how many times the needle occurs in the haystack
	 */
	public static int countValues(int value, int[] values) {
		int counting = 0;
		
		for(int i = 0; i < values.length; i++) {if(values[i] == value) {counting++;}}
		
		return counting;
	}
	
	/**
	 * Returns how many ways the response could have been
	 * produced from a given value sequence
	 * 
	 * @param response output
	 * @param values value sequence
	 * @return how many PINs could have produced the same response given the value sequence
	 */
	public static int numPossible(int[] response, int[] values) {
		int result = 1;
		
		for(int i = 0; i < response.length; i++) {result = result * countValues(response[i], values);}
		
		return result;
	}
	
	/**
	 * Inputs a value sequence and PIN,
	 * outputs challenge response
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		final Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter value sequence: ");
		final String sequence = input.nextLine();
		
		System.out.printf("Enter PIN: ");
		final String pin = input.nextLine();
		
		if(!stringIsKDigits(sequence, SEQ_DIGITS) || !allDigits(sequence)) {System.out.println(ERR_SEQ);}
		else if(!allUppercaseLetters(pin)) {System.out.println(ERR_PIN);}
		else {
			int values[] = digitStringToIntArray(sequence);
			int response[] = getResponse(pin, values);
			
			System.out.print("Response: ");
			
			for(int i = 0; i < response.length; i++) {System.out.print(response[i]);}
			
			System.out.println();
		}
	}
}
