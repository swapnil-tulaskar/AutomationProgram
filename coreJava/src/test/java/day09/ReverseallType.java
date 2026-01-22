package day09;

import org.checkerframework.checker.units.qual.Length;

public class ReverseallType {

	public static void main(String[] args) {
		//Input:  "Java is easy"
		//Output: "avaJ si ysae"
		
		String input = "Java is easy";
		
		String[] words = input.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			result.append(sb.reverse()).append(" ");
		}
		
		System.out.println(result.toString().trim());
		
		
		//Input:  "Java is easy"
				//Output: "easy is Java"
		StringBuilder result1 = new StringBuilder();
		
		for (int i = words.length-1;i>=0;i--) {
			result1.append(words[i]).append(" ");
		}
		
		System.out.println(result1.toString().trim());
		
		//Input:  "Java is easy"
		//Output: "is Java easy"
	StringBuilder result2 = new StringBuilder();
	
		result2.append(words[1]).append(" ")
		.append(words[0]).append(" ")
		.append(words[2]);
		
		System.out.println(result2.toString().trim());
	

	}

}
