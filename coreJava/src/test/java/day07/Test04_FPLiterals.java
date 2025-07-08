package day07;

/**
- In this program we will learn 
	1. proving floating-point literals are by defautl  of type 'double' 
	2. 2 ways of proving FP literal is an double type
	3. 2 ways to specify FP literal as of float type
	

*/
class Test04_FPLiterals {

public static void main(String[] args) {
	System.out.println("main start");
	
//Approach #1: assign FP literal to incompatible type varialbe
	//boolean b1 = 10.5; //CE: i c t: double can not be converted to boolean		
	//String s1 = 10.5;  //CE: i c t: double can not be converted to String

//Approach #2: by calling overload method [same name with diff parameter types]
//				by passing FP literal			

	m1(10.5);	//m1(double)
	System.out.println();
	
//Converting FP literal from [double type to float type]	
//direct variable assignment not possible we will get CE
		//float	f1 = 10.5;	
		
//#1: by using cast operator 
	float	f2 = (float)10.5;	
	m1(f2);				//m1(10.5) is used as float type
	m1((float)10.5);	//m1(10.5) is used as float type
	
//#2: by using suffix letter F/f
	m1(10F);	m1(10f);	//no CE
	
	System.out.println();
	System.out.println("main end");

}

static void m1(float f){
	System.out.println("float param method is executed");		
}

static void m1(double d) {
	System.out.println("double param method is executed");
}


}
