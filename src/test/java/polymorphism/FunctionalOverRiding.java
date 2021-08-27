package polymorphism;

public class FunctionalOverRiding {
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, String b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalOverRiding FunctionalOverRiding = new FunctionalOverRiding();
		FunctionalOverRiding.getData(425);
		FunctionalOverRiding.getData("Mahesh");
		FunctionalOverRiding.getData(425, "Mahesh");
	}

}
