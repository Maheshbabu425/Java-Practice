package ihheritance;

public class ChildClass extends ParentClass {

	public void engine() {
		System.out.println("Engine Code");
	}

	public void colour()
	{
		System.out.println(colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c = new ChildClass();
		c.engine();
		c.gear();
		c.brakes();
		c.audioSystem();
		c.colour();
	}

}
