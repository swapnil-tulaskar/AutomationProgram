/*
Testcase #2: char data compatibility
=====================================
1) char data type is compatible with all numeric data types (b, s, i, l, f, d)

2) hence we can assign any character literal to numeric variables
     and we can assign int literal to char variable

3) when we assign char literal to int variable and int literal to char variable, 
	the required conversion (ASCII char to ASCII number and vise versa) 
	will be done by either compiler or JVM automatically
	
4) When we assign int literal to char variable,
   if that int literal matching character is not 
   supported by the OS, JVM displays '?'

Rules:
5) We can assign int literal to char variable 
   but only in the range of 0-65535 only

6) We can assign char variable to int variable, 
   but we can not assign int variable to char variable 

7) We can assign char literal to byte and short variables, 
   but we can not char variable to byte and short variable 

8) same way we can not byte and short variables to char variable, 
   because byte and short type have -ve number range 
   which is not there in char type
   
9) Remember by using cast operator 
    we can assign char variable to byte and short variables
    also byte and short variables to char variable

*/

class  Test09_TypeConversion_TC2{
	public static void main(String[] args) {

		char ch1 = 'a';						System.out.println(ch1);
		char ch2 = 97;						System.out.println(ch2);
		System.out.println();

		int i1 = 98;						System.out.println(i1);
		int i2 = 'b';						System.out.println(i2);
		System.out.println();


		char ch3 = 255;			System.out.println(ch3);				
		char ch4 = 260;			System.out.println(ch4);					
		char ch5 = 65000;		System.out.println(ch5);			
	//	char ch6 = 66000;						
	//	char ch7 = 65536;							

		char ch8 = 'a';
		int	 i3	= ch8;  
		System.out.println(ch8);
		System.out.println(i3);
		System.out.println(); 

		int i4 = 97;
		char ch9 = (char)i4;
		char ch10 = (char)i4;
		System.out.println(i4);
		System.out.println(ch8);
		System.out.println();

		byte b1 = 'a';				System.out.println(b1);
		short s1 = 'a';				System.out.println(s1);
		System.out.println();
		
		char ch11 = 'a';
		byte b2 = (byte)ch11;
		short s2 = (short) ch11;

		byte b_2 = (byte)ch11;
		short s_2 = (short)ch11;
		System.out.println(b2);
		System.out.println(s2);
		System.out.println();

		byte b3 = 97;
		char ch12 = (char)b3;				
		char ch13 = (char)b3;
		System.out.println(b3);
		System.out.println(ch13);
		System.out.println();

		short s3 = 98;
		char ch14 = (char)s3;
		char ch15 = (char)s3;
		System.out.println(s3);
		System.out.println(ch15);
		System.out.println();

		final char ch16 = 'a';
		byte b4 = ch16;				
		System.out.println(ch16);
		System.out.println(b4);
		System.out.println();

		final byte b5 = 97;
		char ch17 = b5;
		System.out.println(b5);
		System.out.println(ch17);

		final char ch18 = 197;
		byte b_5= (byte)ch18;
		byte b7 = (byte)ch18;
		System.out.println(b7);
		System.out.println(ch18);


	}
}