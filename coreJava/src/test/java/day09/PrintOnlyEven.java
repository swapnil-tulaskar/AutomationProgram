package day09;
//Print Only Even Numbers Except 100
public class PrintOnlyEven {

	public static void main(String[] args) {
		int [] arr = {10, 25, 50, 100, 130, 77, 150};
		
		for(int i:arr)
		{
			if(i%2!=0)
				continue;
			if(i==100)
				continue;
			System.out.println(i);
		}
	}

}
