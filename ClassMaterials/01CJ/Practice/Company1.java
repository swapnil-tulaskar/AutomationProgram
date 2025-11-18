import java.util.*;
class Company1 {
	public static void main(String[] args){
		Employee e1= new Employee();
		Employee e2= new Employee();
		Scanner scn = new Scanner(System.in);
				System.out.print("Enter empcode:");
					e1.eno = scn.nextInt(); scn.nextLine();
				System.out.print("Enter Name:");
					e1.ename = scn.nextLine(); 
				System.out.print("Enter dept:");
					e1.dept	= scn.nextLine(); 
				System.out.print("Enter Sal:");
					e1.sal	= scn.nextDouble();
				System.out.print("Enter MoNum:");
					e1.mNum = scn.nextLong();
				System.out.print("Email:");
					e1.email= scn.next();
				System.out.print("gender:");
					e1.gender= scn.next().charAt(0);
					// for second employee
					System.out.print("Enter empcode:");
					e2.eno = scn.nextInt(); scn.nextLine();
				System.out.print("Enter Name:");
					e2.ename = scn.nextLine(); 
				System.out.print("Enter dept:");
					e2.dept	= scn.nextLine(); 
				System.out.print("Enter Sal:");
					e2.sal	= scn.nextDouble();
				System.out.print("Enter MoNum:");
					e2.mNum = scn.nextLong();
				System.out.print("Email:");
					e2.email= scn.next();
				System.out.print("gender:");
					e2.gender= scn.next().charAt(0);
			System.out.println();	
		System.out.println("First Employee Details");			
		System.out.println("EmpNo\t\t:"			+e1.eno);
		System.out.println("Ename\t\t:"			+e1.ename);
		System.out.println("Dept\t\t:"			+e1.dept);
		System.out.println("Sal\t\t:"			+e1.sal);
		System.out.println("Mobile no.\t:"		+e1.mNum);
		System.out.println("Email \t\t:"		+e1.email);
		System.out.println("gender\t\t: "		+e1.gender);
		System.out.println();
		System.out.println("Second Employee Details");
		System.out.println("EmpNo\t\t:"			+e2.eno);
		System.out.println("Ename\t\t:"			+e2.ename);
		System.out.println("Dept\t\t:"			+e2.dept);
		System.out.println("Sal\t\t:"			+e2.sal);
		System.out.println("Mobile no.\t:"		+e2.mNum);
		System.out.println("Email \t\t:"		+e2.email);
		System.out.println("gender\t\t: "		+e2.gender);
	}
}
