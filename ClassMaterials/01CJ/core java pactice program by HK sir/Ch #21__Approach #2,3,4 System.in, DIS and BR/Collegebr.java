//College.java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class College {
	public static void main(String[] args) throws IOException {
		//creating student object
		Student s1 = new Student();
		
		//creating BR object connecting to Keyboard
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		//prompting messages and reading values from end-user
		System.out.print("Enter sno: ");
		s1.sno				= Integer.parseInt(br.readLine());
		
		System.out.print("Enter sname: ");
		s1.sname			= br.readLine();
		
		System.out.print("Enter course: ");
		s1.course			= br.readLine(); 
		
		System.out.print("Enter fee: ");
		s1.fee				= Double.parseDouble(br.readLine());
		
		System.out.print("Enter email: ");
		s1.email			= br.readLine();
		
		System.out.print("Enter mobile: ");
		s1.mobile			= Long.parseLong(br.readLine());
		
		System.out.print("Enter geneder: ");
		s1.gender			= br.readLine().charAt(0);
		
		System.out.print("Enter courseCompleted: ");
		s1.courseCompleted	= Boolean.parseBoolean(br.readLine());

		System.out.println("\ns1 object values");
		System.out.println("  s1.sno\t\t: "		+ s1.sno);
		System.out.println("  s1.sname\t\t: "	+ s1.sname);
		System.out.println("  s1.course\t\t: "	+ s1.course);
		System.out.println("  s1.fee\t\t: "		+ s1.fee);
		System.out.println("  s1.email\t\t: "	+ s1.email);
		System.out.println("  s1.mobile\t\t: "	+ s1.mobile);
		System.out.println("  s1.gender\t\t: "	+ s1.gender);
		System.out.println("  s1.courseCompleted\t: "+ s1.courseCompleted);
	}
}
