import java.util.Scanner;
class Calculation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter fno");
		int a = scn.nextInt();
		System.out.println("Enter sno");
		int b = scn.nextInt();
		Addition.add(a,b);
		Addition.mul(a,b);
	}
}
