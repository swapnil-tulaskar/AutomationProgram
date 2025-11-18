/*
Assignment: 
	Develop a program to print 
		Good morning, Good afternoon, Good evening
	before saying above wishes we must say Hi
	
	The output must print as 
		Hi Good Morning
		Hi Good Afternoon
		Hi Good Evening
*/
class Example {
	
	static void m1(){
		System.out.print("Hi ");	
	}
	
	static void m2(){
		m1();
		System.out.println("Good Morning");	
	}
	
	static void m3(){
		m1();
		System.out.println("Good Afternoon");	
	}
	
	static void m4(){
		m1();
		System.out.println("Good Evening");	
	}

	public static void main(String[] args) {
		m2();
		m3();
		m4();
		m5();
	}
	
	static void m5(){
		System.out.println("Ok, bye, Good Night");	
	}
}

/*
 - In the above program we have learnt 
	1. Developing 'modularity' by using methods and
	2. Calling one UDM from other UDM
	
 - Modularity means dividing a big task into small reusable units 

 - In Java, we can develop Modularity 
	1. By using classes and
	2. By using methods 
	
 - For each reusable object we will create one class 
 
 - For each reusable operation we will create one method 
 
 - For other we will access and reuse this class and this method 
   from other classes and methods as shown in above program m1() method
   
*/