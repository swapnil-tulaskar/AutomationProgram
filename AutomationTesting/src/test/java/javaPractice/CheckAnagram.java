package javaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
	
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("word is anagram");
		}else {
			System.out.println("word is not anagram");
		}
	}

}
