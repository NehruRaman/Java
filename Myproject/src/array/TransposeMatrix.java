package array;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransposeMatrix na = new TransposeMatrix();
		na.transpoeMatrix();
	}
	public void transpoeMatrix()
	{
		//create transpose matrix array with 5 row and 5 column
		int array[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25,}};
	
		//create another array matrix to store array1 of a matrix
		int array1[][]= new int [array.length][array[0].length];
		
		//code to insert array1 a matrix
			for(int row=0;row < array.length;row++)
			{
				for(int col=0;col<array[row].length;col++)
				{
				array1[row][col] = array[col][row];
				}
				//System.out.println("Sum 0f "+row+" row: "+sum);
			}
			
		//print transpose matrix
			System.out.println("Transpose Matrix Of Elements to store another array:");	
	for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				System.out.print(array[col][row]+" ");

			
		}
		
		System.out.println();
		}
	}


}
