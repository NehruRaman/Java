package array;
import java.util.Scanner;
public class TwoDimension2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimension2 na = new TwoDimension2();
		int array[][]=scanner();
		na.twoDimension2(array);

	}
	public static int[][] scanner()
	{ 
		Scanner na = new Scanner(System.in);
		
		System.out.println("Enter your row size of array ");
		int rowsize = na.nextInt();
		System.out.println("Enter your row size of array ");
		int colsize = na.nextInt();
		
		//System.out.println("Enter your Element of array ");
		int array[][]= new int[rowsize][colsize];
		for(int row=0;row<array.length;row++)
		{
			System.out.println("Enter your Element of array row :"+row);
		  for(int col=0;col<array[row].length;col++)
		  {
			array[row][col]= na.nextInt();  
		  }
		}
	na.close();
	return  array;
	}
	public void twoDimension2(int array[][])
	{

		
	
	for(int row=0;row<array.length;row++)
	{
		for(int col=0;col<array[row].length;col++)
		{
			array[row][col]=array[row][col];
		
		
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
