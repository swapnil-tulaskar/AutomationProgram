/*
 * Limitation of a variable
 * 	- it can store only one value or one object
 * 
 *   - if we try to store new value, old value is replaced with new value
 *   
 *   - if we try to store new object, old object reference is replaced with
 *     new object reference, this ref var points to new object
 *     
 *   - the old object is eligible for garbage collection
 *      - garbage collection means 
 *         the object object is unused object 
 *         it is ready to remove/destroy
 */
public class Test03 {
	public static void main(String[] args) {
		int p;
		
		p = 10;
		System.out.println(p); //10
		
		p = 20;
		System.out.println(p); //20
		
	//=========================
		
		Example e1;
		
		e1 = new Example();
		System.out.println(e1); //Example@1010
		
		e1 = new Example();
		System.out.println(e1); //Example@2020
		
	}
}