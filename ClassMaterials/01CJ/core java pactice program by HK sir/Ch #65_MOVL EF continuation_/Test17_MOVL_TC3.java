class Test17_MOVL_TC3 {
	public static void main(String[] args) {
				//DWC					//CGC			
		Example.m1(10);			//Example.m1(10);
		Example.m1('a');		//Example.m1(97);	
		Example.m1(50L);		//Example.m1(50.0F);

		long L = 50;	
		Example.m1(L);			//Example.m1((float)L);

		//Example.m1(50.34);		
	}
}

