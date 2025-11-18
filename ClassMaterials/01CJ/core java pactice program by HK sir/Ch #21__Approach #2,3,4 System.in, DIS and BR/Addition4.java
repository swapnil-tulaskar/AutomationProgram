/**
Approach #3: By using DataInputStream.readLine()
====================================================
1. By using DIS.readLine() method we can read entire value at a time as one line
   and returne the value as it is without converting it into ASCII numbers 
   means 56 returns as "56"
   
2. We can not use "56" in the program as nummber as int value
 
3. We must convert 56 from String to int by using WC.parseXxx(-) method

4. As many values we want to read form KB
   those many times we must called readLine() method
   
5. For calling readLine() method, first of all we must create
   object of DataInputStream class by connecting to KB as below
   
		DataInputStream dis = new DataInputStream(System.in);
		int a = Integer.parseInt(dis.readLine());
		int b = Integer.parseInt(dis.readLine());
	
Below program shows reading runtime values 
by using DataInputStream.readLine() and its problems
					 
*/
import java.io.DataInputStream;
import java.io.IOException;

class Addition {
	public static void main(String[] args) throws IOException {

		//creating DIS class object connecting to KB
		DataInputStream dis = new DataInputStream(System.in);
		
		//reading values from keyboard by prompting messages
		System.out.print("Enter FNO: ");
		int a = Integer.parseInt(dis.readLine());		
										
		System.out.print("Enter SNO: ");
		int b = Integer.parseInt(dis.readLine());		
		
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
Addition4.java
Displaying Addition4.java.
__Approach #2,3,4: System.in, DIS and BR
Java HariKrishna (Java)
•
3 Sept
100 points

Addition3.java
Java

Addition4.java
Java

Addition5.java
Java

Student.java
Java

CollegeBR.java
Java

03 (5).png
Image

03 (6).png
Image

03 (7).png
Image

03 (8).png
Image

03 (9).png
Image

03 (10).png
Image

03 (11).png
Image

03 (12).png
Image

03 (13).png
Image
