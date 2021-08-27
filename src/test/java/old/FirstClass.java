package old;

public class FirstClass {

	static int a = 4;

	public void getData() {						// Normal method without return
		System.out.println("FirstClass");
	}

	public int getIntData() {					// Method with integer return
		System.out.println("FirstClass");
		return 425;
	}

	public String getStringData() {				// Method with String return
		System.out.println("FirstClass");
		return "Mahesh";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println("Mahesh");
		System.out.print("My name is:");
		System.out.print("Maheshbabu");
		FirstClass fc = new FirstClass();	// Creation of object for class
		fc.getData();

	}

}
