//Company.java
class Company {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		System.out.println("e1 object is created");

		System.out.println("\ne1 object values");
		e1.display();
		
		//initializing object via setter methods
		e1.setEno(101);
		e1.setEname("HK");
		e1.setSal(10000);  
		e1.setDept("CJ");

		System.out.println("\ne1 object values");
		e1.display();
	
		double oldSal = e1.getSal();
		double newSal = oldSal + oldSal *20/100;
		//e1.setSal( newSal );
			//or
		e1.setSal( e1.getSal() + e1.getSal() * 20/100 );

		System.out.println("\ne1 object's new sal: "+ e1.getSal());
/*
*/
	}
}
