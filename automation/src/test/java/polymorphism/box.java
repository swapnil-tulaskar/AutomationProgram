package polymorphism;

public class box {
	
	double height,width,depth;
	
	box(){
		
		height=width=depth=0;
		System.out.println("this is result of first constructor");
	}

	box(double h, double w, double d ){
		width = w;
		height = h;
		depth = d;
		System.out.println("this is result of second constructor");
	}
	
	box (double len ){
		
		height=width=depth=len;	
		System.out.println("this is result of third constructor");
	}
	
	
	double volume() {
		return (depth*height*width);
		
	}
	
}
