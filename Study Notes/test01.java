

//=========================================================
class parent {
	void run(){
		System.out.println("parent is running");
	}
}
//=======================================================
class child extends parent {	
	void run(){
		System.out.println("child is running");
		
	}
	
	
	void eat(){
		System.out.println("child is eating");
		this.run();
		super.run();

	}
	
}

//===========================================================
class test01{
	public static void main(String[] args){
		child p = new child();
		
		p.run();
		p.eat();
	}	
}
//==========================================================