class whish {
	static void m1(){
		System.out.print("Hello ");
	}
	static void m2(){
		System.out.print("Good ");
	}
	static void m3(){
		System.out.print("Bye ");
	}
	static void m4(){
		m1();
		m2();
		System.out.println("Morning");
	}
	static void m5(){
		m1();
		m2();
		System.out.println("Afternoon");
	}
	static void m6(){
		m1();
		m2();
		System.out.println("Evening");
	}
	static void m7(){
		m3();
		m2();
		System.out.println("Night");
	}
	
	public static void main(String[] args) {
		m4();
		m5();
		m6();
		m3();
		m7();
	}
}
