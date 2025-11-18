//Test06_class.java //use class 
class Test06_class {
	public static void main(String[] args) {
		
		//variable &  object from the class Example
		Example e1 = new Example();	
		
		//printing object, this object's ClassName@hashCode is printed
		System.out.println(e1); //Example@1010
		
		//printing object values, we must access each variable separately  
		System.out.println(e1.i1);	//5
		System.out.println(e1.d1);	//6.7
		System.out.println(e1.ch);	//a
		System.out.println(e1.la);	//[J@2020
		System.out.println(e1.la[0]);//8
		System.out.println(e1.la[1]);//9
		System.out.println(e1.s1);	//Hari
		
	}
}