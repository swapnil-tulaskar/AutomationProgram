package day12;

import java.util.Scanner;

public class check_prime_number {

	public static void main(String[] args) {
	  
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scn.nextInt();
		
		boolean isprime= true;
		
		if(num<=1) {
			isprime=false;
		}
		
		else {
			for(int i = 2;i*i<=num;i++) {
				if(num%i==0) {
					isprime =false;
					break;
				}
			}
		}
		if(isprime) {
		System.out.println(num+"<-number is Prime");}
		else {
			System.out.println(num+" <- Number is Not Prime");
		}
		
	}

}
