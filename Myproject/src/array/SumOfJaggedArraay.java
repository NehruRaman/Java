package array;



public class SumOfJaggedArraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfJaggedArraay na = new SumOfJaggedArraay();
		na.jaggedArray();
	}

public void jaggedArray() {

		// print the jagged array
	
	       //create jagged array with three row
			int array[][]= {{1,2,3},{6,7},{1}};
		   
			
			//create another jagged array1 with three row
			int array1[][]= {{4,2,3},{3,1},{8}};
			
			
			int array3[][] = new int[array.length][]; 
			array3[0] = new int[3]; 
			array3[1] = new int[2];	
			array3[2] = new int[1];  
		   
//			System.out.println("Enter 1st Row Column Size of Array");
//			array[0] = new int [na.nextInt()];
//			System.out.println("Enter 2st Row Column Size of Array");
//			array[1] = new int [na.nextInt()];
//			System.out.println("Enter 3st Row Column Size of Array");
//			array[2] = new int [na.nextInt()];
		
		  for (int row = 0; row < array.length; row++) {
		  
		  for (int col = 0; col < array[row].length; col++) {
		  
		  array3[row][col] = array[row][col] + array1[row][col] ;
		  
		  } 
		 }
		// print the jagged array
			
		System.out.println("sunm of jagged array is:");
		for (int row = 0; row < array3.length; row++) {

			for (int col = 0; col < array3[row].length; col++) {

				System.out.print(array3[row][col]+" ");

			}
			System.out.println();
		}

	}

}
