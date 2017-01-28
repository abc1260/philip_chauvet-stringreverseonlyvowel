Requirement:
	Write a function that takes a string and returns another string 
	which has the letters of the passed string with the vowels only in reversed order

Use Cases (Examples):
	Case: aeiou
		Given input as:
			“aeiou”
		Then result should be:
			“aeiou”
	
	Case: hello
		Given input as: 
			“hello”
		Then result should be:
			"holle"

	Case: short phrase
		Given input as: 
			“process vocabulary”
		Then result should be:
			"pracuss vacobelory"

	Case: short poem
		Given input as: 
			"Jingle bells Jingle bells Jingle all the way Oh, what fun It is to ride In a one-horse open sleigh"
		Then result should be:
			"Jingle bells Jongle bolls Jenglo all thI wey ih, whot fin It us ta rOda en a eni-herse ipen sleigh"
			
	Case: large poem
		Given input as: 
			"Jingle bells Jongle bolls Jenglo all thI wey ih, whot fin It us ta rOda en a eni-herse ipen sleigh Dashing through the snow In a one-horse open sleigh O’er the fields we go Laughing all the way Ha ha ha Bells on bobtail ring Making spirits bright  What fun it is to ride and sing A sleighing song tonight"
		Then result should be:
			"Jinglo bolls Jingli bells JAngli all the wiy oh, whit fin ut as ti ridi in a ini-harso open slaagh Dashang threagh thi snuw an o ene-hirse epOn sliegh e’or the foelds wo ga LIogheng ull tho wiy Ha hi he Bells in bebteil reng Makeng sparOts braght  Whut fIn it os ti redI and song e sloeghong seng tenight"
	Case: double large poem
		Given input as: 
			"Jingle bells Jongle bolls Jenglo all thI wey ih, whot fin It us ta rOda en a eni-herse ipen sleigh Dashing through the snow In a one-horse open sleigh O’er the fields we go Laughing all the way Ha ha ha Bells on bobtail ring Making spirits bright  What fun it is to ride and sing A sleighing song tonight. Jingle bells Jongle bolls Jenglo all thI wey ih, whot fin It us ta rOda en a eni-herse ipen sleigh Dashing through the snow In a one-horse open sleigh O’er the fields we go Laughing all the way Ha ha ha Bells on bobtail ring Making spirits bright  What fun it is to ride and sing A sleighing song tonight"
		Then result should be:
			"Jinglo bolls Jingli bells JAngli all the wiy oh, whit fin ut as ti ridi in a ini-harso open slaagh Dashang threagh thi snuw an o ene-hirse epOn sliegh e’or the foelds wo ga LIogheng ull tho wiy Ha hi he Bells in bebteil reng Makeng sparOts braght  Whut fIn it os ti redI and song e sloeghong seng tenight. Jinglo bolls Jingli bells JAngli all the wiy oh, whit fin ut as ti ridi in a ini-harso open slaagh Dashang threagh thi snuw an o ene-hirse epOn sliegh e’or the foelds wo ga LIogheng ull tho wiy Ha hi he Bells in bebteil reng Makeng sparOts braght  Whut fIn it os ti redI and song e sloeghong seng tenight"								
	

Solution 1: ReverseStringSwapVowels.java
---------------------------------------------------
SINGLE LOOPING algorithm using non-fancy swap of vowel:
1. Approach string from both ends (i for beginning, j for ends and
   progressively move towards the center from both ends, where (i=j) .
1a. If either current position is consonant ignore swapping
1b. If both position is vowel, swap vowels position


* Solution Big-O Notation Calculation
Most of the code lines of java ReverseStringSwapVowels.java is of O(1).
O(1) is of the constant complexity type of code, execution will not change
if we add more input string. There is only one loop in the code:
while (i < j), that's and O(n) type of algorithm. O(n) is a linear complex
type of code.

This algorithm is of O(N) type, that is linear complexity. As we increase
the strings to be processed, the code execution time increase linearly.


Solution 2:
---------------------------------------------------
Algorithm for code clarity using StringBuilder

1. Get all vowels from original string in reverse order into a StringBuilder-1
   This captures all vowels in reverse order.
2. Use second StringBuilder-2 to capture result while processing original string
   from char o to length of original string.
2a. If char is consonant leave original string alone and capture consonant
2b. If vowel replace char with reverse char from StringBuilder-1
2c. Return StringBuilder-2 a String

* Solution Big-O Notation Calculation
Most of the code lines of java ReverseStringWithStringBuffer.java is of O(1).
O(1) is of the constant complexity type of code, execution will not change
if we add more input string. There is two loops in this code, which makes it
O(n) complexity.
type of code.

This algorithm is of O(N) type, that is linear complexity. As we increase
the strings to be processed, the code execution time increase linearly.


More solutions to come....


----------------------------------------
Issue To Consider:
Are we processing large amount of text like a book with 300 pages?
Which I do at riptextaudio.com.

If so, it's best to subtask the text processing by:
1. Process a single page at time.
2. Do reverse action on a page of sections of the page
3. Consolidate each page after processing
