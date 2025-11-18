/*
Assignment:
	- Develop a program to receive Primitive values and objects 
	  as argument to a method.
		- for a receiving primitive values as argument
		     We must define method with primitive type parameter   
		
		- For receiving object as argument 
		     we must define method with class name as parameter 
		
	- Below example explains, receiving student object's 
	   sno, sname and address object as arguments and 
	   storing them in this student object
*/

//Address.java
class Address {
	int strNum;
	String city;
}

//Student.java
class Student {
	             //HAS-A
	private int		sno;		
	private String  sname;
	private Address address;	
	
/*	
	//initializing above properties with fixed values, wrong design
	void initialize() {	//static values program, every student 
		sno		= 101;	//is initialized with HK values, wrong desing
		sname	= "HK";		//recieve values or objects from method caller
		address	= new Address();
	}
*/	
						//variable shadowing[param names same as field names]
	void initialize(int sno, String sname, Address address) {	
//		sno		= sno;			//this logic is reading values and objects from
//		sname	= sname;		//parameters and storing them in same parameters
//		address	= address;		//because of variable shadowing(names are same)
								
								//we must access NSV by using 'this.' reference
								//as show below
		this.sno	= sno;		//this.sno	=> NSV from CO
		this.sname	= sname;	// sno		=> parameter
		this.address= address;	//this.sno	= sno; //reading paramter sno value
													//storing in NSV sno in CO
	}

	void display() { //no-param method, because it reads values from CO
		System.out.println(sno);	//implicitly this. will be added
		System.out.println(sname);	//to access these fields from CO
		System.out.println(address);//of this method	
		System.out.println();
	}
}
class Test07_ParamNP_Object  {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.display();
		
		s1.initialize(101, "HK", new Address());
		s1.display();

	}

}