class College1 {
	public static void main(String[] args) {

		Student1 s1 = new Student1();
		System.out.println("s1 object is created");
		s1.display();

		s1.setSno(101);
		s1.setSname("HK");
		
		System.out.println("\ns1 object values");
		System.out.println("  sno\t\t: "		+ s1.getSno());
		System.out.println("  sname\t\t: "		+ s1.getSname());
	}
}