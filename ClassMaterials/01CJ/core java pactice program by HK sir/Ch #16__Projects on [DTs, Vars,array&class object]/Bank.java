class Bank {
	public static void main(String[] args) {
		//creating two instances from the class BA 
		BankAccount acc1 = new BankAccount(); //for HK
		BankAccount acc2 = new BankAccount(); //for BK

		//initializing acc1 instance with the object HK values
		acc1.bankName 	= "HDFC";
		acc1.branchName = "Ameerpet";
		acc1.ifsc		= "HD123AM";
		acc1.accNum		= 123456789012L;
		acc1.accHName	= "HK";
		acc1.balance	= 99999999;

		//initializing acc2 instance with the object BK values
		acc2.bankName 	= "HDFC";
		acc2.branchName = "Ameerpet";
		acc2.ifsc		= "HD123AM";
		acc2.accNum		= 123456789013L;
		acc2.accHName	= "BK";
		acc2.balance	= 99989999;
		
		//displaying acc1 object values
		System.out.println("acc1 object values");
		System.out.println( "  acc1.bankName\t\t: " + acc1.bankName);
		System.out.println( "  acc1.branchName\t: " + acc1.branchName);
		System.out.println( "  acc1.ifsc\t\t: "		+ acc1.ifsc);
		System.out.println( "  acc1.accNum\t\t: "	+ acc1.accNum);
		System.out.println( "  acc1.accHName\t\t: "	+ acc1.accHName);
		System.out.println( "  acc1.balance\t\t: "	+ acc1.balance);
		
		//displaying acc2 object values
		System.out.println("\nacc2 object values");
		System.out.println( "  acc2.bankName\t\t: " + acc2.bankName);
		System.out.println( "  acc2.branchName\t: " + acc2.branchName);
		System.out.println( "  acc2.ifsc\t\t: "		+ acc2.ifsc);
		System.out.println( "  acc2.accNum\t\t: "	+ acc2.accNum);
		System.out.println( "  acc2.accHName\t\t: "	+ acc2.accHName);
		System.out.println( "  acc2.balance\t\t: "	+ acc2.balance);
	}
}