package day08;

public class Program04 {

	enum colortype{red,orange,yellow,green,blue,violet}
	public static void main(String[] args) {
		
		colortype shirt, pant;
		shirt = colortype.orange;
		pant = colortype.blue;
		
		System.out.println(" "+shirt+" "+pant);
		
		shirt = colortype.green;
		
		System.out.println(shirt+" "+pant);
		
		pant = colortype.yellow;
		
		System.out.println();
		
		System.out.println(shirt+" "+pant);
	}
}
