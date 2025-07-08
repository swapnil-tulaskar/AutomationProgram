package day07;

class Test08_nullLiteral {
	public static void main(String[] args) {
		
		//System.out.println(null);
		
		System.out.println((String)null);
		System.out.println((int[])null);
		
		String s = null;
		int[] ia = null;
		
		System.out.println(s);
		System.out.println(ia);
		
		double[] da1 = null;		//null literal
		//double[] da2 = "null";	//string liteal
		
		String s1 = null;			//null literals
		String s2 = "null";			//string liteal with characters n u l l 
		
		System.out.println(s1);
		System.out.println(s2);
		
		//System.out.println(s1.toUpperCase()); //RE: java.lang.NullPointerException
		System.out.println(s2.toUpperCase());	//no RE, O/p: is NULL
		

	}
}