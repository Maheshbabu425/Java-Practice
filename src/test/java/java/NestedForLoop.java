package java;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("Outer loop started" + i + "times");
			for (int j = 0; j < 3; j++) {
				System.out.println("Inner loop started" + j + "times");
			}
			System.out.println("Outer loop finished");
		}

	}

}
