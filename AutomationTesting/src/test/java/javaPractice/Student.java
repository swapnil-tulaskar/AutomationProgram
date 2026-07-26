package javaPractice;

public class Student {
	  private String name;
	  private int age;
	    
	    Student(String name, int age){
	    	this.setName(name);
	    	this.setAge(age);
	    }

	    void display() {
	        System.out.println(getName() + " " + getAge());
	    }

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
