//Room.java
public class Room {

	private double l;
	private double b;

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



	public void findArea() {
		System.out.println(
		  "area: "+ (l * b));
	}

	public void findPerimeter() {
		System.out.println(
		 "perimeter: "+ (2 * (l + b)) );
	}



}