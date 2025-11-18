/*
14. Types of concrete methods
	A concrete method is divided into 2 types 
		1. static method
		2. non-static method
		
15.Static method points
	1. What is a static method?
		- A method that is declared with the keyword static 
		  is called static method 
	2. Why static method?	
		- The static method is used for executing logic without object 
		  and common to all objects 
	3. How can we create SM?
		- we must use static modifier in method declaration
	4. Syntax for createing Static method?
	     AM static RT mN(PL) throws EL {
				---- logic	
			}
	5. Sample program
		class Example {
			static void m1(){ }
		}
	6. Calling and executing SM?		
		- JVM doesn't execute static method automatically,
		  we must call it explicitly from main method.
	7. Differnt ways to call a static method?	 
		- We can call static method in 4 ways 
			1. Directly by using its name 
			2. By using class name 
			3. By using object referenced variable 
			4. By using null referenced variable 
			
		- For example		
				Example e1 = new Example();  //e1 is object ref var	
				Example e2 = null			 //e2 is null   ref var	
				
				m1();				//accessed directly by its name				
				Example.m1();		//accessed by using class name
				e1.m1();			//accessed by using obj ref var
				e2.m1();			//accessed by using null ref var
	8. If we call SM by using an object, is it executed only for this object?			
		- No, in all above 4 ways, SM logic is executed common to all objects. 

		- Then inside static method logic if we perform any modifications 
		  on any object's static fields data, that modification is applied to 
		  all objects of this class. In the statement e1.m1(); the SM m1()
		  not executed only for e1 object and not only modifies e1 object data.

16.Non-Static method points
	1. What is a non-static method?
		- A method that is declared without static keyword
		  is called non-static method 
	2. Why non-static method?	
		- The non-static method is used for executing logic for an object 
		  and specific to one object 
	3. How can we create NSM?
		- we must not use static modifier in method declaration
	4. Syntax for creating Static method?
	     AM RT mN(PL) throws EL {
			--- logic	
		 }
	5. Sample program
		class Example {
			void m1(){ }
		}
	6. Calling and executing NSM?		
		- JVM doesn't execute non-static method automatically,
		  we must call it explicitly from main method.
	7. Differnt ways to call a non-static method?	 
		- We can call non-static method only in 1 way
		  by using object  
		 
		- if we call NSM 
		    'directly by using its name or by using class name'
			it leads to CE: non-static method can not be referenced from 
			a static context

		- if we call NSM 
			'by using null referenced variable', we do not get CE,
			by we will get RE: NullPointerException
			
	8. If we call NSM by using one object, is it executed only for this object?			
		- Yes
		
		- Then inside non-static method logic if we perform any modifications 
		  on object's instance fields data, that modification is applied to 
		  to this object but not to all objects of this class. 
		  In the statement e1.m1(); the NSM m1() is executed only for 
		  e1 object and modifies only e1 object's data.

- Below program explains defining, calling and executing 
  static and non-static methods
*/

class A {
	static int a;
	
	static void m1() {
		System.out.println("  SM m1 is executed");	
	}

	static void m2() {
		a = 10;	
	}

	public static void main(String[] args) {
		System.out.println("main start");
	//=====================================
		  A a1 = new A();
		  A a2 = null;
		  
      //calling SM in all 4 ways
		  m1();
		  A.m1();
		  a1.m1();
		  a2.m1();
	 //===============================
		 A a3 = new A();
		 A a4 = null;
		 
		 System.out.println(a1.a + " " + a2.a + " "+ a3.a + " " + a4.a);
		 
			a3.m2(); //calling SM by using one particular object
						//and modifying SV values
		 System.out.println(a1.a + " " + a2.a + " "+ a3.a + " " + a4.a);
		  
	 //=============================== 
		  
		System.out.println("main end");
	}
	

}





class B {
	int x;
	
	void m1() {
		System.out.println("  NSM m1 is executed");	
	}

	void m2() {
		x = 10;	
	}