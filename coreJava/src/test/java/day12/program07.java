package day12;
/*
 * Count the number of digits in an input number using a for-loop
 */

import java.util.Scanner;

public class program07 {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("enter number:");
		int num = scn.nextInt();
		int count =0;
		for(int temp= num ;temp>0;temp/=10) {
		count++;	
		}
		System.out.println("total digit:"+count);
	}

}
