/*
Functional Programming
======================
1. What is a functional programming?
   - The functional programming is one programming paradigm. 
   (paradigm = a set of concepts, principle, and rules for designing program)

2. Why functional programming?
   - for passing 'a function as an argument to another function' directly 
     without creating extra a class, a method and an object
     
3. We have OOP already why do we need FP [OOP problem]?
- As part of OOP, we can only pass either a value or an object as arugment to method
- Many of times in the project we must also pass a logic or function an agument

- OOP doesnot support pass function as an arugment directly. 

- As part OOP, for passing a function or a logic as an argument to a method,
  we must create a class, a method and them we must create object from this class,
  then pass this object as arugment to method.
  
- Which is a lengthy process, numuber of java files, classes are increased 
  with repeated code as shown below
  */
	//Test.java
	class Test {
		public static void main(String[] args) {
			Calc.calculate(new Addition());
			Calc.calculate(new Subtraction());
			Calc.calculate(new Multiplication());
			Calc.calculate(new Division());
		}
	}
	
	class Calc {
	    static void calculate(AO ao) {
	         ao.calculate(10, 20);
	    }
	}
	
	//AO.java
	interface AO {
		void calculate(int a, int b);
	}
	
	//Addition.java
	class Addition implements AO {
		@Override
		public void calculate(int a, int b){
		   int c = a + b;
		   System.out.printf("The addition of %d and %d is %d\n",a,b,c);
		}
	}

	//Substraction.java	
	class Subtraction implements AO {
		@Override
		public void calculate(int a, int b){
		   int c = a - b;
		   System.out.printf("The subtraction of %d and %d is %d\n",a,b,c);
		}
	}

	//Multiplication.java	
	class Multiplication implements AO {
		@Override
		public void calculate(int a, int b){
		   int c = a * b;
		   System.out.printf("The multiplication of %d and %d is %d\n",a,b,c);
		}
	}

	//Division.java	
	class Division implements AO {
		@Override
		public void calculate(int a, int b){
		   int c = a / b;
		   System.out.printf("The division of %d and %d is %d\n",a,b,c);
		}
	}
/*	
3. OOP Solution:
   - We must use Functional programming as part OOP
   - As part of FP we can pass function as agument directly
     without creating new class, method and object
     
   - Whereever we need to pass a function or a logic as an argument,
     there we must use FP by using 'Functional interface and lambda expresssion'
  
4. Advantage of FP?   
   - we can write less code means consice code
   - we can avoid repeated code in creating class, method, object
     in passing a function as arguemt.
     
5. What are the building blocks FP?
	1. Functional interface
	2. Lambda Expression
  

6. Below code show FP style passing function as argument by using FI and LE
*/
	//AO.java
        @FunctionalInterface 	//FI
	interface AO1 {
		void calculate(int a, int b);
	}

	//Calc.java
	class Calc1 {
	    static void calculate(AO1 ao) {
	         ao.calculate(10, 20);
	    }
	}

	//Test.java
	class Test1 {
		public static void main(String[] args) {
						//LE
			Calc.calculate(  (int a, int b) -> { System.out.println(a+b); } );
			Calc.calculate(  (int a, int b) -> { System.out.println(a-b); } );
			Calc.calculate(  (int a, int b) -> { System.out.println(a*b); } );
			Calc.calculate(  (int a, int b) -> { System.out.println(a/b); } );
		}
	}