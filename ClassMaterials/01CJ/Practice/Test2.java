class Test2 {
		public static void main(String[] args) {
			Calc.calculate(new Addition());
			Calc.calculate(new Subtraction());
			Calc.calculate(new Multiplication());
			Calc.calculate(new Division());
		}
	}
	
	class Calc {
	    static void calculate(AO ao) {
	         ao.calculate(10, 20);
	    }
	}
	
	//AO.java
	interface AO {
		void calculate(int a, int b);
	}
	
	//Addition.java
	class Addition implements AO {
		@Override
		public void calculate(int a, int b){
		   int c = a + b;
		   System.out.printf("The addition of %d and %d is %d\n",a,b,c);
		}
	}

	//Substraction.java	
	class Subtraction implements AO {
		@Override
		public void calculate(int a, int b){
		   int c = a - b;
		   System.out.printf("The subtraction of %d and %d is %d\n",a,b,c);
		}
	}

	//Multiplication.java	
	class Multiplication implements AO {
		@Override
		public void calculate(int a, int b){
		   int c = a * b;
		   System.out.printf("The multiplication of %d and %d is %d\n",a,b,c);
		}
	}

	//Division.java	
	class Division implements AO {
		@Override
		public void calculate(int a, int b){
		   int c = a / b;
		   System.out.printf("The division of %d and %d is %d\n",a,b,c);
		}
	}