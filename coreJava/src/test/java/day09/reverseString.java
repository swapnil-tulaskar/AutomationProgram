package day09;

public class reverseString {

	public static void main(String[] args) {
		String name = "Paper is blank";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println();
		String reverse = new StringBuilder(name).reverse().toString();
		System.out.println(reverse);
	}
	
	
}
