class car  {
	String driverName;
	String color;
	String model;
	
	
	void drive(){
		System.out.println(driverName+" is driving a "+model+ " which color is "+color);
	}
}


class test{
	
	public static void main (String[] args){
		
		car mycar = new car();
		
		mycar.driverName = "Swapnil";
	
		mycar.color= "black";
		mycar.model= "fortuner";
		mycar.drive();
		mycar.driverName = "Madhuri";
		mycar.drive();
		
		
	}
	
}