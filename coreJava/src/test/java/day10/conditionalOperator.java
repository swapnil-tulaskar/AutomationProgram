package day10;

public class conditionalOperator {
	
	
	public static void main(String[] args) {
		
		int a,b;
		
		a=20; b=10;
		
		System.out.println(a>b); // true
		System.out.println(a<b); //false
		System.out.println(a>=b); // true 
		System.out.println();
		System.out.println(a<=b); // false
		
		b=20; 
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		 boolean res = a>b; // for the conditional operator we store the value into the boolean 
		 System.out.println(res);
		 
		 System.out.println();
		 // &&(and)  and ||(or) or !(not)
		 
		 boolean x = true;
		 boolean y = false;
		 
		 System.out.println(x&&y); //false
		 System.out.println(x||y);//true
		 System.out.println(!x); // false
		 System.out.println(!y); // true
		 
		 boolean b1 = 10>20;
		 System.out.println(b1); //false
		 boolean b2 = 20>10;
		 System.out.println(b2); //true;
		 System.out.println();
		 System.out.println(b1&&b2);// false
		 System.out.println();
		 System.out.println(b1||b2); // true
		 System.out.println();
		 System.out.println((10<20)&&(20>10)); //true
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
