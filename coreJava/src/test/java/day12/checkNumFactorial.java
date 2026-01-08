package day12;

import java.util.Scanner;

public class checkNumFactorial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number:");
		
		long num = scn.nextLong();
		long result = 1;
		
		if(num<0) {
			System.out.println("Factorial Number is not negative");
		}
		else {
			for(long i=1;i<=num;i++) {
				result = i*result;
			}
			System.out.println(result);
		}
		
		
		
	}

}
