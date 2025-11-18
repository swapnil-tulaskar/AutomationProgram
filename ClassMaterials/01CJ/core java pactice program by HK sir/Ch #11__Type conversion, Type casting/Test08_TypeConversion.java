class Test08_TypeConversion {
	public static void main(String[] args){

 //Type conversion
		int i1 = 10;
		System.out.println("i1: "+ i1);
		
		float f1 = 10;
		System.out.println("f1: "+ f1);


//HRD  <- LRD  (AC)
		byte b6 = 5;
		int i10 = b6;

//LRD   <-  HRD  (CE: p l c ->sol -> casting)
		int i11 = 5;
 		//byte b7 = i11;
		byte b8 = (byte)i11;

		System.out.println("i9: "+i11);
		System.out.println("b8: "+b8);
		System.out.println();

	//testcase 1	
		int i12 = 254;								// SV   -   byte range tot
		byte b9=  (byte)i12;						// 254  -   256  => -2
		System.out.println(i12);
		System.out.println(b9);
		System.out.println();

	//test case 2	 
		int i13 = -254;								//SV	+    byte range tot
		byte b10 = (byte)i13;						//-254  + 256  => 2
		System.out.println(i13);
		System.out.println(b10);							
		System.out.println();								

	//test case 3							//SV     -  COT Range
		int		i14		= 1000;					//1000   -  256
		byte	b11		= (byte)i14;			//744    -  256
		System.out.println(i14);				//488    -  256 
		System.out.println(b11);				//232    -  256
		System.out.println();					//-24


/*
Rules on Auto convesion
=========================
	Rule #1: ST and DT must be compatible 
	Rule #2: STR <= DTR
*/				

		int		i2 = 5;		System.out.println("i2: " + i2);	
		long	l2 = 5;		System.out.println("l2: " + l2);	
		float	f2 = 5;		System.out.println("f2: " + f2);

		System.out.println();
		//int i3 = true;
 		int i4 =(int) 10.0;			

/*
Rules on cast operator
========================
	Rule #1: COT and ST must be compatible
	Rule #2: COT and DT also must be compatible
	Rule #3: COTR <= DTR 
*/
 		//int		i7 = true;
		//int		i8 = (int)true;	
		//boolean	b5	= (byte)i6;	
		int i6 = 10;
		byte	h6	= (byte)(short)i6;	

		System.out.println();

//multiple cast operators
		int i15 = 10;
		byte b15 = (byte)(short)i15;
		System.out.println(b15);

		int i16 = 97;
		
		byte b16 = (byte)(short)(char)(double)i16;
 
		//byte b17 = (byte)(char)(boolean)(double)i14;

		int i17 = 5;
		short s12 = (short)(byte)i17;
		
		int i18 = 254;
		short s13 = (short)(byte)i18;

		System.out.println(s12);
		System.out.println(s13);
		System.out.println();

		byte b18 = (byte)(short)(byte)i18;

	}
}