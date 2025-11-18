import java.util.Scanner;

class methods {
	// addition
	public double add(double a, double b){return a+b;}
	// substraction
	public double sub(double a , double b){return a-b;}
	// multiplication
	public double mul(double a, double b) {return a*b;}	
	// dividation 
	public double div(double a, double b){
		
		if (b!= 0)
		{
			return a/b;
		}
		else {
			System.out.println("can not divided by zero");
			return 0;
		}
		
	}
}


class calculator{
	public static void main (String []args){
	   Scanner scn = new Scanner(System.in);
		methods m = new methods();
		
		
		
		int choose;
		do{
			 System.out.println();
		 System.out.println("choose methods:");
		 System.out.println("1.Subtraction");
		 System.out.println("2.Addition");
		 System.out.println("3.Multiplication");
		 System.out.println("4.Divide");
		 System.out.println("5.Exit");
		 System.out.println();
		 choose = scn.nextInt(); 
		 
		 if (choose >=1 && choose <=4 )
		 {
		 
			System.out.println("Enter number 1:"); 
		double numb1 = scn.nextDouble();
		System.out.println("Enter number 2:");
		double numb2 = scn.nextDouble();
		
	  
		 
		 
		 
		 switch (choose)
		 {
			case 1:
					System.out.println("Result of "+numb1 +"-" + numb2 +":"+ m.sub(numb1,numb2));
					System.out.println();
					break;
			case 2:
					System.out.println("Result of "+numb1 +"+" +  numb2 +":"+ m.add(numb1, numb2)); 
					break;
			case 3:
					System.out.println("Result of "+numb1+"*" +  numb2 +":"+ m.mul(numb1,numb2));
					break;
			case 4:
					System.out.println("Result of "+numb1+"/" +numb2+":"+  m.div(numb1,numb2));
					break;
			default :
					System.out.println("Enter valid number to choose Methods");
		 } 
		 }
		}while(choose!=5);
		scn.close();
	 
	}
}