package day08;

public class Program03 {

	public static void main(String[] args) {
		int n; 
		System.out.println(n=4); //4
		System.out.println(n==4); //true
		System.out.println();
		
		System.out.println(n>3); // true
		System.out.println(n<4); // false 
		System.out.println();
		
		System.out.println(n=0);  //0
		System.out.println(n==0); // true
		System.out.println();
		
		System.out.println(n>0); // false 
		
		System.out.println();
		
		
		System.out.println((n==0 && true)); // true
		System.out.println((n==0 || true));   //true
		
		System.out.println((!(n==2))); //true      n==2 is false then !(false) become true and print true
	}
}
