class Company {
	public static void main(String[] args){ 
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		// initializing e1 instance with the object hk value
		e1.eno		=101;
		e1.ename	="hari";
		e1.dept		="java";
		e1.sal		=10000;
		// intializing e2 instance with the object bk value
		
		e2.eno		=102;
		e2.ename	="bk";
		e2.dept		="acting";
		e2.sal		=999999;
		// intializing e3 instance with the object pk value
		
		e3.eno		=103;
		e3.ename	="pk";
		e3.dept		="politics";
		e3.sal		=9999999;
		
		System.out.println("e1.eno\t:"		+e1.eno);
		System.out.println("e1.ename:"	+e1.ename);
		System.out.println("e1.dept\t:"		+e1.dept);
		System.out.println("e1.sal\t:"		+e1.sal);
		System.out.println();


		System.out.println("e2.eno\t:"		+e2.eno);
		System.out.println("e2.ename:"	+e2.ename);
		System.out.println("e2.dept\t:"		+e2.dept);
		System.out.println("e2.sal\t:"		+e2.sal);
		System.out.println();
		
		System.out.println("e3.eno\t:"		+e3.eno);
		System.out.println("e3.ename:"	+e3.ename);
		System.out.println("e3.dept\t:"		+e3.dept);
		System.out.println("e3.sal\t:"		+e3.sal);
		System.out.println();

	}
		
	
}
