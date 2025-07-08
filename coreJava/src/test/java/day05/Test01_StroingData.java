package day05;


	/*
	01. Need of this chapter?
		- In this chapter we will learn 'different data types' available in Java 
		  for creating 'variables and objects' for 'storing values' in a program
		  
		- For storing a value in a program we must allocate memory by Compiler and JVM
		
		- To to tell to Compiler and JVM for allocating memory, 
		  we must use data type keywords
		
	02. What is a data type?
		- A 'keyword or a class name' that is used for creating
		  a variable or an object memory for storing values in the program
		  is called data type.
		  
	03. Why data type?
		- A data type is used for allocating memory (variable or object memory)
		  for storing values in the program.
		  
	04. What is the information provided by the data type to the compiler and JVM
	    in creating a variable or an object?
		- A data type (keyword or classname) provides below information 
			1. The type of memory (Integer/Floating-point/Character/Boolean/String)
			2. The size of the memory (1 or 2  or 4 or 8 bytes)
			3. The type of the value and the range of the value can be stored		
			4. The allowed operators to apply on this variable
			5. The result type comes out from an expression
			
		- Whichever the keyword Provides above information 
		  that keyword is called data type  
		  
		  For example:
			- int, double, char, boolean are data type keywords
			- public, void, if, ... are not  data type keywords

	Below program explains 
		1. creating variable
		2. storing value in the variable
		3. reading variable value and printing 
		4. printing variable name and its value by using + operator
		5. diff compile time errors occured in this program
	*/
	class Test01_StroingData {
		public static void main(String[] args) {
			
		/*
			01. We can not type value in the program directly as below
			    it leads to compile time error 
		*/	
				//10	//CE: ';' expected
				//10;	//CE: not a statement
				
				
		/*
			02. For storing value we must use variable as shown below
		*/	
				//x = 10;	//CE: can not find symbol
				
		/*	
			03. For storing value, first of all we must create that variable
				by using data type

					-> Syntax for creating variable
						 DT varName;
						
					-> Syntax for storing value in variable
						 varName = value;
						
					-> Syntax for reading variable value and printing
						 System.out.println(varName);
		*/		
			//varaible creation
				int x;
			
			//storing value in variable
				x = 10;
				
			//reading and printing variable value
				System.out.println(x);
				
		/*
			04. we can create a new varialbe and store value in this new variable
			    in a single line as shown below
		*/
			//creating a variable and storing value in a variable
				int y = 20;
				System.out.println(y);
				
		/*
		  05. When we create a variable without assigning a value,
		      like in C langauge, in Java it does not have any garbage value
			  Hence to read variable, we must assign value to it, else 
			  we will get CE: variable might not have been initialized
		*/
			//creating variable without value
				int z;
				
			//reading empty variable, leads to CE	
				//System.out.println(z); //CE: varaible z might not have been initialized
				
			//assign(storing) value to z
				z = 30;
				 
			//reading and printing z value
				System.out.println(z);
				
		/*
		  06. when we print a variable, only its value is printed	
		      if we what to print both variable name and its value
			  we must place variable name in "" with concatenation (+) operator
			  as below	  
		*/
			//only variable value is printed
				System.out.println(z);				//30
			 
			//printing only varible name 
				System.out.println("z");			//z
				
			//printng variable name and value
				System.out.println("z: "+ z);		//z: 30
				
				//=> System.out.println("z: "+ 30);		
				//=> System.out.println("z: "+ "30");		
				//=> System.out.println("z: 30");		
		/*
			07. A statement is an instructor to a Compiler and JVM 
			    to perform an operation in the program
				
				- from each statement Compiler understands its operation meaning
				and varifies whether this statement syntax is correct or wrong
					- if wrong, throws an error, terminates compilation
					- if correct, generates byte code saves in .class file
					
				- then later JVM allocates memory, stores value and value
				  and performs operation based on the instruction you gave
				  with the statement as shown in the above program.
				  
		==== Hence to understand Java easily, and to get success in the interview ====
		==================== Think Like a Compiler and JVM ==========================  
		======== Draw memory diagram for each statement we write in the program =====
		
		*/

		}
	}

