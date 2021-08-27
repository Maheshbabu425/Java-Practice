package constructor;

public class ConstructorDemo {
	
	// Constructor don't have any return type
	// Constructor name same as class name
	
	public ConstructorDemo()				// Constructor	
	{
		System.out.println("I am in Constructor");
		System.out.println("I am in Constructor Lecture1");
	}
	
	public void getName()		// Normal Method
	
	{
		System.out.println("Mahesh Babu");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo cd = new ConstructorDemo();
		cd.getName();
		
	}

}
