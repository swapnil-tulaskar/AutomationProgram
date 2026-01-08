package day13;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number for Table :");
		int num = scn.nextInt();
		if(num<=0) {
			System.out.println("Don't enter 0 or negative Number");
			scn.close();
			return;
		}
	
		System.out.println("the table of "+num+" is->");
		for(int i=1;i<=10;i++) {
		System.out.println(num+"X"+i+"="+( i*num));
		}
		
     scn.close();
	}

}
