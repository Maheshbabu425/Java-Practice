package arrays;

public class MinNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = { { 2, 4, 6 }, { 1, 3, 7 }, { 9, 5, 1 } };
		int min = abc[0][0];

		for (int i = 0; i < abc.length; i++) {
			for (int j = 0; j < abc.length; j++) {

				if (abc[i][j] < min) {
					min = abc[i][j];
				}
			}

		}
		System.out.println(min);

		int bc[][] = { { 8, 6, 4 }, { 7, 8, 3 }, { 5, 9, 1 } };
		int max = bc[0][0];
		for (int k = 0; k < bc.length; k++) {
			for (int l = 0; l < bc.length; l++) {
				if (bc[k][l] > max) {
					max= bc[k][l];
				}

			}
		}
		System.out.println(max);
	}

}
