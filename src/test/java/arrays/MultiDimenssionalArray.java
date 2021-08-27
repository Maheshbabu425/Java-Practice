package arrays;

public class MultiDimenssionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[1][0]=1;
		a[1][1]=3;
		a[1][2]=5;
		
		System.out.println(a[1][1]);
		
		// Printing the multi dimensional array values
		int b[][]= {{1,3,5},{2,4,6}};
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println(b[i][j]);
			}
			}
		

	}

}
