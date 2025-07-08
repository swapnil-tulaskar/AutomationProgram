package day07;

/**
- In this program we will learn 
	1. proving integer literals by defautlo of type 'int' 
	2. 2 ways of proving integer literal is an int type
	3. 3 ways to specify integer literal as of byte, short and long type
			===============================
						VS	Cast  suffix
			===============================
			byte		Y	 Y	    N
			short		Y    Y		N
			long		Y    Y		Y
			===============================
	

*/
class Test03_IntegerLiterals {

public static void main(String[] args) {
	System.out.println("main start");
	
//Approach #1: assign integer literal to incompatible type varialbe
	//boolean b1 = 10; //CE: i c t: int can not be converted to boolean		
	//String s1 = 10;  //CE: i c t: int can not be converted to String

//Approach #2: by calling overload method [same name with diff parameter types]
//				by passing integer literal			

	m1(10);	//m1(int)
	System.out.println();
	
//Converting integer literal from [int type to byte,short and long] type	
//#1: by using variable assignment	
	byte	b1 = 10;	m1(b1);	//m1(10) is used as byte type
	short	s1 = 10;	m1(s1); //m1(10) is used as short type
	long	l1 = 10;	m1(l1); //m1(10) is used as long type
	System.out.println();
	
//#2: by using cast operator 
	m1((byte)10);	//m1(10) is used as byte type
	m1((short)10); //m1(10) is used as short type
	m1((long)10); //m1(10) is used as long type
	System.out.println();
	
//#3: by using suffix letter
	//m1(10B);	m1(10b);	//CE
	//m1(10S);	m1(10s);	//CE
	m1(10L);	m1(10l);	//no CE
	
	System.out.println();
	System.out.println("main end");

}

static void m1(byte b){
	System.out.println("byte param method is executed");		
}

static void m1(short s) {
	System.out.println("short param method is executed");
}

static void m1(int i) {
	System.out.println("int param method is executed");
}

static void m1(long l) {
	System.out.println("long param method is executed");
}


}
