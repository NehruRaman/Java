package array;

import java.util.Scanner;

public class DoubleRotation {
	static int array[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleRotation n = new DoubleRotation();
            array = DoubleRotation.scanner();
		n.rotation();

	}

	static int[] scanner() {
			 Scanner na = new Scanner(System.in);
		     System.out.println("enter Size of Array 2 and above");
		     int size = na.nextInt();  
		      array = new int[size];
		     System.out.println("enter the elements");
		  
		     for(int i = 0;i<array.length;i++) 
		     {
		    	 
		    	 array[i] = na.nextInt();
		    	 
		     }
		     
	
		     na.close();
		     return array;
	}
		     public void rotation()
		     {
		    	//array =  DoubleRotation.scanner();
		    	int temp  = array[0];
		 		int temp1 =array[1];
		 		int i=0;
		 		System.out.println("First 2 Element Rotation Last Positon in Array");
		 		for(;i<array.length-2;i++)
		 		{
		 			array[i]=array[i+2];
		 			//System.out.println(array[i]);
		 		}
		 		//System.out.println(temp);
		 		array[i]=temp;
		 		array[i+1]=temp1;
		 		for(int j=0;j<array.length;j++) {
		 			
		 		System.out.println(array[j]);

		 			}
		     }

}
