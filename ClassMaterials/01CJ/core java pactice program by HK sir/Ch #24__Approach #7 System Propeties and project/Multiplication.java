class Multiplication {
	static void mul() {
		int a = Integer.parseInt(System.getProperty("fno"));
		int b = Integer.parseInt(System.getProperty("sno"));
		int c = a * b;
		System.out.println("The multiplication of "+a+" and "+b+" is "+c);
	}
}