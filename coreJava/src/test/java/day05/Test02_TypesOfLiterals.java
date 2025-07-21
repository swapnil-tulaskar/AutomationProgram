package day05;
/**
Below program explain
	1. Both variables and literals must have type
	2. To the variables we must specify type
	3. To the literals we no need to specify type, each literal have inbuilt type
	4. Types of literals
	5. special liter null cases 
	6. class literal with PDT and classname, array
*/
class Test02_TypesOfLiterals {
	public static void main(String[] args) {
		
		//we must specify type to the variable, else we will get CE: c f s
			//System.out.println(a);
			//System.out.println(b);
		
		//we no need to specify type to the literals
		//Compiler and JVM knows thier type, here no CE
		
		//1. Integer type literals
			System.out.println(10);	//Integer literal of type int
			System.out.println(20);	//Integer literal of type int
			
		//2. Floating-point type literals
			System.out.println(10.5);	//FP literal of type double
			System.out.println(20.7);	//FP literal of type dobule 
			
		//3. Character type literals
			System.out.println('a');	//Character literal of type char
			System.out.println('1');	//Character literal of type char 
			System.out.println('@');	//Character literal of type char
			
		//4. Boolean type literals
			System.out.println(true);	//Boolean literal of type boolean
			System.out.println(false);	//Boolean literal of type boolean 

		//5. String type literals
			System.out.println("true");	//String literal of type java.lang.String
			System.out.println("false");//String literal of type java.lang.String
			System.out.println("hari");	//String literal of type java.lang.String
			System.out.println("a@12");	//String literal of type java.lang.String
			
		//6. Null type literals
			//System.out.println(null);	//Null literal of type any referenced type
										//CE: ambigous error can not determine its specific type
										//we must specify type to it by assigning to a referenced type variable
			
			//int	i1 = null;		//CE: incompatible types: <null> cannot be converted to int					
			//char	c1 = null;		//null is a referenced type literal, we can not assign to primitive variable

			String	s1 = null;	
			int[]	ia = null;
			Test02_TypesOfLiterals t1 = null;
			
			System.out.println(s1);		//Null literal of type java.lang.String type
			System.out.println(ia);		//Null literal of type int[] type
			System.out.println(t1);		//Null literal of type Test02_TypesOfLiterals type
			System.out.println();
			
			//System.out.println(null);	//Null lieral of any referenced type, CE:
			System.out.println("null");	//String literal with the charactes n u l l
			
			System.out.println();
			String s2 = null;		//null literal
			String s3 = "null";		//string literal with the characters n u l l
			
			System.out.println(s2);		//null	
			System.out.println(s3);		//null	
			//System.out.println(null);	//CE
			
			//System.out.println(s2.toUpperCase()); //no CE, RE: java.lang.NullPointerException
			System.out.println(s3.toUpperCase()); //no CE, no RE, O/P: NULL
			
		//7. Class type literals [DTname.class] [DTname can be either PDT or RDT name]
			System.out.println(String.class);	//Class literal of type java.lang.Class 
			System.out.println(int[].class);	//Class literal of type java.lang.Class 
			System.out.println(Test02_TypesOfLiterals.class);	//Class literal of type java.lang.Class 
			System.out.println(int.class);		//Class literal of type java.lang.Class 
			System.out.println(double.class);  //Class literal of type java.lang.Class 
	}
}
