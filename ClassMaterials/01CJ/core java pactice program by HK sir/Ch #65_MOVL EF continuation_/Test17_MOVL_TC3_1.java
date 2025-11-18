class Test17_MOVL_TC3_1{

	static void m1(byte b){
		System.out.println("byte-param");
	}

	public static void main(String[] args) {
		//m1(50);					

		m1( (byte)50 ); 
		
		byte b = 50;
		m1(b); 
		 
	}
}