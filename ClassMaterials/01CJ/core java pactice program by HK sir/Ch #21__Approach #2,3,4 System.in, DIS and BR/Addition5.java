/**
Approach #4: By using BufferedReader.readLine()
====================================================
1. By using BR.readLine() method we can read entire value at a time as one line
   and returne the value as it is without converting it into ASCII numbers 
   means 56 returns as "56"

2. For calling readLine() method we mus create BR class object 
   by connecting to KB and in the next lines of code we must 
   call readLine() for reading values form keyboard as shown below
   
   		BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
	
Below program shows reading runtime values 
by using BR.readLine() 
					 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Addition {
	public static void main(String[] args) throws IOException {

		//creating BR class object connecting to KB
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		
		//reading values from keyboard by prompting messages
		System.out.print("Enter FNO: ");
		int a = Integer.parseInt(br.readLine());		
										
		System.out.print("Enter SNO: ");
		int b = Integer.parseInt(br.readLine());		
		
		//adding the entered two values
		int c = a + b;

		System.out.println("Result: "+ c);
	}
}

/*

Problem of DataInputStream class and its solution
=================================================
- It can not return some of characters properly from keyboard

- Hence its readLine() is depricated and 
  alternative method is provided in BufferedReader class 
  with the name readLine()
  
*/