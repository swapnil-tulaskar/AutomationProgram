/*
11. In a Java file, where can we create a method?
	- In a Java file, we can create a method only inside a class 
	
	- If you create a method either directly inside a Java file or inside 
	  another method it leads to CE 
	  
12. Can we nest a method means can we create a method inside another method?
	- No, it leads to compiled error 
	  because we cannot create one operation inside another operation. 
	  
	- We can only call one method from another method to perform one operation 
	  as part of another operation 
	
*/

//Example.java
//void m1(){ }

class Example {
		
	void m1() {			//creating Operation #1
	/*	
	   void m2() {		//creating Operation #2
					//CE:	
	   }
	*/   
	}
}


class Sample{

	void m1() {			
		
		m2();	//executing [Opr #2 from Opr #1]
		
	}

	void m2() {		
		   
	}

}