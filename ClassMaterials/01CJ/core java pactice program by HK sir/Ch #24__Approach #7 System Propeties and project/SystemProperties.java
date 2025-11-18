/*
>javac SystemProperties.java
	|-> SystemProperties.class
	
>java SystemProperties
	Exception NumberFormatException: cannot parse null
	
	
>java -Dfno=10 -Dsno=20 SystemProperties
	Result: 30

>java -Dfno=40 -Dsno=70 SystemProperties
	Result: 30

>java -DFno=40 -Dsno=70 SystemProperties
	Exception NumberFormatException: cannot parse null

*/

class SystemProperties {
	
	public static void main(String[] args) 	{
		
		int a = Integer.parseInt(System.getProperty("fno"));
		int b = Integer.parseInt(System.getProperty("sno"));
		int c = a + b;
		
		System.out.println("Result: "+ c);
	}
}
