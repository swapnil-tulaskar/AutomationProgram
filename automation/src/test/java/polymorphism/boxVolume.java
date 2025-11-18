package polymorphism;

public class boxVolume {

	public static void main(String[] args) {
		
		
		
		
		box b1 = new box();
		System.out.println(b1.volume());
		
		box b2 = new box(10.5,12.5,14.5);
		System.out.println(b2.volume());
		
		box b3 = new box(10.2);
		System.out.println(b3.volume());

	}

}
