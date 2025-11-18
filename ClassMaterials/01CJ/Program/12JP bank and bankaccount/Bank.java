class Bank 
{
	public static void main(String[] args) {
		
		BankAcc ba1 = new BankAcc();
		BankAcc ba2 = new BankAcc();
		
		ba1.bankName= "HDFC";
		ba1.branch	= "Amirpet";
		ba1.ifsc	= "HD123AM";
		ba1.accNum	= 12345678901L;
		ba1.accHName= "HK";
		ba1.balance	= 100000;
		
		ba2.bankName= "HDFC";
		ba2.branch	= "Amirpet";
		ba2.ifsc	= "HD123AM";
		ba2.accNum	= 12345678901L;
		ba2.accHName= "bk";
		ba2.balance	= 19090909;
		
		System.out.println("Account Holder 1 Details");
		
		System.out.println("BankName\t:" +ba1.bankName);
		System.out.println("Branch\t\t:" + ba1.branch);
		System.out.println("IFSC\t\t:" + ba1.ifsc);
		System.out.println("accNum\t\t:"+ ba1.accNum);
		System.out.println("AccHolderName\t:"+ba1.accHName);
		System.out.println("Balance\t\t:" + ba1.balance);
		
		
		
		
		
		
	}
}
