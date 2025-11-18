class Test01_LiteralsAndRules{
	public static void main(String[] args){
		//10;
		//#1 Literal is used for intialinzing variable
		int a =99;
		//#2: Literal is used for performing Validations
			if(a<100){
				System.out.println("Hi you enter value less then 100");
			}
			else{
				System.out.println("Hello you enter value greater then 100");
			}
	
		//#3: Literal is used for performing calculation
			int b=a+10;
			//#4: Literal is used for passing input (argument) to a method
				System.out.println("the result of b=a+10 is " +b);
				m1(123456789011l);
	}
			//static void m1(byte p){ when we use byte type CE:incompatible types: possible lossy conversion from int to byte
				// static void m1(int p){ when we use int type CE: integer number too large
				/*static void m1(long p){// when we use long type but not mention in m1(123456789011); with last L 
					CE: error: integer number too large
					after that we mention the vlue with m1(123456789011L);
					*/
					static void m1(long p){
				System.out.println("From m1 p:" +p);
			}
			//#4:Literal is used for return result result from a method
			static int m2(){
				return 0;
			}
			
	}

