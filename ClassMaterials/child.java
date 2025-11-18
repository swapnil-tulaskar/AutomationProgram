class Animal{
	
	void sounds(){
	System.out.println("animal has sound");
	}
}


class lion extends Animal{
	void sounds(){
		System.out.println("Rour");
	}
}

class cat extends Animal{
	 void sounds(){
		System.out.println("Meo");
	 }
}

class dog extends Animal{
	
	void sounds(){
		System.out.println("bhoow");
	}
}


class test {
	
	public static void main (String[] args){
		
		Animal[] animal ={new lion() , new cat(), new dog()};
		
		for (int i=0;i<animal.length ; i++){
			animal[i].sounds();
		}	
	
		for (int m=0;m<animal.length ; m++){
		animal[m].sounds();
		}
}
}
