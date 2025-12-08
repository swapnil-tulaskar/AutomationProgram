package day11;

public class FindLargestNumber {

	public static void main(String[] args) {
		int a=10,b=10,c=10;
		
		if(a>b && a>c) {
			System.out.println("a is largest number");
		}
		
		else if(b>a && b>c){
			System.out.println("b is largest number");
		}
		else if(c>a && c>b) {
			System.out.println("c is largest number");
		}
		else {
			System.out.println("Dont enter same number");
		}
	}

}
