/**
bellow programd explains
		1. both variables and listerals must have type
		2. to the variables we must specify type
		3. To the literals we no need to specify type, each literal have inbuilt type
		4. Types of literals
		5. special literal null case
		6. class literal with PDT and classname, array
*/
class Test02_TypeOfLiterals{
	public static void main(String[] args) {
		
		//we must specify type to the variable, else we will get CE: cannot find symbol
		//System.out.println(a);
		//System.out.println(b);
		
		// we no need to specify type to the literals
		//Compiler and JVM knows thier type, here no CE
//*		
		//1. integer type literals
			System.out.println(10); //integer literal of type int
		    System.out.println(20); //integer literal of type int
			
		//2. Floating-point type literals
			System.out.println(10.5); //fp  literal of type double
			System.out.println(20.7); //fp  literal of type double
		//3. character type literals
			System.out.println('a');   // character literal of type char
			System.out.println('1');	//character literal of type char
			System.out.println('@');	//character literal of type char
		
		//4. boolean type literals
			System.out.println(true);	//Boolean literal of type boolean
			System.out.println(false);	//Boolean literal of type boolean
			
		//5. String type literals
			System.out.println("true");    
			System.out.println("false");
			System.out.println("hari");
			System.out.println("a@12");      
		
			// when we do not close with then CE:unclosed string literal
			
		//6.Null type literals
			//System.out.println(null); //CE:reference to println is ambiguous
			
			//int i1=null; //CE:incompatible types: <null> cannot be converted to int
			//char c1=null; //CE: incompatible types: <null> cannot be converted to char
			
			//null is reference type literal we can not assign to primitive variable
			String s1 = null;
			int[] ia= null;
			Test02_TypeOfLiterals t1=null;
			
			System.out.println(s1); //Null literal of type java.lang.String type
			System.out.println(ia); //Null literal of type int[] type
			System.out.println(t1); //Null literal of type Test02_TypeOfLiterals type  class name
			System.out.println(); 
			
			System.out.println("null"); // String literal with the character n u l l
			
			String s2=null;		//null literal
			String s3="null";	// string literal with the character  n u l l 
			
			System.out.println(s2);   //null
			System.out.println(s3);		//n u l l
			
			//System.out.println(null); // CE: both method println(char[]) in PrintStream and method println(String) in PrintStream match
			//System.out.print(s2.toUpperCase()); //no CE, RE: Java.lang.NullPointerException
			System.out.println(s3.toUpperCase()); //no CE,no RE, o/p: null
			//7. Class type literals [DTname.class][DTname can be either PDT or RDT name]
			System.out.println(String.class); // class literal of type java.lang.class
			System.out.println(int[].class); // class literal of  java.lang.class
			System.out.println(double[].class); // class literal of java.lang.class
			System.out.println(float[].class);  // class literal of java.lang.class
			System.out.println(long[].class); // class literal of java.lang.class+
			System.out.println(long[].class);
			System.out.println(boolean[].class);
			System.out.println(Test02_TypeOfLiterals.class);
			System.out.println(int.class);
			System.out.println(double.class);
			
			
	}
}
