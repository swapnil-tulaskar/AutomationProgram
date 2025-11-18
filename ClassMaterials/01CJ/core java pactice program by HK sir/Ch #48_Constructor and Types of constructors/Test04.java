/*
 - Below program shows initializing an object with other programmer given values
   via parameterized constructor
*/
class Example {
	private int x;
	private int y;

	Example(int x, int y) {
		System.out.println("param constructor");
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		System.out.println("main ");

		Example e1 = new Example(10, 20);

		Example e2 = new Example(30, 40);

		System.out.println(e1.x + " " + e1.y);
		System.out.println(e2.x + " " + e2.y);
	}
}