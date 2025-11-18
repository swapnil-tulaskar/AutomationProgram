//Calculator.java
class Calculator {
	public static void main(String[] args) {
		try{
				int res=Addition.add(10,20);
				System.out.println("Result:" +res);	
		}
		catch(IllegalArgumentException e){
				System.out.println("Error:");	
				
		}
		
	}
	
}

