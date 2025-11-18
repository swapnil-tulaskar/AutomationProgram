class College {
	public static void main(String[] args) {
		
		Student.setInstitute("NiT");

		Student s1 = new Student();
		System.out.println("s1 object is created");
		
		System.out.println("\ns1 object values with getter methods");
		System.out.println("  institute\t: "	+ s1.getInstitute());
		System.out.println("  sno\t\t: "		+ s1.getSno());
		System.out.println("  sname\t\t: "		+ s1.getSname());
		System.out.println("  course\t: "		+ s1.getCourse());
		System.out.println("  fee\t\t: "		+ s1.getFee());
		System.out.println("  address\t: "		+ s1.getAddress());
		System.out.println();
		
		System.out.println("\ns1 object values with toString()");
		System.out.println(s1);	
						//s1.toString()	
		System.out.println();
		
		s1.setSno(101); 
		s1.setSname("HK");
		s1.setCourse("CJ");
		s1.setFee(1000);

		Address address = new Address();
		address.setStrnum(2);
		address.setCity("Sec");
		s1.setAddress(address);
		
		System.out.println("\ns1 object values");
		System.out.println(s1);	
						//s1.toString()	
		
	}
}