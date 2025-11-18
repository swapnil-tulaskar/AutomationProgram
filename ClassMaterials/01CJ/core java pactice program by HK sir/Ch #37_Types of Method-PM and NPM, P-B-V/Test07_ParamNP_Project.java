class Employee{
	int eno;
	String ename;
	double sal;
	String dept;
}

class Company{
	void display(Employee emp){
		System.out.println(
			emp.eno + "  " + emp.ename + "  " + emp.sal + "  " + emp.dept);
	}

	void annSal(Employee emp){
		System.out.println(
			"Annual Sal: " + 
			(emp.sal * 12));
	}

	void incrSal(Employee emp, int perc) {
		emp.sal = 
			emp.sal + (emp.sal * perc/100);
	}
}



class Test07_ParamNP_Project {
	public static void main(String[] args) {
		Company cmp = new Company();

		Employee e1 = new Employee();
		e1.eno = 101;
		e1.ename = "HK";
		e1.sal = 10000;
		e1.dept = "CJ";

		cmp.display(e1);

		cmp.annSal(e1);

		cmp.incrSal(e1, 20);

		System.out.println(
			"Current Sal : " + e1.sal);
	}
}