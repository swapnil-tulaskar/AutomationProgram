package day04;

import java.util.Scanner;

public class Calculator {
	//Calculator.java
	
		public static void main(String[] args) {
			
			
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter first number to add :");
			int i = scn.nextInt(); 
			System.out.println("Enter Second number to add :");
			int j = scn.nextInt();
			try{
				int res = Addition.add(i, j);
				System.out.println("Result: " + res);
			}
			catch(IllegalArgumentException e){
				System.out.println("Error: " + e.getMessage());
			}
			
			scn.close();
		}
	}

