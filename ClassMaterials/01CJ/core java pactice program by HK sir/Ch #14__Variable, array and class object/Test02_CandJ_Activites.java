/**
09) Compiler and JVM activties w.r.t to variable creation statement?
	 - Compiler verifies syntax by applying 5 ruels 
	 - JVM allocates memory based on the given data type
	 
Below program shows all above proints
*/
class Example {
	public static void main(String[] args) {
		
		int a = 5;		//no CE, no RE, memory is allocated and value 5 is stored
		
		
		//int1 i1 = 10;				//CE: can not find symbol class int1 (Rule #1)
		//int  2i = 20;				//CE: <identifier> expected          (Rule #2) 	
		//int  i3 = 123456788901l;	//CE: integer number too large		 (Rule #3)	
		//int  i4 = true;			//CE: i c t: boolean and int		 (Rule #4)
		//int  i4 = 10.5;			//CE: p l cfrom double to int		 (Rule #5)
		
	}
}