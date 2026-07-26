package javaPractice;

public class CounDigitGivenNumber {

	public static void main(String[] args) {
		int num = 12345;
		int count = 0;
		for(int temp = num ; temp>0;temp /=10) {
			count++;
		}
		System.out.println(count);
	}
};


