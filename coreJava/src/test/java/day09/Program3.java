/**
 * Q4. Web Page Element Visibility
Rules:
Visibility false -> skip
Visibility true -> print element name

Simulate this in Java using two arrays:

String[] names = {"Login","Search","Profile","Cart"};
boolean[] visible = {true, false, true, false};
 */
package day09;

public class Program3 {
	public static void main(String[] args) {
		
		String[] names = {"Login","Search","Profile","Cart"};
		boolean[] visible = {true, false, true, false};
		
		for(int i = 0 ; i<visible.length; i++) {
			
			System.out.println(visible[i]);
			
		}
		
		
	}

}
