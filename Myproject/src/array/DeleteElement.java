package array;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner na = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter the Element in Array");
		for(int i =0;i<array.length;i++)
		{
			array[i] = na.nextInt() ;
			
		}
		for(int i =0;i<array.length;i++)
		{
			System.out.println(array[i]);
			
		}
    System.out.println("Enter the Element delete in index");
		
		int location = na.nextInt();
		location = location  - 1;
		for(int i = location;i<array.length-1;i++)
		{
			array[i] = array[i+1] ;
			
		}
		for(int i =0;i<array.length-1;i++)
		{
			System.out.println(array[i]);
		}
		na.close();

	}

}
