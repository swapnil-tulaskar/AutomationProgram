class A {
	void m1(){}
//	int m1(){ return 50; }
	int m1(String s){ return 50;}
//	static void m1(String s){   }
	static void m1(double s){   }
	private void m1(long l){   }

	void m1(int i1){ }
//	void m1(int i2){ }
	String m1(float f1){ return "";}

	void m1(int i1, int i2){ }
	void m1(int i1, int i2, int i3){ }

	void m1(int i1, float f1){}
	void m1(float f1, int i1){}
	/**/
}