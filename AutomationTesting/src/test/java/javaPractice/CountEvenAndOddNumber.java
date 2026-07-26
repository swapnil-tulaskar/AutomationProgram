package javaPractice;

public class CountEvenAndOddNumber {

	public static void main(String[] args) {
		
		int num = 12345;
		
		int odd = 0;
		int even = 0;
		
		for(int temp = num ; temp>0; temp/=10) {
			
			int digit = temp%10;
			
			if(digit%2==0){
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("input number all even is="+even+" and all odd is="+odd);
		
		

	}

}
