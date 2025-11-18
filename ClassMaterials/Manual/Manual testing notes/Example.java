class Example {
	
	static void m1(float f){
		System.out.println("float-pram");
	}
	static void m1(int i){
		System.out.println("int-pram");
	}
	public static void main(String[] args) {
		m1(5.6);
		m1(5);
	}
}

