class BankAccount {

	private long accNum;
	private String accHName;
	private double balance;

	void deposit(double amt){
		System.out.println("\ndeposit() method is called");		
		balance = balance + amt;
		alert(amt, "credited to");
	}

	void withdraw(double amt){
		System.out.println("\nwithdraw() method is called");		
		balance = balance - amt;
		alert(amt, "debited from");
	}

	void currentBalance(){
		System.out.println(balance);
	}

	private void alert(double amt, String action){

		System.out.println("alert() method is called");		
		System.out.println(" "+amt + " is "+ action + " your account ");		
		System.out.println(" Available balanace is " + balance);		
	}
	
	void display(){
		System.out.println("  accNum\t: "  + accNum );
		System.out.println("  accHName\t: "  + accHName );
		System.out.println("  balance\t: " + balance );
	}

}

class Test05_PrivateNP_Project {
	public static void main(String[] args){
		
		BankAccount acc1 = new BankAccount();
		acc1.display();
		
		acc1.deposit(10000);
		acc1.withdraw(3000);
		
		System.out.print("\nacc1 balance: ");
		acc1.currentBalance();

	}
}