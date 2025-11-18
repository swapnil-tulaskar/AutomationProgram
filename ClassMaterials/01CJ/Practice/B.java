class B {
	int x;
	void m1(int p){
		System.out.println("NSM M1 is Executed");
	System.out.println("this p value:"+p);     
		  
	}
	void m2(){
		x=10;
		
	}
	public static void main(String[] args) {
		System.out.println("main start");
		B b1= new B();
		B b2= new B();
		System.out.println(b1.x+"____"+b2.x);
		b1.m1(10);
		System.out.println(b1.x+"____"+b2.x);
		b2.m2();
		System.out.println(b1.x+"____"+b2.x);
		
		System.out.println("main end");
	}
}
