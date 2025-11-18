/*
NSV and NSM memory structure across multiple objects 
====================================================
1. The NSV has separate copy memory in each object for storing each 
   object's specific value separately
   
2. Whereas the NSM contains only 1 copy memory common to all objects because 
  NSM logic is same for all objects
  
3. The NSM memory is provided when class is loaded into JVM and that memory is 
   available as part of the class itself   
   
4. Then, why are you creating object to call NSM ?   
   - For calling NSM we create object for providing memory to NSV 
     for accessing the NSV in this NSM
   
5. If we access NSV inside a NSM directly by its name, 
   from which object  NSV value is read and modify?    
   - From the current object of this NSM using which it is called   
   
6. The object using which we call a NSM is called current object. 
   The current object information is available in method calling, 
   not in the method definition 

	For example:
	
		e1.m1();	
		   - here current object is e1, 
		   - NSV x is accessed in m1() method from e1 object

		e2.m1();	
		   - here current object is e2, 
		   - the same NSV x is accessed in m1() method from e2 object

   
Below program explains  
	1. Accessing NSV in a NSM directly by its name 
	2. Reading and modifying NSV value from current object e1 or e2

*/








class Example {
	int x = 10;
	
	void m1() {
		System.out.println(x);	//reading NSV x value from CO
	}
	
	void m2(){
		x = 18;		//modifying NSV x in CO
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Example e1 = new Example();
		Example e2 = new Example();


		e1.m1();	//CO -> e1, m1() method logic is executed with the values available in e1 object
		e2.m1();	//CO -> e2, m1() method loigc is executed again with the values available in e2 object
		System.out.println();
		
		e1.x = 15;
		e2.x = 16;
		
		e1.m1();	//CO -> e1, prints x: 15
		e2.m1();	//CO -> e2, prints x: 16
		System.out.println();
		
		e1.m2(); //CO -> e1, x value is modified in e1 object
				  //no effect to e2 object x 		
		
		e1.m1();	//CO -> e1, prints x: 18
		e2.m1();	//CO -> e2, prints x: 16
		System.out.println();

	}
}