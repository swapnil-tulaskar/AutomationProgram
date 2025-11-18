//The complete algorithm for searching for a method definition

	//ST -> STW -> AB -> ABW -> 
		//STVA -> STWVA 
		 //->ABVA->ABWVA -> CE: c f s
	//CE: a e

//If we donot have 
	//[same type or widening or AB or ABW] 
//type parameters methods and if we have both 
	//[stva/stwva] and [ABva/ABwva] combination
//compiler will throw CE: a e


class Test17_MOVL_TC3_5{
/*	static void m1(int a){
		System.out.println("int-param");
	}
	static void m1(long a){
		System.out.println("long-param");
	}
	static void m1(float f){
		System.out.println("float-param");
	}
	static void m1(double d){
		System.out.println("double-param");
	}
	static void m1(Integer io){
		System.out.println("Integer-param");
	}
	static void m1(Long lo){
		System.out.println("Long-param");
	}
	static void m1(Number io){
		System.out.println("Number-param");
	}
	static void m1(Object o){
		System.out.println("Object-param");
	} 
	static void m1(int... i){
		System.out.println("int var arg-param");
	}
	static void m1(long... i){
		System.out.println("long var arg-param");
	}
	static void m1(float... i){
		System.out.println("float var arg-param");
	} 
	static void m1(double... i){
		System.out.println("double var arg-param");
	}
	static void m1(Integer... i){
		System.out.println("Integer var arg-param");
	}
	static void m1(Long... i){
		System.out.println("Long var arg-param");
	}
	static void m1(Number... i){
		System.out.println("Number var arg-param");
	}
	static void m1(Object... i){
		System.out.println("Object var arg-param");
	}
/**/
	public static void main(String[] args) {
		m1(5);
	}
}




