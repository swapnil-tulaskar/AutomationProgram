//Student.java
class Student {
	
	private static String institute;

	private int sno;
	private String sname;
	private String course;
	private double fee;
	private Address address;

	static void setInstitute(String institute){
         Student.institute = institute;
	}

	static String getInstitute(){
		return institute;
	}

	void setSno(int sno){
		this.sno = sno;
	}

	int getSno(){
		return sno;
	}

	void setSname(String sname){
         this.sname = sname;
	}

	String getSname(){
		return sname;
	}

	void setCourse(String course){
         this.course = course;
	}

	String getCourse(){
		return course;
	}

	void setFee(double fee){
		this.fee = fee;
	}

	double getFee(){
		return fee;
	}

	void setAddress(Address address){
		this.address = address;
	}

	Address getAddress(){
		return address;
	}
	
	@Override
	public String toString(){
		return		"  insti\t\t: "	+ institute	+ "\n" + 
					"  sno\t\t: "	+ sno		+ "\n" + 
					"  sname\t\t: "	+ sname		+ "\n" +
					"  course\t: "	+ course	+ "\n" +
					"  fee\t\t: "	+ fee		+ "\n" +
					"\n  address details"		+ "\n" +
					(address != null 
						?
							"      strnum\t: "		+ address.getStrnum()+ "\n" +
							"      city\t: "		+ address.getCity() 
						: 
							"    Address is not yet set"); 
	}
}