package array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JaggedArray na = new JaggedArray();
		scanner();
	}
	static void scanner() {
		// Create Scanner object to get user input
		Scanner na = new Scanner(System.in);
		
		//user to enter size of row array
		System.out.println("Enter Row Size of Array");
		int size1 = na.nextInt();
		
		//user set the number of column for each row 
		int array[][] = new int[size1][];
		System.out.println("Enter 1st Row Column Size of Array");
		array[0] = new int [na.nextInt()];
		System.out.println("Enter 2st Row Column Size of Array");
		array[1] = new int [na.nextInt()];
		System.out.println("Enter 3st Row Column Size of Array");
		array[2] = new int [na.nextInt()];
	
		//fill array value with values start
	  
	   int a=1;
	  for(int row =0;row<array.length;row++)
	   {

	for (int col = 0; col < array[row].length; col++) {

		array[row][col]=a++;

	}
	   }
	  
	  //print jagged array 
	  
	  System.out.println("jagged array is:");
	  for(int row =0;row<array.length;row++)
	   {

	for (int col = 0; col < array[row].length; col++) {

		System.out.print(array[row][col]);

	}
	System.out.println();
	   }
	na.close();
	}
}
