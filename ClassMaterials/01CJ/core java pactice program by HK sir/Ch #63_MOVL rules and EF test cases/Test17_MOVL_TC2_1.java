class CalleeImpl{
	public void foo(Object o) {
		   System.out.println("Object parameter");
	}
	public void foo(String s){
		System.out.println("String parameter");
	}
	public void foo(Integer i){
		System.out.println("Integer parameter");
	}
}
public class Test17_MOVL_TC2_1{
	public static void main(String[] bdsvf){
		CalleeImpl cl = new CalleeImpl();

		Object ob1	= new Object();
		Object ob2	= "HK";
		Object ob3	= 7279;

		cl.foo(ob1); 
		cl.foo(ob2);  
		cl.foo(ob3); 

		System.out.println();
		cl.foo("HK");
		cl.foo(7279);

		System.out.println();
		cl.foo((String)ob2); 
		cl.foo((Integer)ob3); 

		System.out.println();
		cl.foo((String)ob1); 
		cl.foo((Integer)ob1); 
		cl.foo((Integer)ob2); 
		cl.foo((String)ob3);

		Integer io1 = 7279;
		cl.foo((String)io1);

/**/
	}
}




