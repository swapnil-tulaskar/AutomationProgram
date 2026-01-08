package day12;
/*
 * Reverse a given number using a for-loop
 */

import java.util.Scanner;

public class program06 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter 2 or more then 2 digit number:");
	int num = scn.nextInt();
	int reverse=0;
	for(int temp = num ; temp>0;temp/=10) {
		
		int digit = temp%10;
		
		reverse = reverse*10 + digit;	
	}
	
	System.out.println(reverse);
	}
}
