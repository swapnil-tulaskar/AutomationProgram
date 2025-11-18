class B {
	public static void main(String[] args) {
		 //boolean b1=10.5; //double cannot be converted to boolean
		//String s1=10.5;
		m1(10.5);
		System.out.println();
		//float f1= 10.5;
		float f2 =(float)10.5;
		m1(f2);
		m1((float)10.5);
		m1(10F); m1(10f);
		System.out.println();
		
	}
	
	static void m1(float f){
		System.out.println("float param method is executed");		
	}

	static void m1(double d) {
		System.out.println("double param method is executed");
	}
}
