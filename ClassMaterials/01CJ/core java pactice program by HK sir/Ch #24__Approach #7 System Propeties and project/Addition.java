class Addition {
	static void add() {
		int a = Integer.parseInt(System.getProperty("fno"));
		int b = Integer.parseInt(System.getProperty("sno"));
		int c = a + b;
		System.out.println("The addition of "+a+" and "+b+" is "+c);
	}
