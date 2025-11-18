/*
10. Common terminalogy used in method creation

 - Basically a method is divided into two parts number 
	1. head 
	2. body 
			head 
			{
				---	
				--- statements	
				---	
			}
			
 - In a method creation we will come across below 8 words 			
	1. Prototype 
		- The head portion of the method that contains 
		  AM, ELMs, RT, MN, PL, throws EL is called prototype 
		  
	2. Body and logic 
		- The region between '{ and }' is called body 
		- The statements placed inside the body are called logic
		
	3. Signature 
		- 'Method name and parameters list' together is called signature 
		
	4. Parameters and arguments 
		- A PV or a RV that is declared in method parenthesis 
		  is called parameter 
			- Parameters rules 
				- A method can have multiple parameters 
				- All parameters must be separated by comma ,
				- Parameters name must be different
				- Parameters must not be initialized in method declaration 
				  we must pass their values through method calling
		- A 'value or an object' that is passed as input 
		  to a method parameter in its calling is called argument.
		  
	5. Method name 
		- A name of a method that represents the operation 
		  performing by this method logic is called method name
		
	6. Return type 
		- The 'void or a data type' placed in the method prototype 
		  before method name is called return type
			- The The data type can be either primitive data type or array or class name 
			  Based on the type of the value or type of the object 
			  we want return from this method 
		- The return type will not return the value 
		  it just specifies the type of the value or 
		  the type of the object must be returned from this method 	  
		  
		- The value or the object returned from a method 
		  by using the keyword 'return'
		  
	7. Exceptions 
		- The runtime error throwing from this method 
		  when wrong values are passed is called exception 
		  
		- An exception is a thrown by using 'throw' keyword 
		  and it is reported to this method caller by using 'throws' keyword 
		  and this method caller catches this exception by using 'try/catch'
		
	8. Modifiers 
		- A keyword that changes default behavior of 
		  a programming element is called modifier 
	
		- To a method we can apply accessibility modifiers and 
		  execution level modifiers 
		  
		- Accessibility modifiers are used for setting 
		  accessibility permissions to decide 'where to access'
		  either within the same class or from other classes 
		  
		- Execution level modifiers are used for setting 
		  execution level permissions, for example to decide 
		  whether to execute with object or without object   
*/
class Example {
	//AM    ELM	   RT	mN	parameters    EL
	public static void add(int a, int b) throws Exception  //<= prototype
						//signature
	{ //<=blody
			int c = a + b;			//<=logic
			System.out.println(c);
	}
	
	public static void main(String[] args){
	
		add(10, 20);
			//arguments
	}
		
}