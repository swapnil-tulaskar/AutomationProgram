/**
Approach #2: By using System.in.read()
========================================
	cmd>javac Addition.java

	cmd>java Addition
	Enter FNO: ___ <-|
	Enter SNO: 
	Reuslt:
	
System.in.read() has two problems
	1. It can not return entire data 
	2. It can read and return only one character from the entered data
	3. It return each chatacter as its ASCII number
	
Below program shows reading runtime values by using System.in.read()
and its problems
					 
*/
import java.io.IOException;

class Addition {
	public static void main(String[] args) throws IOException {

		System.out.print("Enter FNO: ");
		int a = System.in.read();			//program execution is paused
											//for the entering value -> 56
										//after entering value, it can read
										//and return only first character '5'
										
		System.out.print("Enter SNO: ");
		int b = System.in.read();	//program execution is not paused
									//becase in System.in alread data is 
									//avalilable from the prevous entered value
									//it reads and return next character '6'
		
		System.out.println("You entered a: " + a);	//53	ASCII number of '5'
		System.out.println("You entered b: " + b);	//54	ASCII number of '6' 
		
	}
}

/*
Solution to System.in.read() problems
=====================================
We must use DataInputStream class's readLine() method
*/