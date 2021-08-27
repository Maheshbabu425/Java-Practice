package keyWords;

public class ThisKeyWord {

	int a = 2;
	
	
	public void getData()
	{
	int a =3;
	System.out.println(a);		// To print the value of a from the method
	System.out.println(this.a);	// TO print the value of a from class
	int b = a+this.a;
	System.out.println(b);	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyWord t = new ThisKeyWord();
		t.getData();

	}

}
