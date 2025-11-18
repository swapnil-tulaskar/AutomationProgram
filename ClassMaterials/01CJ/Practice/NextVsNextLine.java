import java.util.Scanner;
class NextVsNextLine{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter name:");
		String name= scn.nextLine();
		System.out.println("Enter age:");
		int age = scn.nextInt();
		System.out.println("mobile number:");
		long MobileNo = scn.nextLong();
		
		System.out.println("\n Enter name:"		+name);
		System.out.println("\n Enter age:"		+age);
		System.out.println("\n Mobile Number:"	+MobileNo);
	}
}
