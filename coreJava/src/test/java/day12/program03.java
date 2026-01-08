package day12;

/*
 * Print the sum of the first 20 natural numbers using a for-loop
 */
public class program03 {
	public static void main(String[] args) {
	int sum = 0;
		for(int i = 1; i<=20 ; i++) {
			 sum= i+sum;
		}
		System.out.println(sum);
		
		int n=100;
		int Nosum = n*(n+1)/2;
		System.out.println("sum is "+Nosum);
	}
	
	

}
