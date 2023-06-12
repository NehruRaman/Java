package array;

import java.util.Scanner;

public class JaggedArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		JaggedArray1 na = new JaggedArray1();
		int array[][] = na.scanner();
		na.jaggedArray(array);
	}

	public int [][] scanner() {
		// Create Scanner object to get user input

		Scanner na = new Scanner(System.in);

		// user to enter size of row array
		System.out.println("Enter Row Size of Array");
		int size = na.nextInt();

		// declare the jagged array
		int array[][] = new int[size][];

		// loop through each array to allocate memory and get user input for each
		// element
		for (int i = 0; i < array.length; i++) {

			System.out.println((i + 1) + "st row Enter Size Of column:");
			// user to enter the size of column array
			array[i] = new int[na.nextInt()];

			// loop through each element to allocate memory and get user input for each
			// element
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Enter the Element Of column values at Index:" + j + "in array row" + (i + 1));
				// user to enter the element of column array
				array[i][j] = na.nextInt();
			}

		}
		na.close();
		return array;
	}
	
	public void jaggedArray(int array[][])
	{
		
        // print the jagged array
		
		/*int a = 1;
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {

				array[row][col] = a++;

			}
		}*/
		System.out.println("jagged array is:");
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {

				System.out.print(array[row][col]+" ");

			}
			System.out.println();
		}
		
	}
}
