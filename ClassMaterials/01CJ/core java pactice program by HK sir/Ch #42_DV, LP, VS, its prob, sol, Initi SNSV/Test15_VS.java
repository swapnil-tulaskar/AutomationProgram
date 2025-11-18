/*
Variable shadowing, its problem and solution
 - Creating variables inside a class and inside a method
   with the same name is called variable shadowing.

 - This concept is named as variable shadowing, because
   the local variable becomes shadow(hiding) of class level variable.

 - It means when we access the variable a, 
   compiler 'reads and modifies' value only in local variable 

 - In presence of VS, if we want to 'read and modify' SV value, 
   we must access SV by using its class name as Example.a

 - The diff b/w
   	System.out.println(a);			//LV or SV (Example.a)
   	System.out.println(Example.a);	//only SV
  
 - For differentiating NSV from LV, 
   we must access it by using this kw
	System.out.println(x);			//LV or CO NSV
	System.out.println(this.x);		//only CO NSV

*/

class Example {
	static int a = 10;

	public static void main(String[] args) {
		
		int a = 50;

        

	}
}