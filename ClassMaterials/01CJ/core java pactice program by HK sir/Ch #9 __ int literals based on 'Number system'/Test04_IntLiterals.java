class Test04_IntLiterals {
	public static void main(String[] args) {

//Case #1: Find what is the output
		System.out.println(12);
		System.out.println(012);				//->1*8^1 + 2*8^0 -> 1*8+2*1->8+2->10
		System.out.println(0xA1);			//->A*16^1+1*16^0->A*16+1*1->10*16+1*1->160+1=>161
		System.out.println(0b1110);  
		System.out.println();

		System.out.println(1010);
		System.out.println(0101);
		System.out.println(0B1010);
		System.out.println(0B0101);
		System.out.println();
	
//Case #2: Identify Invalid literals
		System.out.println(12);
		System.out.println(0123);
 //		System.out.println(0128);
		System.out.println(0x128);
		System.out.println(0xA1);
 //		System.out.println(0xBEER);
		System.out.println(0xBED);
		System.out.println(0xFACE);
		System.out.println(0B1010);
 //		System.out.println(0B1012);
		System.out.println(1010);
		System.out.println(0101);

		System.out.println(1234567890);
 //		System.out.println(12345678901);
		System.out.println(12345678901L);

		System.out.println(12345678901F);
		System.out.println(12345678901D);
		System.out.println();


 //			int i1 = 0b101L;
 //			int i2 = 0101L;
 //			int i2 = 0x101L;


 //			int i2 = 0x101.0;
 //			int i2 = 0b101.0;
			double i2 = 0101.0;
			double i3 = 121.0;


			System.out.println(i2);
			System.out.println(i3);

			int i4 = 0x123F;		//F is not suffix F=>15
			int i5 = 0x123D;		//D is not suffix D=>13
			//int i6 = 0x123L;
			long i7 = 0x123L;		//L is suffix => long type is applied
											//1*16^2 + 2*16^1+ 3*16^0=291

			System.out.println(i4);
			System.out.println(i5);
			System.out.println(i7);
		
 //			int i6 = 0b123F;
 //			int i6 = 0b123D;

			System.out.println();


//Case #3: Decimal, Octal, HD & Binary literals are int type literals
		//so we can assign these four types of literal 
		//to all number and char type variables
	
//test case: assigning HexaDeci to byte to char variables
		byte b0		= 0X1A;		System.out.println(b0);
 //		byte b1		= 0XA1;		System.out.println(b1);
		short s1	= 0XA1;		System.out.println(s1);
		int i1		= 0XA1;		System.out.println(i1);
		long l1		= 0XA1;		System.out.println(l1);
		float f1	= 0XA1;		System.out.println(f1);
		double d1	= 0XA1;		System.out.println(d1);
		char c1		= 0XA1;		System.out.println(c1);

 //		boolean bo1 = 0XA1;
 //		String	st1 = 0XA1;

		System.out.println();

		System.out.println();
//Case #4: suffixing L, F, D, .0F, .0D, .0
		System.out.println(5);
		System.out.println(5L);
		System.out.println(5F);
		System.out.println(5D);
		System.out.println(5.0F);
		System.out.println(5.0D);

	//	System.out.println(0B1010L);
	//	System.out.println(0B1010F);
	//	System.out.println(0B1010D);
	//	System.out.println(0B1010.0F);
	//	System.out.println(0B1010.0D);
	//	System.out.println(0B1010.0);

		System.out.println(0xA1L);
		System.out.println(0xA1F);
		System.out.println(0xA1D);
	//	System.out.println(0xA1.0F);
	//	System.out.println(0xA1.0D);
	//	System.out.println(0xA1.0);
	
		System.out.println(0123);
		System.out.println(0123L);
		System.out.println(0123F);
		System.out.println(0123D);
		System.out.println(0123.0F);
		System.out.println(0123.0D);
		System.out.println(0123.0);
/*
		int			i2		= 0xA1;				System.out.println(i2);
		int			i3		= 0xA1L; 
		long		l2		= 0xA1L;			System.out.println(l2);
		long		l3		= 0B0101L;		System.out.println(l3);
		long		l4		= 0123L;				System.out.println(l4);


//	 	int			i3		= 0xA1L;		System.out.println(i3);
		int			i4		= 0xA1F; 		System.out.println(i4);
		int			i5		= 0xA1D;		System.out.println(i5);
//		int			i6		= 0xA1DL;		System.out.println(i6);
		long		i7		= 0xA1DL;		System.out.println(i7);

		System.out.println();

//		float		f5		= 0xA1.0F;
//		double		d5	= 0xA1.0;

//		int			i8		= 0B1010L; 
		long		l6		= 0B1010L; System.out.println(l6);
//		float		f6		= 0B1010F;   
//		double		d6	= 0B1010D;
//		double		d7	= 0B1010.0;
//		double		d8	= 0B1010.0F;
		System.out.println();
/*
//		int			i9		= 0123L;		
		long			l7		= 0123L;		System.out.println(l7);
		float		f7		= 0123F;		System.out.println(f7);
		double		d9	= 0123D;		System.out.println(d9);
		double		d10 = 0123.0;			System.out.println(d10);
		double		d11 = 0123.0F;		System.out.println(d11);

		double		d12 = 012389F;	 	System.out.println(d12);
//		long	 		l9		= 012389L;
		
		System.out.println();
/**/
//Case #5: suffixing L to a floating-point number
		//long			l10	= 123.0L;
		long			l11	= (long)123.0;	System.out.println(l11);

	

		//float f = 0x3.1p0F;
		double f = 0x3.3p2;
		System.out.println(f);
/**/
	}
}