import java.io.*;
import java.util.*;
class Example_6
{
	public static void main (String[] args)
	{
		String s= "BITS Dubai";
		// or String s= new String ("BITS Dubai");

		// Returns the number of characters in the String.
		System.out.println("String length = " + s.length());

		// Returns the character at ith index.
		//char charAt(int index)
		System.out.println("Character at 3rd position = "
						+ s.charAt(3));//S

		// Return the substring from the ith index character
		// to end of string
		//String substring(int beginIndex)
		System.out.println("Substring " + s.substring(3));//S Dubai

		// Returns the substring from i to j-1 index.
		//String substring(int beginIndex, int endIndex)
		System.out.println("Substring = " + s.substring(2,5));//TS 

		// Concatenates string2 to the end of string1.
		//String concat(String str)
		String s1 = "BITS";
		String s2 = "Dubai";
		System.out.println("Concatenated string = " +
							s1.concat(s2));//BITSDubai

		// Returns the index within the string
		// of the first occurrence of the specified string.
		//int indexOf(int ch)
		//int indexOf(String s)
		String s4 = "Learn Share Learn";
		String s5 = "Share";
		System.out.println("Index of Share " +
						s4.indexOf(s5));//6

		// Returns the index within the string of the
		// first occurrence of the specified string,
		// starting at the specified index.
		//int indexOf(char ch, int fromIndex)
		System.out.println("Index of a = " +
						s4.indexOf('a',3));//8

		// Checking equality of Strings
		//boolean equals(Object anObject)
		Boolean out = "Bits".equals("bits");//false
		System.out.println("Checking Equality " + out);
		out = "Bits".equals("Bits");//true
		System.out.println("Checking Equality " + out);

		//boolean equalsIgnoreCase(String anotherString)
		out = "Bits".equalsIgnoreCase("bits");//true
		System.out.println("Checking Equality " + out);
		
		//If ASCII difference is zero then the two strings are similar
		//int compareTo(String anotherString)
		int out1 = s1.compareTo(s2);//-2 
		System.out.println("the difference between ASCII value is="+out1);
		// Converting cases
		//String toLowerCase()
		String word1 = "BITS";
		System.out.println("Changing to lower Case " +
							word1.toLowerCase());//bits

		// Converting cases
		//String toUpperCase()
		String word2 = "bits";
		System.out.println("Changing to UPPER Case " +
							word2.toUpperCase());//BITS

		// Trimming the word (return the string with whitespaces deleted from both end)
		//String trim()
		String word4 = " Learn Share Learn ";
		System.out.println("Trim the word " + word4.trim());//Learn Share Learn

		// Replacing characters
		//String replace(char oldChar, char newChar)
		String str1 = "BITSD";
		System.out.println("Original String " + str1);
		String str2 = str1.replace('D' ,'P') ;//BITSP
		System.out.println("Replaced D with P -> " + str2);
	}
}
