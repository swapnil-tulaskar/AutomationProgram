/*
Variable hiding and super keyword
=================================
1) What is variable hiding?
2) Can we hide both static and non-static variables?
3) Problem in hiding?
4) Solution, how can we access super hidden members?
5) how many ways we can diff?
6) super kw, where can we use?  
7) how can we access super clss members in sub class SM and in Test class(NSM/SM)? A a1;
6) super clss name where can we use?  
7) this type and super type?
8) in which class super kw in not available? 
9) Diff ref variable we can use to access a variable?
	b1, a1, this, super, A and B

10) identity from which class variable x is searched, read and modified?
	b1.x ---> from class B, if not available from class A, if not available CE:
	a1.x ---> from class A, if not available CE:
	this.x-->  from current class (B/A/Object)
	super.x-> from current class's super class (A/Object)
	A.x------> x must be static and must be available in class (A/Object)
	B.x------> x must be static and must be available in class (B/A/Object)

=================================================================================
1. creating a variable in super class and in sub class with the same name 
  is called variable hiding 

2. When we hide in super class variable in sub class and if we access that variable 
   in subclass either directly by using its name or by using subclass name or by 
   using sub class object reference, we will get its value from sub class 

3. For accessing super class hidden member in subclass by differentiating it
   from sub class hiding member, we must access it by using super keyword 

4. We cannot use a 'super keyboard' in static method and also in other classes 
   user class or test class.
   
5. For accessing Super class hidden members 
   we have 3 approaches
	1. By using super keyword 
	2. By using super class name 
	3. By using super class type referenced variable  

   - We can use super keyword only in subclass only in non-static members

   - We can use super class name only for accessing static variable 
     either in static or non static method in sub class or in user class

   - We can use super class type referenced variable either 
     in subclass or in user class either in static or non-static member 
     for accessing both static and non-static hidden member 	

Q) How can we differentiate super class hidden number from subclass hiding member 
   in test class? 
A) By using super class type referenced variable by storing subclass object 
	A a1 = new B();
	System.out.println(a1.a);
	System.out.println(a1.x);

	- a and x varaibles are read from super class A 
	from sub class B object 1010
	


*/
class A {
//hidden members by sub class members	
  static int a = 10;
  int x = 20;

}

class B extends A {

 //variable hiding
    static int a = 30;
    int x = 40;

  void m1(){
    System.out.println(a);	//30 
    System.out.println(x);	//40

    System.out.println(super.a);	//10 
    System.out.println(super.x);	//20
  }

  void m2() {
    //variable shadowing
	int a = 15;
	int x = 16;

	System.out.println(a);	//50 
	System.out.println(x);	//60

	System.out.println(this.a);	//30 
	System.out.println(this.x);	//40

  	System.out.println(super.a);	//10 
	System.out.println(super.x);	//20

  }

  static void m3(){
	System.out.println(a);
	//System.out.println(x);

	//System.out.println(this.a);
	//System.out.println(this.x);

	//System.out.println(super.a);
	//System.out.println(super.x);

	System.out.println(A.a);

	B b1 = new B();	//access B class members from B object 1010
	A a1 = b1;	//access A class members from B object 1010

	System.out.println(b1.x); //60
	System.out.println(a1.x); //20
	

  }
}
class Test {
  public static void main(String[] args) {
	B b1 = new B();

	System.out.println(b1.a);
	System.out.println(b1.x);

	//System.out.println(super.a);
	//System.out.println(super.x);

	A a1 = b1;
	System.out.println(a1.a);
	System.out.println(a1.x);
  }
}

For more test case program refer images atached down in GCR