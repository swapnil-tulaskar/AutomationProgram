//Room.java
public class Room {

	private double l;
	private double b;
	
	public Room(double l, double b){
		this.l = l;
		this.b = b;
	}

	public void setL(double l){
		this.l = l;	
	}
	
	public double getL(){
		return l;
	}

	public void setB(double b){
		this.b = b;
	}
	

	public double getB(){
		return b;
	}

	public void findArea(){
		System.out.println(
		  "Total Area: "+ (l * b));
	}

	public void findPerimeter(){
		System.out.println(
		  "Perimeter: "+ (2 * (l + b)));
	}

	public void display(){
		System.out.println("  l: "+ l);
		System.out.println("  b: "+ b);
	}
}
