class Example{
	int x = 10;
	
	void m1(int p){
		p = 50;
	}

	void m2(Example e){
		e = new Example();	
	}

	void m3(Example e){
		e.x = 15;
	}

	void m4(Example e){
		e = new Example();
		e.x = 16;
	}

	void m5(Example e){
		e.x = 19;
		e = new Example();
		e.x = 20;
	}
}//Example end

class Test31 {
	public static void main(String[] args) {

		Example e1 = new Example();
		
		int q = 18;
		System.out.println("b m c q: "+q);
		e1.m1(q);
		System.out.println("a m c q: "+q);
		System.out.println();

		Example e2 = new Example();
		System.out.println("b m c e2: "+e2);
		e1.m2(e2);
		System.out.println("a m c e2: "+e2);
		System.out.println();

		System.out.println("b m c e2: "+e2);
		System.out.println("b m c e2.x: "+e2.x);
		e1.m3(e2);
		System.out.println("a m c e2.x: "+e2.x);
		System.out.println("a m c e2: "+e2);
		System.out.println();

		System.out.println("b m c e2.x: "+e2.x);
		e1.m4(e2);
		System.out.println("a m c e2.x: "+e2.x);
		System.out.println();

		System.out.println("b m c e2.x: "+e2.x);
		e1.m5(e2);
		System.out.println("a m c e2.x: "+e2.x);
/**/
	}
}