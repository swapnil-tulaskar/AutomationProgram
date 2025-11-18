class Addition{
	void add(){ System.out.println("add no-param "); }
	
	static void add(int i1){  System.out.println("add int 1-param ");  }
	int add(double d1){ System.out.println("add double 1-param "); return 5;}

	void add(int i1, int i2){ System.out.println("add int 2-param "); }
	void add(int i1, int i2, int i3){ System.out.println("add int 3-param "); }

	void add(int i1, float f1){ System.out.println("add int, float param "); }
	void add(float f1, int i1){  System.out.println("add float, int param ");  }
}
class Test17_MOVL{
	public static void main(String[] args){
		Addition a = new Addition();
		a.add();
		a.add(5);/*
		a.add(5, 6);
		a.add(5, 6, 7);
		a.add(5, 6f);

		Subtraction s = new Subtraction();
		s.subInts(5, 6);
		s.subDoubles(5, 6f);
/**/
	}
}

class Subtraction {

	void subInts(int i1, int t2){ }
	void subDoubles(double i1, double t2){ }

};




