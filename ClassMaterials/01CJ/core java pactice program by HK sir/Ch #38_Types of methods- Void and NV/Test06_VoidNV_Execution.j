class Example {

	static void m1() {
		System.out.println("m1\n");
	}

	static int m2() {
		System.out.println("m2");
		return 50;
	}

	public static void main(String[] args){
		System.out.println("main start");
		
		m1();
		
		m2();
		int res = m2();
		System.out.println( m2()  );
		
		
		//int i = m1();
		//System.out.println( m1() );
		
		
		System.out.println("main end");
	}//Example

	static void m3(int a){
		System.out.println("m3 a: "+ a);
	}

//	static int m4(){
//		return m1();
//	}

	static int m4() {
		System.out.println("m4");
		return m2();
	}
}



/*
The data types assignment hierarchy
	byte -> short
				  \
					-> int -> long -> float -> double
				  /
			char

*/