/*
Accessing static and non static variables from static and non static methods 
==============================================================================
1. We can access static variable in both static method and non static method 
   directly by its name , because static variable has a direct memory we can 
   access it 

2. We cannot access nonstatic variable in static method directly by its name    
   because it does not have memory and static method also does not guarantee 
   memory because static method we will call directly by using its name without 
   using object. To access nonstatic variable inside a static method we must 
   create object and access it by using object 

3. We can access nonstatic variable in nonstatic method directly by its name 
	even though it does not have direct memory because nonstatic method 
	guarantees memory to nonstatic variable because for calling nonstatic mother 
	we must use object in that object nonstatic variable has memory 

Below program explains accessing static nonstatic variable from static and 
nonstatic methods 

*/
class Example {
	
	static int a = 10;
	  	   int x = 20;
		   
	static void m1() {
		System.out.println(a);		
		//System.out.println(x); //CE: non-static variable x c b r f s c
		
		Example e1 = new Example();
		System.out.println(e1.x); 
			
	}
	
	void m2() {
		System.out.println(a);		
		System.out.println(x);		
	}
	
}