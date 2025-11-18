/*
 Local Preference Algorithm (LPA)
 	1. The LPA is a Compiler's serarching algorithm 
	   for finding the invoked variable declaration statement

	2. This algorithm is named as local preference, because 
	   Compiler first search the variables declaration statement 
	   in current method scope, if not found, then only search in the class scope

	3. As per LPA, Compiler seraches 
	   the invoked variable declaration statement as below
	   	1. First in current method body 
		2. Next, in current method parameters
		3. Then next, in the current class scope
		4. Finally in current class's super class

	   if comipler can not find the variable declaration statement 
	   in above all 4 scopes, then it throws error: can not find symbol variable

	4. Compiler never access one method's parameter or local variable
	   in another methods. Always it access variable either in current method
	   or in current class or in its super class.
	   
Below program show above proints	   
*/

class Test14_LP {
	static int a = 10;

	
	public static void main(String[] args) {
		                       
		System.out.println(a);


	}
}

/*
- In the above Compiler fast search for a variable declaration in main method body 
  Next search in main method pranthesis parameters 
  Finally search in class scope
  
- The variable is found in classes scope 
  then compiler replaces Sopln(a) as Sopln(classname.a), as Test.a
   
- It means compiles links variable to class,
  to tell to JVM access the vaiable from the class scope directly

- If we access SV directly by its name, it not direct access
  it is classname.SV
	
		.java file
			System.out.println(a);
			
		.class file
			System.out.println(Example.a);

*/