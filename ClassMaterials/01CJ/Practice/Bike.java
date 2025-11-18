import java.util.Scanner;

public class Bike {
	
	private static String brand;
	private static int    count;

    private String engNum;
    private String color;
    private String ownerName;
    private String bikeNumber;

	static {
		//brand = "Bajaj"; //fixed value, wrong design

		Scanner scn = new Scanner(System.in);

		System.out.print("Enter brand: ");
		brand = scn.nextLine();	//reading from kb is also wrong design
								//we must read from a file or from DB
		System.out.println("Bike static field is initialized");
	
	}

	{
		count++;  //increasing count common to all Bikes
	}

	public Bike(String engNum, String color) {
		this.engNum = engNum;
		this.color  = color;
	}

	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setBikeNum(String bikeNumber){
		this.bikeNumber = bikeNumber;
	}

	public String getBikeNumber() {
		return bikeNumber;
	}
	 
	public static String getBrand(){
		return brand;
	}

	public static int getCount(){
		return count;
	}

	public String getEngNum() {
		return engNum;
	}

	public String getColor() {
		return color;
	}

	//blogic operations
	public void start() {
		System.out.println(ownerName + " started "+ brand +" Bike");
	}

	public void move() {
		System.out.println(ownerName + " is moving on "+ brand +" Bike");
	}

	public void stop(){
		System.out.println(ownerName + " stopped "+ brand +" Bike");
	}

	//display method
	@Override
	public String toString() {
		return 
			"brand\t: "		+ brand + 
			"engNum\t: "	+ engNum+ 
			"color\t: "		+ color+ 
			"ownerName\t: "	+ ownerName+ 
			"bikeNumber\t: "+ bikeNumber; 
	}

}