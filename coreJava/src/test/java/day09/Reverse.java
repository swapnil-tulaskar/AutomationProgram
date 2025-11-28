/**
 * @author swapnil
 * Write a program to print the reverse of the String? using user input
 * Ex: Nacre Output: ercaN 
 */




package day09;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter Reverse String: ");
		String input = scn.nextLine();
		System.out.println(input+" <== This is type by user");
		// we use for loop to making reverse statement
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		System.out.println("<== this is Reverse of that input");
		scn.close();
	}
	
}
