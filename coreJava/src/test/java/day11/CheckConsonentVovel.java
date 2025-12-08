package day11;

import java.util.Scanner;

public class CheckConsonentVovel {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Alphabate : ");
		String ipValue = scn.nextLine();
		
		switch(ipValue.toLowerCase()) {
		case "a" :System.out.println("Vowel"); 
		break;
		case "b" :System.out.println("Consonent"); 
		break;
		case "c" :System.out.println("Consonent"); 
		break;
		case "d" :System.out.println("Consonent"); 
		break;
		case "e" :System.out.println("Vowel"); 
		break;
		case "f" :System.out.println("Consonent"); 
		break;
		case "g" :System.out.println("Consonent"); 
		break;
		case "h" :System.out.println("Consonent"); 
		break;
		case "i" :System.out.println("Vowel"); 
		break;
		case "j" :System.out.println("Consonent"); 
		break;
		case "k" :System.out.println("Consonent"); 
		break;
		case "l" :System.out.println("Consonent"); 
		break;
		case "m" :System.out.println("Consonent"); 
		break;
		case "n" :System.out.println("Consonent"); 
		break;
		case "o" :System.out.println("Vowel"); 
		break;
		case "p" :System.out.println("Consonent"); 
		break;
		case "q" :System.out.println("Consonent"); 
		break;
		case "r" :System.out.println("Consonent"); 
		break;
		case "s" :System.out.println("Consonent"); 
		break;
		case "t" :System.out.println("Consonent"); 
		break;
		case "u" :System.out.println("Vowel"); 
		break;
		case "v" :System.out.println("Consonent"); 
		break;
		case "w" :System.out.println("Consonent"); 
		break;
		case "x" :System.out.println("Consonent"); 
		break;
		case "y" :System.out.println("Consonent"); 
		break;
		case "z" :System.out.println("Consonent"); 
		break;
		default: System.out.println("Enter Valid Alphabate");
		}
		scn.close();
	}

}
