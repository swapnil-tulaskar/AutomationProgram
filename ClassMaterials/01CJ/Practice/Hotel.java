class Hotel{
	public static void main(String[] args) 
	{
		Guest g1	= new Guest();
		Guest g2	= new Guest();	
		
		g1.guestName= "jone";
		g1.address	= "Ameerpet";
		g1.food		= "veg";
		g1.occu		= "student";
		g1.bloodGp	= "A+";
		g1.mobNum	=9023493939L;
		g1.adharNum	=234523456789L;
		
		g2.guestName= "vikas";
		g2.address	= "Banglore";
		g2.food		= "Non-veg";
		g2.occu		= "Business Advisor";
		g2.bloodGp	= "O+";
		g2.mobNum	=7655432882L;
		g2.adharNum	=548795642865L;
		
		System.out.println("Guest 1");
		System.out.println("Guest Name\t:"+g1.guestName);
		System.out.println("Address\t\t:"+g1.address);
		System.out.println("Food Choice\t:"+g1.food);
		System.out.println("Occupation\t:"+g1.occu);
		System.out.println("Blood Group\t:"+g1.bloodGp);
		System.out.println("Mobile No.\t:"+g1.mobNum);
		System.out.println("Adhar Num.\t:"+g1.adharNum);
		System.out.println();
		
		System.out.println("Guest 2");
		System.out.println("Guest Name\t:"+g2.guestName);
		System.out.println("Address\t\t:"+g2.address);
		System.out.println("Food Choice\t:"+g2.food);
		System.out.println("Occupation\t:"+g2.occu);
		System.out.println("Blood Group\t:"+g2.bloodGp);
		System.out.println("Mobile No.\t:"+g2.mobNum);
		System.out.println("Adhar Num.\t:"+g2.adharNum);
		
		
	}
}
