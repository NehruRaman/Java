package array;


public class TransposeMatrixSameArray {
  static int array[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransposeMatrixSameArray na = new TransposeMatrixSameArray();
		na.transpoeMatrix();

	}
		
	public void transpoeMatrix()
	{
		//create transpose matrix array with three row
		int array[][]= {{1,2,3},{6,7,8},{11,12,13}};
	   // three column
		
			//code to transpose a matrix store to same array
			for(int row=0;row < array.length;row++)
			{
				for(int col=0;col<array[row].length;col++)
				{
				int temp = array[row][col];
				array[row][col]=array[col][row];
				array[col][row]=temp;
				}
				//System.out.println("Sum 0f "+row+" row: "+sum);
			}
			
		//print transpose matrix
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
