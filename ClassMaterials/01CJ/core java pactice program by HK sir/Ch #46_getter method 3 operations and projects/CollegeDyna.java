//College.java
import java.util.Scanner;
class College {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student();
		System.out.println("s1 object is created");

		System.out.println("\ns1 object values");
		System.out.println("  insti\t\t: "		+ s1.getInstitute());
		System.out.println("  sno\t\t: "			+ s1.getSno());
		System.out.println("  sname\t\t: "		+ s1.getSname());
		System.out.println("  course\t: "		+ s1.getCourse());
		System.out.println("  fee\t\t: "			+ s1.getFee());
		System.out.println("  address\t: "		+ s1.getAddress());

		System.out.println(s1); //s1.toString() --> RE: NPE if we do not place address!=null

		System.out.print("\nEnter insti\t: " );
		s1.setInstitute(scn.nextLine());

		System.out.print("\nEnter sno\t: " );
		s1.setSno(scn.nextInt());  scn.nextLine();

		System.out.print("Enter sname\t: " );
		s1.setSname(scn.nextLine());

		System.out.print("Enter course\t: " );
		s1.setCourse(scn.nextLine());

		System.out.print("Enter fee\t: " );
		s1.setFee(scn.nextDouble());  scn.nextLine();

//Approach #1:
//		s1.setAddress(new Address());
//		s1.getAddress().setStrnum(1);
//		s1.getAddress().setCity("Hyd");


//Approach #2:
		Address address = new Address();

		System.out.print("Enter str num\t: " );
		address.setStrnum(scn.nextInt());  scn.nextLine();

		System.out.print("Enter city\t: " );
		address.setCity(scn.nextLine());

		s1.setAddress(address);

		System.out.println("\ns1 object values");
//		System.out.println("  insti\t\t: "		+ s1.getInstitute());
//		System.out.println("  sno\t\t: "			+ s1.getSno());
//		System.out.println("  sname\t\t: "	+ s1.getSname());
//		System.out.println("  course\t: "		+ s1.getCourse());
//		System.out.println("  fee\t\t: "			+ s1.getFee());
//		System.out.println("  address\t: "		+ s1.getAddress());
//		System.out.println("    strnum\t: "	+ s1.getAddress().getStrnum());
//		System.out.println("    city\t: "			+ s1.getAddress().getCity());

		System.out.println(s1);
	}
}