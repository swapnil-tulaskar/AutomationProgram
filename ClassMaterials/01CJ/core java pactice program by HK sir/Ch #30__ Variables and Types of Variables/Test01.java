/*
 * 01) What is a variable?
 * 	- A variable is a named memory location
 * 
 * 02) Why variable?
 * 	- It is used for storing a value or an object reference
 *    temporarily during program execution
 *    
 * 03) How can we create a variable?
 * 	- by using data type either PDT or RDT
 *    	1) for storing a math value we must use PDT 
 *    	2) for storing an object reference we must use RDT
 *    
 * 04) Basic syntax for creating a variable
 * 		DataType varName ;     
 * 		DataType varName = value;
 * 
 *      - here DT can be either PDT or RDT
 *      	- if we choose PDT to create a variable, 
 *            that variable is called primitive variable and 
 *            the assigned value must be math value
 *            
 *      	- if we choose RDT to create variable,
 *      	  that variable is called referenced variable and
 *      	  the assigned value must be an object
 *      		- an object is created by using new keyword
 *       		- the array object and class String object c
 *                can be created without using new keyword
 *                 
 *     	For example:
 *     		int 	i1 	= 10;
 *     		double	d1 	= 20.5;
 *      
 *     		int[] 	ia1	= new int[5];
 *     		int[] 	ia2	= {3, 4, 5, 6};
 *     
 *     		String 	s1 	= "Hari";
 *     		String 	s2 	= new String("NiT");
 *     
 *  Below program shows creating PV and RV      
 *        
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		//10
		//10;
		//p = 10;
		
	//primitive variables	
		int 	p 	= 10;
		double 	d 	= 10.5;
		char 	ch 	= m1(); 
		
	//array type referenced variables	
		int[] ia1 = new int[5];
		int[] ia2 = {3, 4, 5, 6, 7};
		
	//class String type referenced variables	
		String s1 = "Hari";
		String s2 = new String("NiT");
	
	//class Example type referenced variables
		Example e1 = new Example();
		Example e2 = new Example();
		
	}//main close
	
	static char m1(){ //definition
		return 'a';
	}
	
}//class close
