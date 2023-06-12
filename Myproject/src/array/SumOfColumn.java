package array;

public class SumOfColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfColumn na = new SumOfColumn();
		na.sumOfElements();
		

	}
	public void sumOfElements()
	{
		// array declaration and initialization 5row and 5column
		int array[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25,}};
	    	
			for(int row=0;row < array.length;row++)
			{
				int sum = 0;
				for(int col=0;col<array[row].length;col++)
				{
					//sum of column in 2D array
					sum = sum+array[col][row];
				}
				System.out.println("Sum 0f "+row+" column: "+sum);
			}
			
		}
			
		}



