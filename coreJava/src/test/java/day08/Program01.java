package day08;

public class Program01 {

	public static void main(String[] args) {
		{
			int n = 4 , k = 2;
			System.out.println(++n);   //pre-increment ++n is become 5 
			System.out.println(n); 		//  5 
			
			System.out.println();
			
			System.out.println(n++); // post-increment n++ is print 5 then after next statement become 6 
			System.out.println(n);		// 6 
			
			System.out.println();
			
			System.out.println(-n);	 // -6
			System.out.println(n);   // 6
			
			System.out.println();
			
			System.out.println(--n);  // 5
			System.out.println(n);   // 5
			
			System.out.println();
			
			System.out.println(n--); //5
			System.out.println(n);   //4
			
			System.out.println();
			
			System.out.println(n+k); // 6
			System.out.println(n);   //4
			System.out.println(k);	//2
			
			System.out.println();
		
			System.out.println(""+ n + " "+ k ); // 4 2 
			System.out.println( n ); //4
			System.out.println();
			
			System.out.println(" "+n); //  4
			System.out.println(" n");   // n
			System.out.println();
			
			System.out.println("/n"); // /n
			System.out.println(" n * n = ");  // n * n = 
			System.out.println();
			
			System.out.println(n*n); // 16
			System.out.println('n'); //n
			
		}

	}

}
