package array;

import java.util.Scanner;

public class BinarySearch {

	static int array[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch na = new BinarySearch();
		int array[]= na.sort();
		na.binary_Search(array);
		
	}
	
	public int[] sort()
	{
	   int array[] = {5,6,7,4,10,15,9};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j]) {
					
					int temp = array[i];
					array[i] =array[j];
				   array[j] = temp;
				}
			}
		}
	System.out.println("bubble sorting array");
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");
	}

	return array;
	}
	
	public void binary_Search(int array[])
	{
		Scanner na = new Scanner(System.in);
		System.out.print(" \nEnter your search for above number is : ");
		
		
    int input = na.nextInt();
	int low = 0;
	int high= array.length-1;
	for(;low <= high;)
	{
		int mid = (low + high)/2;
         if(array[mid] == input)
			{
				System.out.println("\n your search number is present:"+array[mid]);
				break;
			}
			else if(array[mid] < input )
			{
				low = mid + 1;
			}
			else if(array[mid] >  input)
			{
				high = mid -1;
			}
         na.close();
	}
	
	if(low > high)
	{
		System.out.print("not match element in array");
	}
	
	}
	}


