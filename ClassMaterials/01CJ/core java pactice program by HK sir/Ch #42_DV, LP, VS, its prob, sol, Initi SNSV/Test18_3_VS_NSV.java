class Example{
	int x = 10;
	
	void m1() {
		int  x = 50;
		System.out.println(x);
		System.out.println(Example.x);

	
	}
	public static void main(String[] args) {
		
		Example e1 = new Example();
		e1.m1();

	}
}