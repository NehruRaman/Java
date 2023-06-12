package array;

public class SumOf1stRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOf1stRow na = new SumOf1stRow();
		na.sumOfElements();
	}
	public void sumOfElements()
	{
		int array[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25,}};
	    	
			for(int row=0;row < array.length;row++)
			{
				int sum = 0;
				for(int col=0;col<array[row].length;col++)
				{
					sum = sum+array[row][col];
				}
				System.out.println("Sum 0f "+row+" row: "+sum);
			}
			
		}

}
