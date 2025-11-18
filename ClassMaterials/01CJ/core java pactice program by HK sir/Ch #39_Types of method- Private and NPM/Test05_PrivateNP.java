class Example {
	private static void m1(){
		System.out.println("m1");
	}

	static void m2(){
		System.out.println("m2");
	}

	static void m3() {
		System.out.println("m3");
		m1();
	}
}

class Test05_PrivateNP {
	public static void main(String[] args) {
		//m1();    //CE: c f s
		//m2();		//CE: c f s

		//Example.m1(); //CE: m1() has privare access in class Example
		Example.m2();
		
		Example.m3();

	}
}