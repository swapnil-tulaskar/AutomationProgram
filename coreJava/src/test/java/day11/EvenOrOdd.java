package day11;

/**
 * when any number is divisible by 2
 * Not give reminder means its a even number  ex.  10%2 = 0 -> Even
 * Give reminder means its is a Odd number    ex.  5%2  = 1 -> Odd
 */
public class EvenOrOdd {

	public static void main(String[] args) {
		
		int number = 10;
		
		if (number%2==0) {
			System.out.println("Number "+number+" is Even");
		}
		else {
			System.out.println("Number "+number+" is Odd");
		}

	}

}
