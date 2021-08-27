package java;

public class PracticePyramidLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1 2 3 4 
		 * 5 6 7 
		 * 8 9 
		 * 10
		 */

		int k = 1;
		for (int i = 0; i < 4; i++) {
			// System.out.println("Outer Loop Started");
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

		/*
		 * 1 
		 * 2 3 
		 * 4 5 6 
		 * 7 8 9 10
		 */

		int k1 = 1;
		for (int i1 = 1; i1 < 5; i1++) {
			for (int j1 = 1; j1 <= i1; j1++) {
				System.out.print(k1);
				System.out.print("\t");
				k1++;
			}
			System.out.println("");
		}

		/*
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4
		 */

		for (int i2 = 0; i2 < 4; i2++) {
			for (int j2 = 1; j2 <= 1 + i2; j2++) {
				System.out.print(j2);
				System.out.print("\t");

			}
			System.out.println("");
		}

		/*
		 * 3 
		 * 6 9 
		 * 12 15 18
		 * 
		 */
		int k3 = 1;
		for (int i3 = 1; i3 <4; i3++) {
			for (int j3 = 1; j3 == i3; j3=j3*3) {
				System.out.print(k3);
				System.out.print("\t");
				k3++;
			}
			System.out.println("");
		}
	}

}
