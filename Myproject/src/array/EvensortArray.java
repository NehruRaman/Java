package array;

import java.util.Scanner;

public class EvensortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner na = new Scanner(System.in);
		int array[] = new int[4];
		System.out.println("Enter the Element in Array");
		for(int i =0;i<array.length;i++)
		{
			array[i] = na.nextInt() ;
			
		}
		int count=0;
		for(int i =0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
			count++;	
			}
			
		}
		for(int i =0;i<array.length;i++)
		{
		
		for(int j =i+1;i<array.length;j++)
		{
			if(array[i] > array[j])
			{
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			
		}
	
        }
		int array1[]=  new int[count];
		int arr=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				array1[arr++]=array[i];
			}
		}
		
		for(int i =0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
	}

}
