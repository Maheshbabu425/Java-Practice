package keyWords;

public class SuperKeywordChild extends SuperKeywordParent{
	
	
	
	public SuperKeywordChild()	// Child Constructor
	{
		super();	// To call parent class constructor in child class we need to mention first
	System.out.println("Babu from child class construcotr");
	}
	
	
	
	String name = "Mahesh Babu Kalluri from Child Class";	// child variable same string name
	
	public void getName()
	{
		System.out.println(name);		// To get the name of the child class
		System.out.println(super.name);	// To get the name from parent class
	}
	
	
	public void getMahesh()	// Parent method same string name
	{
		System.out.println("Kalluri from child class method");	// It will return child class method
		super.getMahesh();	// It will return Parent class method
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordChild sc = new SuperKeywordChild();
		sc.getName();
		sc.getMahesh(); 			// Method with same name
	}

}
