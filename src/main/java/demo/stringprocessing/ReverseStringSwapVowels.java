package demo.stringprocessing;

/**
 * Algorithm uses non-fancy swap array position of vowel
 *
 * 1. Approach string from both ends (i for beginning, j for ends and
 *    progressively move towards the center (i=j) from both ends.
 * 1a. If either current position is consonant ignore swapping
 * 1b. If both position is vowel, swap vowels position
 */
public class ReverseStringSwapVowels {
	private static String VOWEL = "aeiouAEIOU";

	public static String reverseVowels(String s) {
		char[] arr = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
				//If beginning is consonant
			if(!isVowel(arr[i])) {
				i++;
				continue;
			}

			//If ending is consonant
			if(!isVowel(arr[j])) {
				j--;
				continue;
			}

				//Swap vowel position by reversing position
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;

			i++;
			j--;
		}

		return new String(arr);
	}

	private static boolean isVowel(char c) {
	    return VOWEL.contains(String.valueOf(c));
	}

}
