class College {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	// creating instance for object HK , BK , and PK
			Student s1 = new Student();
			Student s2= new Student();
			Student s3= new Student();
			
	//initializing s1 instance with the object HK values
			s1.sno		= 101;
			s1.sname	="HK";
			s1.course	="CJ";
			s1.fee		=3500;
	// initializing s2 instace with the object BK values
			s2.sno		= 102;
			s2.sname	="BK";
			s2.course	="acting";
			s2.fee		=4500;
	//initializing s3 instance with the object PK values
			s3.sno		= 103;
			s3.sname	="PK";
			s3.course	="Politics";
			s3.fee		=4000;
			
			System.out.println("s1 object Details");
			System.out.println("s1.sno\t\t:"+s1.sno);
			System.out.println("s1.sname\t:"+s1.sname);
			System.out.println("s1.course\t:"+s1.course);
			System.out.println("s1.fee\t\t:"+s1.fee);
			System.out.println();
			
			System.out.println("s2 object Details");
			System.out.println("s2.sno\t\t:"+s2.sno);
			System.out.println("s2.sname\t:"+s2.sname);
			System.out.println("s2.course\t:"+s2.course);
			System.out.println("s2.fee\t\t:"+s2.fee);
			System.out.println();
			
			System.out.println("s3 object Details");
			System.out.println("s3.sno\t\t:"+s3.sno);
			System.out.println("s3.sname\t:"+s3.sname);
			System.out.println("s3.course\t:"+s3.course);
			System.out.println("s3.fee\t\t:"+s3.fee);
			System.out.println();
			
			
	}
}
