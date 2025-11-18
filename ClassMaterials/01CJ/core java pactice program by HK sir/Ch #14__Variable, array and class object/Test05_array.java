/*
Working with array
==================
01. What is an array?
	- An array is referenced data type, it is an object.

	- An array is a collection of variables of same type in 
	  continuation memory locations with single name

02. Why array?
	- An array is used for storing multiple values of similar type
	  in continuation memory locations as one group with single variable name

	- It is also used for passing or returning muliple values as one group 
	  to a method and from a method with single parameter and return type.

03. How can we create an array object?
	- by using data type either PDT or class name

	- for storing multiple mathmetical values 
		we will create an array by using PDT

	- for storing mulitple objects,
		we will create an array by using class name

04. Syntax for creating an array object?
		DT[] arrayVarName = {values or objects with , separator};

		PDT[] arrayVarName = {v1, v2, v3, ...};
		RDT[] arrayVarName = {o1, o2, o3, ...};
		
05. Syntax for reading array values? 
       arrayVaraiableName[index]
    
	reading and printing array values
		System.out.println(ia[0]);                          
		System.out.println(ia[1]);

06.	Syntax for storing or modifying values in array locations?
   	   arrayVaraiableName[index] = value;
		ia1[0] = 3;     
		ia1[1] = 4;  

07. Rule in accessing array location?
     index must be >=0 && must be <length, else 
	 we will get exception java.lang.ArrayIndexOutOfBoundsException
     	int[] ia1 = {3, 4, 5, 6, 7};
     	sopln(ia1[-1]); //no CE, RE: AIOOBE
     	sopln(ia1[5]);  //no CE, RE: AIOOBE

08. Below program shows creating int[] array object, 
    storing, reading and printing multiple integers 
    as one group with single variable name

*/
class Example {
	public static void main(String[] args) {
		
		int[] ia = {3, 4, 5, 6, 7};


		System.out.println("ia   : "+ ia); 
/*	
Approach #1: Reading and printing directly			//Problem: This code is 
		System.out.println("ia[0]: "+ ia[0]);		//static nature code because
		System.out.println("ia[1]: "+ ia[1]);		//as and when the number of
		System.out.println("ia[2]: "+ ia[2]);		//values in array object are 
		System.out.println("ia[3]: "+ ia[3]);		//increased on decreased
		System.out.println("ia[4]: "+ ia[4]);		//we must add and remove	
													//these printing stmts
*/		
		//System.out.println("ia[5]: "+ ia[5]); //RE: j.l.AIOOBE


//Approach #2: Reading and printing					//Solution: we must develop
//				by using loop with index			//dynamic code by using for loop
		for(int i=0; i<ia.length; i++){				
			System.out.println(ia[i]); 
		}
		System.out.println();
		
//Approach #3: Reading and priting by using for-each loop (Java 5v new feature)	
		for(int value : ia){					
			System.out.println(value); 
		}
		System.out.println();
		
//Approach #4: Reading and priting predefiend method Arrays.toString(-)
		System.out.println(java.util.Arrays.toString(ia)); //[3, 4, 5, 6, 7]

/*
09. Limitation of an array object	
    - it can store only same or similar type values
	- if we try to store different type values
	  we will get CE
	  
	- For example  			
*/
	int[] ia2 = {5, 6, 7};		//same type of values
	
	int[] ia3 = {5, 'a', 7};	//similar type of values
								//means same type or its lesser type values
								
	//int[] ia4 = {5, 7L, 10.5, true}; //incompatible types and higer range values
									 //not allowed to store, we will get CE
	
	//solution: we must use class
	}
}