
// First Java Project 
// Reverse String 
// 2/8/14

import javax.swing.JOptionPane;

public class ReverseString {

	public static void main(String[] args) {
		// Declaring Variables
		String firstWord;
		String reverseWord = "";
		String holderChar = "";
		
		// Read in word from user as a String
		firstWord = JOptionPane.showInputDialog( "Enter word");
		
		// Read in characters from string in reverse into a char
		// Convert char into string
		// Concate string to previously initialized string. 
		for (int index = firstWord.length() - 1; index >= 0; --index ) {
			char aChar = firstWord.charAt(index);
			holderChar = String.valueOf(aChar);
			reverseWord = reverseWord.concat(holderChar);
		}
		
		// Print out reversed word
		JOptionPane.showMessageDialog(null, reverseWord);
		
		System.exit( 0 );
	}

}
