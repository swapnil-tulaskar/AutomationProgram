

class Test03_TypeOfliterals {
	public static void main(String[] args) {
			//System.out.println("main start");
		//approch #1: assign integer literal to incompatible type variable
		// boolean b1 = 10; i c t: int can be coneverted to boolen
		  // String s1 =10; CE: int cannot be converted to String
		  // approch #2: by calling overload method [same name with diff parameter types]
			// by passing integer literal			
		     m1(10); 
			System.out.println();
//coverting integer literal from [int type to byte,short and long] type 
//#1 by using variable assignment
			byte b1=10;   m1(b1);
			short s1 =10;		m1(s1);
			long l1 =10;		m1(l1);
			System.out.println();
			
//#2 by using cast operator
			m1((byte)10);
			m1((short)10);
			m1((long)10);
			//System.out.println();	
//#3 by using suffix letter
			//m1(10b);  CE:
			//m1(10s);  CE:
			m1(10l);
			//System.out.println();
			//System.out.println("main end"); 
			
	}
     static void m1(byte b1) {
		 System.out.println("byte param method is executed");
		 
	 }
	 static void m1(short s){
		System.out.println("short param method is executed");
	 }
	 static void m1(int i){
		 System.out.println("int param method is executed");
	 }
	 static void m1 (long l) {
		System.out.println("long param method is executed");
	 }
}
