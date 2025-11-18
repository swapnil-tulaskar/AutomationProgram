/**
 * This class is meant for creating Emplyee objects
 * for storing joined employees data in Company records
 *
 * @Author: BK
 * @Version: 1.0
 *
 * Save this program with the name Company.java
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
import java.io.Console; 
import java.util.Scanner; 

class Company {
	
	public static void main(String[] args) throws IOException {
		//Obtaining console object from factory method
		Console			cns	= System.console(); 
		
		//Reading username and password for login to the project
		System.out.print("Enter Username: ");
		String usn = cns.readLine();
		
		System.out.print("Enter Password: ");
		String pwd = new String(cns.readPassword()); 
		                     //converting char[] to String object
							//for compare	
							 
		if(usn.equalsIgnoreCase("HK") && pwd.equals("NiT") ){
		
			//Creating instance of Employee class
			Employee e1 = new Employee();
			
			//Creating stream objects connecting to keyboard
			BufferedReader	br	= new BufferedReader(new InputStreamReader(System.in));
			Scanner			scn = new Scanner(System.in);
			
			//Reading employee object data from keyboard by prompting message
			//and storing it in above employee e1 instance
			e1.eno				= Integer.parseInt(args[0]);
			e1.ename			= args[1];
			
			System.out.print("\nEnter dept: ");
			e1.dept				= br.readLine();
			
			System.out.print("\nEnter sal: ");
			e1.sal				= Double.parseDouble(br.readLine());
			
			System.out.print("\nEnter mobile: ");
			e1.mobile			= scn.nextLong();  scn.nextLine();
			
			System.out.print("\nEnter email: ");
			e1.email			= scn.nextLine();
			
			e1.gender			= System.getProperty("gender").charAt(0);
			e1.workingStatus	= Boolean.parseBoolean(System.getProperty("status"));
			
			System.out.println("\nEmployee values");
			System.out.println("   eno\t\t\t: "			+ e1.eno);
			System.out.println("   ename\t\t: "			+ e1.ename);
			System.out.println("   dept\t\t\t: "		+ e1.dept);
			System.out.println("   sal\t\t\t: "			+ e1.sal);
			System.out.println("   mobile\t\t: "		+ e1.mobile);
			System.out.println("   email\t\t: "			+ e1.email);
			System.out.println("   gender\t\t: "		+ e1.gender);
		//	System.out.println("   workingStatus\t: "	+ workingStatus);
			System.out.println("\n   workingStatus\t: "	+ 
								( (e1.workingStatus) ? "Working" : "Not workding"));
							//ternary operator	or conditional operatorc					
		}else {
			System.out.println("Error: Invalid username and password");
		}	
		
		
		//else close
	}//main close
}//class close