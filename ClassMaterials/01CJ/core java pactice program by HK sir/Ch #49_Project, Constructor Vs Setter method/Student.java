public class Student {

	private int			sno;
	private String		sname;
	private String		course;
	private double		fee;

	public Student(){
		System.out.println("Student object is initialized by using NPC");
	}

	public Student(int sno, String sname, String course, double fee){
		this.sno			= sno;
		this.sname		= sname;
		this.course		= course;
		this.fee		= fee;
		System.out.println("Student object is initialized by using PC");
	}

	public void setSno(int sno){	
		this.sno = sno;
	}

	public int getSno(){
		return sno;
	}

	public void setSname(String sname){
		this.sname = sname;
	}

	public String getSname(){
		return sname;
	}

	public void setCourse(String course){
		this.course = course;
	}

	public String getCourse(){
		return course;
	}

	public void setFee(double fee){
		this.fee = fee;
	}

	public double getFee(){
		return fee;
	}

	void display(){
		System.out.println("  sno\t\t: "	+ sno);
		System.out.println("  sname\t\t: "	+ sname);
		System.out.println("  course\t: "	+ course);
		System.out.println("  fee\t\t: "	+ fee);
	}
}