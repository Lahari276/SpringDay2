package aop.model;
public class Circle {
	String name;

	//public Circle() {System.out.println("in circle constructor");}
	
	public String getName() {
		//throw new RuntimeException();

		return name;
		
	}

	public String setName(String name) {
		System.out.println("setting name for the circle");
		return this.name = name;

		
	}
	
	public int getDia() {
		//throw new RuntimeException();
		return 5;
	}
	
}