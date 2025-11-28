package day09;

public class Program1 {
	public static void main(String[] args) {
	
		int[] arr = {54,5,5,40,55,58,74,7,8,9,5,20};
		for(int i :arr) {
			if(i==7)
				continue;
			System.out.println(i+"");	
		}
	}
}
