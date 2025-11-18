class Test08_TypeCoversion {
	public static void main(String[] args) {
		float f1 =10;
		System.out.println("f1:"+f1);
		System.out.println();
		int i2=5;	System.out.println("i2:" +i2);  //here o/p is "5" int type literal
		float f2=5; System.out.println("f2:" +f2); //here o/p is "5.0" float type literal
		System.out.println();
	
		//int i4=10.0;  CE: incompatible types: possible lossy conversion from double to int     
		int i6=(int)10.0;
		System.out.println("i6:"+i6);  //here o/p is "10" double literal converted into int used to cast operator.
		
		int i9=258; System.out.println("i9:"+i9);
		 // byte b3 =i9; CE: incompatible types: possible lossy conversion from int to byte beacause of int range is greater then byte 
						// so we use cast operator (byte).
		byte b4 = (byte)i9; //then no compile time error  
		System.out.println(b4);

		// high range data<= Low range data
		// HRD<=LRD (CE: PLC ->sol -> casting)
		int i11= 5;
		//byte b7=i11;
		byte b8= (byte)i11;
		
		System.out.println("i9:" +i11); System.out.println("b8:" +b8);
		System.out.println();
		
		// testcase1 
		int i12= 254;
		byte b9= (byte)i12;
		System.out.println(i12);
		System.out.println(b9);
		System.out.println();
		
		//test case 2
		int i13 = -254;
		float b10 =(byte)(float)i13;
		
		char b1 =10;
		char b2 = 50;
		char b3= (char)( b1+ b2);
		System.out.println(b3);
		
		
		
	
		
	}
}


