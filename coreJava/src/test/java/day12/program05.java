package day12;

/*
 * Print all numbers divisible by 5 and 3 between 1 and 100.
 */
public class program05 {
	public static void main(String[] args) {
		
		for(int i =1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
			System.out.println("divisible by 5 and 3:"+i);
			}
			
		}
	}

}
