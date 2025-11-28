/**
	 *Q3. Student Marks Filter
	 *[85, 92, -1, 0, 76, 55, -1, 91]
	 *-1 = absent
	 *0 = cheating
	 *Print only valid marks.
	 */
package day09;
public class Program2 {
	public static void main(String[] args) {
		int arr [] = {85, 92, -1, 0, 76, 55, -1, 91};
		
		for(int i :arr) {
			if(i<=0)
				continue;
			System.out.println(i);
		}
	}

}
