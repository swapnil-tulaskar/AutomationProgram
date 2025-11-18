class  Test09_TypeConversion_TC1{
	public static void main(String[] args) {

		long l1 = 5;
		float f1 = l1;
		
		System.out.println(l1);
		System.out.println(f1);
		System.out.println();

		float f2 = 10; 
//		long  l2 = f2;
		long  l3 = (long)f2;
		System.out.println(f2);
		System.out.println(l3);
		System.out.println();

//		long l4 = 9223372036854775807; 
		
		long l5 = 9223372036854775807L;
		System.out.println("is"+l5);


//		float f4 = 9223372036854775807;
		float f5 = 9223372036854775807L;
		System.out.println("this is "+f5);
		System.out.println((long)f5);
		System.out.println((char)(short)f5);
	
/*	*/
	}
}



