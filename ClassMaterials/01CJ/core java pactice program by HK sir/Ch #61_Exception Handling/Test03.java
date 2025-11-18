class Division {
	public static void main(String[] args) {
		try{		

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("Result: "+ c);

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter two integers as below");
			System.out.println("  java Division 10 5");

		}catch(NumberFormatException e){
			System.out.println("Please enter only integers");

		}catch(ArithmeticException e){
			System.out.println("Please DONOT enter ZERO as second value");
		}
	}
}


