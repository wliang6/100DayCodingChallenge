package strings;

import java.util.Arrays;

public class ValidAnagram {
	
/*	Given two strings s and t, write a function to determine if t is an anagram of s.
	For example,
	s = "anagram", t = "nagaram", return true.
	s = "rat", t = "car", return false.
	Note:
	You may assume the string contains only lowercase alphabets.*/

	public static boolean isAnagram(String s, String t){
		if(s.length() != t.length()) return false;
		char [] ss = s.toCharArray();
		char [] tt = t.toCharArray();
		Arrays.sort(ss);
		Arrays.sort(tt);
		return new String(ss).equals(new String(tt));
	}
	
}
