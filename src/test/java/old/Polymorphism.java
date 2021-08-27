package old;

import org.testng.annotations.Test;

public class Polymorphism {
	class Animal {
		public void animalSound() {
			System.out.println("The animal makes a sound");
		}
	}

	class Pig extends Animal {
		public void animalSound() {
			System.out.println("The pig says: wee wee");
		}
	}

	class Dog extends Animal {
		public void animalSound() {
			System.out.println("The dog says: bow wow");
		}
	}
@Test
	public void mainMethod() {
		Animal myAnimal = new Animal();  // Create a Animal object
		    Animal myPig = new Pig();  // Create a Pig object
		    Animal myDog = new Dog();  // Create a Dog object
		    myAnimal.animalSound();
		    myPig.animalSound();
		    myDog.animalSound();
		    
		  }
}
