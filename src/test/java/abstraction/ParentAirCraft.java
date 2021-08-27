package abstraction;

public abstract class ParentAirCraft {

	public void engine() {				// non abstract method or non concrete method
		System.out.println("Follow Engine Guidelines");
	}

	public void safteyGuideLines() {	// non abstract method or non concrete method
		System.out.println("Follow Saftey Guidelines");
	}
	
	public abstract void bodyColour();		//Abstract method or Concrete Method

}
