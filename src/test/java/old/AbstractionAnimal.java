package old;
import org.testng.annotations.Test;

public abstract class AbstractionAnimal {			 // Abstract class using abstract keyword
	public abstract void animalSound();				 // Abstract method without body

	public void sleep() 							// Normal method
	{
		System.out.println("zzz");
	}
}

class pig extends AbstractionAnimal {
	public void animalSound() {
		System.out.println("The ping says: wee wee");
	}
}


@Test
class mian {
	public void pigSound()

	{
		pig p = new pig();
		p.animalSound();
		p.sleep();
	}
}