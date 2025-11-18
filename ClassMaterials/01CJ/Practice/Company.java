import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.io.Console;


class Company {
	public static void main(String[] args) throws IOException{
		Employee e1= new Employee();
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner scn = new Scanner(System.in);
			Console cns = System.console();
			
			//using command line
				int eno =  Integer.parseInt(args[0]);
				String ename =(args[1]);
				
					//using br object
						System.out.print("Enter dept:");
						e1.dept	= br.readLine();
						System.out.print("Enter Sal:");
						e1.sal	= Double.parseDouble(br.readLine());
		
							//using scanner object
								System.out.print("Enter MoNum:");
								long mNum = scn.nextLong();
								System.out.print("Email:");
								String email = scn.next();
		
							//using System properties
							
							
			e1.gender			= System.getProperty("gender").charAt(0);
			e1.workingStatus	= Boolean.parseBoolean(System.getProperty("status"));
		
		System.out.println("EmpNo\t\t:" +eno);
		System.out.println("Ename:"+ename);
		System.out.println("Dept\t\t:" +e1.dept);
		System.out.println("Sal\t\t:" +e1.sal);
		System.out.println("Mobile no.\t:"+ mNum);
		System.out.println("Email \t\t:"+email);
		System.out.println("   gender\t\t: "		+ e1.gender);
		System.out.println("   workingStatus\t: "	+ workingStatus);
		
		
		
	}
}
