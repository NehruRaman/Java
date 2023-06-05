package array;

import java.util.Scanner;

public class Prime_Array {
          static int array[];
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_Array na = new Prime_Array();
		scanner();
		na.prime_Array();


	}
	
	static void scanner() {
		 Scanner na = new Scanner(System.in);
	     System.out.println("enter Size of Array");
	     int size = na.nextInt();  
	      array = new int[size];
	     System.out.println("enter the elements");
	     for(int i = 0;i<array.length;i++) {
	    	 array[i] = na.nextInt();
	    	 
	     }
	     na.close();

}
	public void prime_Array()
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			boolean flag=false;
			for(int j=2;j<array[i];j++) {
				if(array[i]%j == 0)
				{
					flag=true;
				
					break;
				}
				
			}
			if(flag==false)
			{
		
			count++;
				
				//System.out.println(array[i]);
			}
		}
	
	    int count1=0;
		int prime[] = new int[count];
		System.out.println("Displaying prime numbers is:\n");
		for(int i=0;i<array.length;i++)
		{
			boolean flag=false;
			for(int j=2;j<array[i];j++) {
				if(array[i]%j == 0)
				{
					flag=true;
					break;
				}
				
			}
			if(flag == false)
			{
				
			prime[count1]=array[i];
			 count1++;
			 
			 System.out.print(array[i]+" ");
			}
		}
		System.out.println("\nprime number of array\n");
		for(int i =0;i<prime.length;i++)
		{
			System.out.print(prime[i]+" ");
		}
		}
	}
