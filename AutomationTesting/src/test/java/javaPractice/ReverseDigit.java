package javaPractice;

public class ReverseDigit {

	public static void main(String[] args) {
		int num = 1234;
		
		int digit = 0;
		
		for(int temp = num;temp>0;temp/=10) {
			
			digit = temp % 10;
			System.out.print(digit);
		}
		
		
		
		

	}

}
