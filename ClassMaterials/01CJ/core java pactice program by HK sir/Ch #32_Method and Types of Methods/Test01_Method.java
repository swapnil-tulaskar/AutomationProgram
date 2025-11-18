/**
1. What is a method?
	- A 'named block' with a return type is called method 
	
	- A 'sequence of statements' placed as a one block 
	  with proper name and return type is called method 
	
	- A sub block of a class that has a proper name and return type 
	  is called a method 
	
2. Why method?
	- A method is used for developing reusable logic to perform one operation 
	
	- This operation can be mathematical operation or business operation 
	
	- For example 
		1. adding two numbers is a mathematical operation 
		
		2. depositing money in a bank account or 
		   ticket reservation for a customer, 
		   Buying and selling shares or products 
		   are business operations 
		   
3. How can we create a method?
	- A method is created by using 
	 'return type and method name' 
	
	- For creating method we must consider below 6 points 
		1. Operation name 
		2. values required to perform this operation 
		3. Sequence of statements required to perform this operation 
		4. The type of result return from the method 
		5. The runtime error we must throw from this method 
		6. Access and execution level permissions  

  - By following about 6 points we must prepare method syntax as below  	
	
4. Syntax for creating a method?

		AM ELMs RT mn(PL) throws EL {		Allowed AM -> all 4 AMs are allowed
			-----							Allowed EL -> except 'transient and volatile' 
			----- logic									  remaing 6 ELMs s,f,a,n,sy,sfp are allowed
			-----	
		}	
		
		RT mn(){ }
		
		- AM, ELMs, PL, thorws EL and Logic are optional
		- RT, mn, (), and { } are mandatory
		
		-AM		means Accessibility modifier 
		-ELMs	means Execution level modifiers 
		-RT		means Return type (tt may be void or PDT or array or classname) 
		-mn		means method name 
		-PL		means Parameters list 
		-EL		means Exceptions list 
		-logic	means Sequence of statements performs this method operation  

5. Sample program to create a method with full syntax and optional syntax? 		
		public static void add(int a, int b) throws IllegalArgumentException {
			int c = a + b;
		}
		
		void sub() {
			
		}
						
6. Method execution, does JVM execute method automatically?
	- No, just by defining a method it is not automatically executed by JVM 
	- we must call it explicity from main method
	
	- Case #1: Run above class without defining main method
		RE: main method is not found
		
	- Case #2: Provide main method and run above class
		Output: main start 
				main end

7. Method calling, what must we do, to execute user defined methods?	
	- We must call UDM from main method
	
8. Syntax for calling a UDM method?	

	- methodName(arguments);
					- We must pass the type of arugment and 
					  the number of arguments depending on 
					  this called method parameters
	
	for example:
		- we must pass arguments to add() method and
		- we must not pass arguments to sub() method.

9. Below program shows creating methods, calling and executing 
   thier logic?
*/
class Test01_Method {
 //it is static method
	public static void add(int a, int b) throws IllegalArgumentException {
		int c = a + b;
		System.out.println(c);
	}
	
 //it is non-static method	
 	void sub() { 
	
	}
	
	public static void main(String[] args){
		System.out.println("main start");	
		
		//add();			//CE: we must pass arguments
		//sub(10, 20);		//CE: we must not pass arguments
		
		add(10, 20);		//no CE, no RE, output: 30
		//sub();			//CE: non-static method sub c n b r f s c
		
		Test01_Method t1 = new Test01_Method();
		t1.sub();			//no CE, no RE and no output becaus no Sopln()
		
		System.out.println("main end");	
	}
	

}

