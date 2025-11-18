//Calc.java
import java.util.Scanner;
import java.util.InputMismatchException;
class Calc {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try{
			System.out.print("Enter fno: ");
			int a = scn.nextInt();

			System.out.print("Enter sno: ");
			int b = scn.nextInt();
		
			int res = Addition.add(a, b);
			System.out.println("Result: "+ res);

		}catch(InputMismatchException e){
			System.out.println("Enter only integer");

		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}

