class  Test09_TypeConversion_TC3{
	public static void main(String[] args) {

		char ch1 = 'a';	System.out.println(ch1);          
		char ch2 = 97;	System.out.println(ch2);
		char ch3 = '1';	System.out.println(ch3);
		char ch4 = 1;		System.out.println(ch4);
		char ch5 = '1'; System.out.println(ch5);
		char ch6 = 10; System.out.println(ch6);
		char ch7 = 250; System.out.println(ch7);
		char ch8 = 260; System.out.println(ch8);
		char ch9 = 65500; System.out.println(ch9);
		char ch10 = (char)66000; System.out.println(ch10);
		char ch11 = (char) -97; System.out.println(ch11);

		int i1 = '1'; System.out.println(i1);
		int i2 = 1; System.out.println(i2);

		int i3 = -97;
		char ch13 = (char)i3;		
		char ch12 = (char)i3;
		System.out.println(i3);
		System.out.println(ch12);
		System.out.println((int)ch12);
	

	}
}