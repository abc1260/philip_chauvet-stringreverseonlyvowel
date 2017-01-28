package demo.stringprocessing;

/**
 * Algorithm for code clarity using StringBuilders
 * 
 * 1. Get all vowels from original string in reverse order into a StringBuilder-1
 * 2. Create result from original string using second StringBuilder-2 to capture
 * 2a. If consonant leave original string alone and capture
 * 2b. If over replace char with reverse char from StringBuilder-1
 * 2c. Return StringBuilder-2 a String
 */
public class ReverseStringWithStringBuffer {
	private static String VOWEL = "aeiouAEIOU";
	
	public static String reverseUsingTwoStringBuilder(String str) {
		StringBuilder sb = new StringBuilder();

			//Put all vowels in a placeholder of vowel - get all reverse vowels
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			if(isVowel(c))
				sb.append(str.charAt(i));
		}
		
		int k = 0;
			//Replace original string with all vowels - reversed values
		StringBuilder sb2 = new StringBuilder();
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!isVowel(c))
				sb2.append(str.charAt(i));
			else
				sb2.append(sb.charAt(k++));
		}		
		
		return sb2.toString();
	}

	
	private static boolean isVowel(char c) {
	    return VOWEL.contains(String.valueOf(c));
	}

	
}
