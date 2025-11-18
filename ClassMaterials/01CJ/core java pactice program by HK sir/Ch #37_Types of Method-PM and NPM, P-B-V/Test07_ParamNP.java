/*
Parameterized and Non-parameterized methods 
===========================================

- A method that is created with parameters is called parameterized method 
  else is called non parameterized method. 
  
- Example program 
	class Example {
		static void add() {					//non-parameterized method
			
		}
		
		static void add(int a, int b) {		//parameterized method
			
		}
	}

- If we need to execute method logic by taking inputs from 
  other programmer, method caller, we must create method as 
  parameterized method 
  
- If you need to execute method logic without taking inputs from 
  other programmer,method caller, for execututing method logic either by taking 
  values keyboard or from file or from database or with fixed values 
  we create method as non parameterized method 
  
- The method parameters 'type, list and order' must be based on the 
  type of values, list of values and order of values 
  we want to receive from method caller
  
- The rules we must follow in creating parameter 
	1. Parameter names must not be same 
	2. Parameters must be separated by ,
	3. Parameters must not be initialized in the declaration 
	4. Parameters values must be passed as arguments in method call    
	
  
		static void m1(int a , int a) { }		//CE:
		static void m1(int a ; int b) { }		//CE:
		static void m1(int a=10 ; int b=20) { } //CE:
		
		static void m1(int a , int b) { } 
		
				m1();		//CE
				m1(10);		//CE
				m1(10, 20); _/
				
- Rules on argugument in calling paramterized the non-paramterized method 		
	1. The arguments must be based on the parameters 
	2. If a method doesn't have parameters we must not pass arguments 
	3. If a method has parameters we must pass arguments 
	4. The argument type must be either same or lesser type than parameter type 
	5. The argument type must not be either highest range or incompatible 

*/

class Example {

	static void m1(){
		System.out.println("No-param method");
	}
	static void m2(int a){
		System.out.println("Param method");
	}

}
class Test07_ParamNP {
	public static void main(String[] args) {
//		m1();		//CE: c n f symbol method m1() in class Test
//		m2(5);	//CE: c n f symbol method m1(int) in class Test
		
		Example.m1();
		Example.m2(5);
		
//		Example.m1(5);//CE: method m1 in class Example cannot be applied to given types;
//		Example.m2();	//CE: method m2 in class Example cannot be applied to given types;
		
		Example.m2(10);		//Example.m1(int) -> no CE
		Example.m2('a');	//Example.m1(char) -> not available
								//->Example.m1(int)-> available -> no CE
								//->Example.m1(97)
								

//		Example.m2(5L);		//CE: incompatible types: possible lossy conversion from long to int							
//		Example.m2(true);	//CE: incompatible types: boolean cannot be converted to int

//		Example.m2(5, 6);	//CE: method m2 in class Example cannot be applied to given types;
	}
}