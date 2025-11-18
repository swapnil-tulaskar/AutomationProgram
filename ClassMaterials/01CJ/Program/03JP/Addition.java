/** this class is used for adding two number
@ auther : HK
@ since  : 1.0
*/
class Addition{
/*
	Public static void add(){
			int a=10;
			int b=20;
			int c=a+b;
		System.out.println(c);
	}
*/
/**
	this method is used for taking two number from other programmer,adds those number,print result
*/
	public static void add(int a,int b){
			int c= a+b;
		// System.out.println(c);
		System.out.println("The addition result is:" +c);
	}
	public static void main(String[] args){
		System.out.println("main start");
			//add();
			//add();
			//add();
			add(10,20);
			add(40,50);
			add(2345,4532);
		System.out.println("main end");
	}
}