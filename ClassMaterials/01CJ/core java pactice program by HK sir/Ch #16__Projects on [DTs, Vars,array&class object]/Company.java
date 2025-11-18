//Company.java
class  Company {
	public static void main(String[] args) {
		//Creating instances for objects HK, BK and PK
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		//initializing e1 instance with the object HK values
		e1.eno		= 101;
		e1.ename	= "HK";
		e1.dept		= "CJ";
		e1.sal		= 3500;
	 
		//initializing e2 instance with the object BK values
		e2.eno		= 102;
		e2.ename	= "BK";
		e2.dept		= "Acting";                 
		e2.sal		= 4500;
	 
		//initializing e3 instance with the object BK values
		e3.eno		= 103;
		e3.ename	= "PK";
		e3.dept		= "Policitcs";
		e3.sal		= 4000;
	 
		System.out.println("e1 object details");
		System.out.println("  e1.eno\t: "	+ e1.eno);
		System.out.println("  e1.ename\t: "	+ e1.ename);
		System.out.println("  e1.dept\t: "	+ e1.dept);
		System.out.println("  e1.sal\t: "	+ e1.sal);

		System.out.println("\ne2 object details");
		System.out.println("  e2.eno\t: "	+ e2.eno);
		System.out.println("  e2.ename\t: "	+ e2.ename);
		System.out.println("  e2.dept\t: "	+ e2.dept);
		System.out.println("  e2.sal\t: "	+ e2.sal);

		System.out.println("\ne3 object details");
		System.out.println("  e3.eno\t: "	+ e3.eno);
		System.out.println("  e3.ename\t: "	+ e3.ename);
		System.out.println("  e3.dept\t: "	+ e3.dept);
		System.out.println("  e3.sal\t: "	+ e3.sal);

	}
}