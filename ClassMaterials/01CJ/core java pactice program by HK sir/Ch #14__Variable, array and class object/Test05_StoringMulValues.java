/*
How can we store mulitiple values in a program?
	1. by creating mulitple variables
	2. by using array or class object

Below program shows storing mulitiple values 
by creating mulitple variables one per value
*/
class Test05_StoringMulValues {
	public static void main(String[] args) 	{

		int i1 = 3;					//the problems with mulitple variables
		int i2 = 4;						//1. takes more time to read variables
		int i3 = 5;						//    becauase those variables memory
		int i4 = 6;						//    is created in different locations	
		int i5 = 7;					
												
		System.out.println("i1: "+ i1);	//2. code is static nature
		System.out.println("i2: "+ i2); //  because when we need to store more values
		System.out.println("i3: "+ i3);	//  or when we need to remove existing values
		System.out.println("i4: "+ i4);	//  we must modify code every time either 
		System.out.println("i5: "+ i5); //  by adding new variable or by removing
										//  existing varaibles
		//m1();			//CE
		m1(5);							//3. A method with primitive type parameter
		//m1(5, 6);		//CE			//   can't take '0 to n' number of values at a time 
	}									//   Everytime We must add or remove parameters	
										//   based values we need to pass as argument
	static void m1(int p){
								//to solve above 3 problems
	}							// - to store multiple values as one group
}								//   in continuation locations with single
								//   variable name

								// - to pass '0-n' of values as argument 
								//   with single parameter and return type

								//we must use array object or class object	
