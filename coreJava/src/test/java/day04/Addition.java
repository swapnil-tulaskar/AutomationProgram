package day04;

public class Addition {
	//Addition.java
	
		static int add(int a, int b) throws IllegalArgumentException{
			
			if((a < 0) || (b < 0)){
				throw new IllegalArgumentException(
							"Do not pass -ve number");
			}
			else{
				return a + b;
			}
			
		}
	}


