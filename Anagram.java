package week3.Day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1="stops";
		String text2="potss";
	//to find the length
		int length1 = text1.length();
		int length2 = text2.length();
		//to compare the legth of 2 string
		if (length1==length2) {
			System.out.println("length are equal");
		} else {
			System.out.println("Length mismatch, not an anagram");
		}
			//changing int ot char array
		char[] word1 = text1.toCharArray();
		char[] word2 = text2.toCharArray();
		//sorting array
		Arrays.sort(word1);
		Arrays.sort(word2);
		//comparing arrays 
		if (Arrays.equals(word1, word2)) {
			System.out.println("The given string is Anagram");
		}else {
			System.out.println("The given strings are not an Anagram");
		}
	}

}
