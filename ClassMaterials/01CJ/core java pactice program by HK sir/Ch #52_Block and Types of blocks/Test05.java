class Example {
	static {	//Static Initializer block
					//1. it is used for initializing SVs and
					//2. also used for executing some logic 
					//	'only once' at the time of class loading into JVM 
	}

	{			//Instance Initializer block
					//1. it used for initializing NSVs and
					//2. also used for executing some logic 
					//	 'only once' at the time of object creation 
					//   common to all constructors of this class
	}

	
	void m1() {
		{		//local block
					//it is used for decreasing the scope of a LV
		}			//and meant for destorying its memory immediatly
	}				//after usage
}