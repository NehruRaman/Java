package array;

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int[5][5];
		int a=0;
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				array[row][col]=a;
				a++;
			}
			
		}
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				System.out.print(array[row][col]+" ");

			
		}
		
		System.out.println();
	}
	}
}
