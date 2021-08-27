package arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a;
		// a = 5;

		int a[] = new int[5];	// Declaring an array and allocation memory for the vales for the array
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		
		int b[] = {1,3,5,7,9};	
		for(int j=0; j<b.length; j++)
		{
			System.out.println(b[j]);
		}
	}

}
