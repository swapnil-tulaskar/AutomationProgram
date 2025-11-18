/*
 * - Compiler is responsible for checking syntax
 *   |- Compiler verifies a variable creation syntax by applying 4 rules
 *		1. Whether the data type is valid or not
 *		2. Variable name following identifier rules or not
 *		3. Value is valid or not
 *		4. Value is compatible to destination type or not
 *		5. Value range is lesser than destination type or not
 *   
 *    if all above 5 rules are satisfied then compiled, 
 *    else we will get CE
 *    
 * - JVM is responsible for providing memory
 *   |- JVM provides memory as below 
 *   	1. Allocates memory based on given type, 
 *   	2. Number of bytes based on the given type
 *   	3. Name this memory with given name and 
 *   	4. stores given value in this memory
 *   
 * 		int i1 = 5; //here no CE becase valid dt, identifier and value
 * 					//JVM allocates memory of int type
 * 					//with 4 bytes and name this memory with i1
 * 					//an stores 5 in this memory 
 * 	
 * - JVM will not store given decimal value directly inside
 *   variable memory. It stores given decimal value in binary value format
 *   
 * - for converting decimal value to binary value, 
 *   we must divide this decimal value by 2 and collects reminders
 *   
 *     		int a = 5;
 *     
 *     		2|5   
 *     		2|2 => 1
 *            1 => 0
 *            
 *    In memory bits are filled from Right to Left
 *    by adding 0s at left side        
 *            
 *            
 */

public class Test02 {
	public static void main(String[] args) {
	  //DT   identifier       value  
		int 	p           = 5;
		
		//int1	i1 = 5;				//CE: can not find symbol class int1
		//int   2i = 6;				//CE: <identfier> expected
		//int   i3 = 600000000000;	//CE: integer number too large
		//int   i4 = 600000000000L;	//CE: i c t : p l c
		//int   i5 = true;			//CE: i c t : can not be converted
	}
}