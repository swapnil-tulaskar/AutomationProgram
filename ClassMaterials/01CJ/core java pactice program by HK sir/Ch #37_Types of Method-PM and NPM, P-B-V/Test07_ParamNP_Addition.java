/*
Assignment:	
  Develop a program to add two integer numbers and print result 

*/
//Addition.java
class Addition {
	static void add() {	//static values logic
		int a = 10;		//bad design, take values from method caller
		int b = 20;
		int c = a + b;
		System.out.println("No-param add result: "+ c);
	}
	
	static void add(int a, int b) {	//overloaded method with 2 parameters
		int c = a + b;				//taking values from method caller
		System.out.println("Param add result: "+ c);
	}
}

//Test07_ParamNP_Addition.java

class Test07_ParamNP_Addition {
	public static void main(String[] args) {
		Addition.add();
		System.out.println();
		
//		Addition.add(10, 20); //static vales method call
								//wrong design, read values from keyboard

		java.util.Scanner scn = new java.util.Scanner(System.in);
		
		System.out.print("Enter fno: ");
		int a = scn.nextInt();
		
		System.out.print("Enter sno: ");
		int b = scn.nextInt();
		
		Addition.add(a, b); //calling method by passing runtime values
							//dynamic values method call
		
	}
}