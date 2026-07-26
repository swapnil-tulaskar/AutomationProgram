package javaPractice;

public class PalindromeDigit {

	public static void main(String[] args) {
		
		int num = 1234;
	
		int rev = 0;
		for(int temp = num ;temp>0;temp /= 10) {
			int digit = temp % 10 ;
			
			rev = rev*10 + digit;
			
			
		}
	System.out.println(rev);
		if(num == rev
				) {
			System.out.println("num is palindrome");
		}
		
		else {
			System.out.println("num is not palindrome");
		}
		
		
		

	}

}
