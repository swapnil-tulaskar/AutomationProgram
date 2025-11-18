/*
Void and non-void methods 
=========================
- A method whose return type is void is called void method 
- A method whose return type is either PDT or RDT class name or array
  is called non-void method 
  
- For example  
   ================== void method =================================================
	void m1() {		
	
	}		
	
   ================== non-void method(PDT) ========================================
	int m2() {		double m3() {	
		
	}				}	

   ================== non-void method(class name) =================================
	String m4() {	Student m5() {
		
	}				}

   ================== non-void method(array) =================================
	int[] m2() {	double[] m3() {	 
		
	}				}				
	
	String[] m4(){	Student[] m5() {
	                              
	}				}             
	
- If you don't want a return value from a method, we should create method as void 
  method. Inside void method the generated result or an object either 
	1. we store in static or non static variables in this object or 
	2. we store in file or we store in database or 
	3. we just print on console to the end user 
  
- If we need to return a result value or an object from a method 
  to this method caller, we must create this method as non-void method.
  
- We must decide the return type of the method
  based on the type of value or the type of object 
  returning from this method 
  
- For example 
	1. For returning the value 5	the return type should be int 
	2. For returning the value 5.6	the return type should be double 

	3. For returning the value "HK"	the return type should be class name String 
	4. For returning the Student object 's1 or new Student()'	
	  the return type should be class name Student
	  
	5. For returning multiple integer values as a group 
	   the return type should be int[] array   
	6. For returning multiple flot values as a group 
	   the return type should be double[] array   
	7. For returning multiple Strings as a group 
	   the return type should be String[] array   
	8. For returning multiple Student objects as a group 
	   the return type should be Student[] array   
	  
- The return type will not return value from the this method.
  It is only meant for specifying the type of the value or the type of object 
  returning from this method 
  
- From a method a value or an object is returned by using the keyword 'return'

- For example:
		
		int m1() {
			return 5;	
		}
		
		- In the above method 
			1. in the method declaration 'int' is the return type specifies 
				   this method returns one int value 
		
			2. From the method body logic the keyboard 'return' 
			  returns the actual value '5' 
		
- The return keyword has two forms 
	1. return ;
	2. return value/object;

- The 'return;' is meant for terminating the method logic execution and
  return control to calling method without value. 
	- It is allowed only inside 'void' method and 
	- it is optional to place by the developer
	- it is automatically palced by compiler at end of the method body 
	- It is not allowed inside non-void method 
	
- The 'return value/object;' is meant for terminating the method logic execution 
  and return control to calling method with value or object.
	- It is allowed only inside nonvoid method 
	- It is a mandatory to be placed by developer 
	- The Compiler doesn't place it automatically 
	  if a developer not placed it, compiler will throw error 
	- It is not allowed inside void method 
	
- The returning value must be either same type or lesser type 
   of this return type 
*/
class Example {
	static void m1() {

	}

	static void m2() {
		return ;
	}

	static void m3() {
//		return 5;
	}

//	static int m4() {
		
//	}
	
//	static int m5() {
//		return ;
//	}

	static int m6() {
		return 5;
	}

	static int m7() {
		return 'a';
	}
	static int m8() {
//		return 5L;
//		return 10.5;
//		return true;
//		return "a"; 
		return 'a';
	}
/* */
}