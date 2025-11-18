class adder {
	
	int x,y;
	
	/*
	void m1(){
		
		System.out.println(x+y);
	}
	*/
	void m1(int a, double b){
		System.out.println(a+b);
	}
	
}


class adderMain{
	
	public static void main(String [] args){
		
		adder ad = new adder();
		
		ad.m1(10,20);
		
	}
}