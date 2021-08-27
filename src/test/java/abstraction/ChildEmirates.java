package abstraction;

public class ChildEmirates	extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates ce = new ChildEmirates();
		ce.engine();
		ce.safteyGuideLines();
		ce.bodyColour();
		
	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Emirates colour is Red");
	}

}
