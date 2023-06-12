package array;

public class TwoDimension1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimension1 na = new TwoDimension1();
		na.twoDimension1();

	}
	public void twoDimension1()
	{
	int array[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    
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


