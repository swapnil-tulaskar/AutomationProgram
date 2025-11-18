/*
11. Method creation terminology
	1. Method declaration?
		- Creating a new method without implementation body 
		  is called method declaration 
		 
		- Method declaration is also called abstract method 
		  Because to create method without body we must declare it 
		  by using the modifier keyword abstract and must ends with ;
		  
		- Syntax for creating abstract methods 
			AM abstract RT mN(PL) throws EL;
			
			- The execution level modifier 'abstract' is mandatory
				class Example {
					void m1();  CE:		
				}
				
				class Example {  //CE
					abstract void m1(); //no CE
				}
				
				abstract class Example  { //no CE
					abstract void m1();  	//no CE
				}
			
		- Rule: The method and its class both must be declared as abstract
		
	2. Method definition? 
		- Creating a new method with implementation body 
		  is called method definition 
		  
		- Method definition is also called as concrete method   
		
		- Because concrete method has definition we cannot declare it as 
		  abstract, it leads to compile time error.
		  
		- Syntax for creating concrete method 
			AM ELM RT mN(PL) throws EL {
				--- logic	
			};
			
		- For example	
			class Example {
				
				void m1() { }	
				
				abstract void m2() { }
			}
		
	3. Method Calling or Invoking or Accessing?
		- Executing method logic is called method calling
		
		- Just by defining a method JVM does not execute method logic 
		
		- We must call it explicitly from main method or 
		  one of the method calling from main method 
		  
		- Syntax for calling a method
			methodName(arguments);
						- If a method doesn't have parameters 
						  we must not pass arguments 
						  
						- The arguments type can be either 
						  same type or lesser type to this method parameters   
		  
	4. Calling method and Called method?
		- A method that is calling another method is called calling method 
	
		- A method that is called by another method is called called method 
		
		- For example if you call m1() method in main() method 
			main() method is called as calling method
			m1()   method is called as called method
		
			-> main() method is calling   m1() method
			-> m1()   method is called by main() method
			
		- If we do not call a UDM, it is not executed

	5. Below program shows creating a static concrete method,
	   calling and executing it from main method
	
*/












class Example {
	
		static void m1(){  
			System.out.println("Hi");
		}
		
		public static void main(String[] args) {
			System.out.println("main start");	
				m1();
				m2();
			System.out.println("main end");	
		}
		
		static void m2() {
			System.out.println("Hello");	
		}
		
		static void m3() {
			System.out.println("HRU?");	
		}
}

//In the above program m3 method is not executed 
//because it is not called from main() method or 
//from any other methods calling from main method.