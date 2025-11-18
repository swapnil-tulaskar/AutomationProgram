class Division {
	static void div() {
		int a = Integer.parseInt(System.getProperty("fno"));
		int b = Integer.parseInt(System.getProperty("sno"));
		int c = a / b;
		System.out.println("The division of "+a+" and "+b+" is "+c);
	}
}