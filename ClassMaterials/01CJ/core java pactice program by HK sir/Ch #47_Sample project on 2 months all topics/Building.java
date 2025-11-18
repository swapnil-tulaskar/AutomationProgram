//Building.java
class  Building {
	public static void main(String[] args) {

		Room r1 = new Room();
		System.out.print("r1 values: ");
		System.out.println( r1 );  //println() methods internalls calls 
		System.out.println( );	// r1.toString() is called, then its prints 
								//toString() method returned information
		r1.setL(100);
		r1.setB(30);

		System.out.print("r1 values: ");
		System.out.println( r1 ); //r1.toString()
		System.out.println();

		r1.findArea();
		r1.findPerimeter();

		System.out.println();

	}
}