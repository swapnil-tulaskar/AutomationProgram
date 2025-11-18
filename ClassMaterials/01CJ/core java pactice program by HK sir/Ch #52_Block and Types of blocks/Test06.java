class Example {
	static {	//Static Initializer block
					//Executed automatically when class is loaded
		System.out.println("SB  is executed");			
	}

	{			//Instance Initializer block
					//Executed automatically when new object is created
		System.out.println("IIB is executed");
	}

	
	void m1() {
		{		//local block
					//Executed automatically when this method is called
			System.out.println("LB  is executed");
		}			
	}				

	public static void main(String[] args) {
		System.out.println("MM  is execution is stated");

		Example e1 = new Example(); //here DC is called
		e1.m1();
		System.out.println("MM  is execution is ended");

	}
}

/*
 execute above class by commenting 
 	object creation statement and
	m1() method calling statement
*/