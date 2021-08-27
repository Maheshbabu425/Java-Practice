package polymorphism;

public class OverRideChild extends OverRideBase {

	public void engine() {
		System.out.println("Engine Code");
	}

	public void colour()
	{
		System.out.println(colour);
	}
	
	
	public void audioSystem()
	{
		System.out.println("Audio System code from child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverRideChild c = new OverRideChild();
		c.engine();
		c.gear();
		c.brakes();
		c.audioSystem();
		c.colour();
	}

}
