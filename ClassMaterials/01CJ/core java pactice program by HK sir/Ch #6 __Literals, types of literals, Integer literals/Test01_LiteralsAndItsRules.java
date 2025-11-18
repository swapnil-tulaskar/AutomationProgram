/**
 Below program shows 
	1. What is a literal?
	2. Why literal or the operations we can perform by using a literal?
*/


class  Test01_LiteralsAndItsRules{
	public static void main(String[] args) {
		
		//10;
		
	//#1: Listeral is used for initializing variable 
		int a = 10;

	//#2: Literal is used for performing validations
		if(10<100) {
			System.out.println("Hi");		
		}else {
			System.out.println("Hello");		
		}

	//#2: Literal is used for performing calcualtion
		int b = a  + 10;

	//#3: Literal is used for passing input (argumet) to a method
		System.out.println(10);
		m1(10);
		
	}
	
	static void m1(int p){
		System.out.println("From m1 p: "+ p);
	}
	
//#4: Literal is used for return result from a method
	static int m2() {
		return 10;		
	}

}