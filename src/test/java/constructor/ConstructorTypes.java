package constructor;

public class ConstructorTypes {

	// Constructor with 2 parameters
	public ConstructorTypes(int a, int b) {
		System.out.println("I am in Parametarizesd Constructor int");
		int c = a + b;
		System.out.println(c);
	}

	// Constructor with 1 parameter
	public ConstructorTypes(String str) {
		System.out.println("I am in Parametarizesd Constructor String");
	}

	public void getFirstName() {
		System.out.println("Kalluri");
	}

	public void getLaststName() {
		System.out.println("Mahesh Babu");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ConstructorTypes ct = new ConstructorTypes();
		ConstructorTypes ct1 = new ConstructorTypes(4, 5);
		ConstructorTypes ct2 = new ConstructorTypes("Hello");
		ct1.getFirstName();
		ct2.getLaststName();
		

	}

}
