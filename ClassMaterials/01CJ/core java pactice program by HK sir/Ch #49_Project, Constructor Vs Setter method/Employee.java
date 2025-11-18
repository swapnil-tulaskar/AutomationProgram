class Employee {

	private int		eno;
	private String	ename;
	private double	sal;
	private String	dept;

	private Address  address;

	Employee(int eno, String ename, double sal, String dept, Address address){
		this.eno		= eno;
		this.ename		= ename;
		this.sal		= sal;
		this.dept		= dept;
		this.address	= address;
		System.out.println("Employee object is initialized");
	}

	void display(){
		System.out.println("  eno\t: "			+ eno);
		System.out.println("  ename\t: "		+ ename);
		System.out.println("  sal\t: "			+ sal);
		System.out.println("  dept\t: "			+ dept);
		System.out.println("  address\t: "		+ address);
		address.display();
	}
}