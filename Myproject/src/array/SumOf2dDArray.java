package array;

public class SumOf2dDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOf2dDArray na=new SumOf2dDArray();
	
		na.sumOf2Elements();
		
		

}
	public void sumOf2Elements()
	{
		int array1[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25,}};
	    int array2[][] ={{2,3,6,4,5},{6,9,8,11,12},{12,15,13,10,16},{14,17,8,9,12},{6,8,13,14,21,}};
	    int array3[][] = new int [array1.length][array1[0].length];	
	    
	    for(int row=0;row < array1.length;row++)
			{
				for(int col=0;col<array2[row].length;col++)
				{
					array3[row][col] = array1[row][col] +array2[row][col];
				}
				//System.out.println("Sum 0f "+row+" row: "+sum);
			}
	    System.out.println("\nSum of Elements in two array\n");
	    for(int row=0;row < array3.length;row++)
		{
			for(int col=0;col<array3[row].length;col++)
			{
				System.out.print(array3[row][col]+" ");
			}
			System.out.println();
		}
	
	    
for(int row=0;row < array1.length;row++)
	{
		for(int col=0;col<array2[row].length;col++)
		{
			array3[row][col] = array1[row][col] - array2[row][col];
		}
		//System.out.println("Sum 0f "+row+" row: "+sum);
	}
System.out.println("\nDifference of Elements in two array\n");
for(int row=0;row < array3.length;row++)
{
	for(int col=0;col<array3[row].length;col++)
	{
		System.out.print(array3[row][col]+" ");
	}
	System.out.println();
}


	
	for(int row=0;row < array1.length;row++)
	{
		for(int col=0;col<array2[row].length;col++)
		{
			array3[row][col] = array1[row][col] * array2[row][col];
		}
		//System.out.println("Sum 0f "+row+" row: "+sum);
	}
System.out.println("\nProdut of Elements in two array/\n");
for(int row=0;row < array3.length;row++)
{
	for(int col=0;col<array3[row].length;col++)
	{
		System.out.print(array3[row][col]+" ");
	}
	System.out.println();
}

}
}

