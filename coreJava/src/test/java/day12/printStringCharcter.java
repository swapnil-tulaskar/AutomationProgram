package day12;

import java.util.Scanner;

public class printStringCharcter {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = scn.next();
		int count = 0;
		for(int i=input.length()-1;i>=0;i--) {
			System.out.print(input.charAt(i));
		}
		
	}

}
