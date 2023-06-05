package array;
import java.util.Scanner;
public class Maxsec {
  
	   
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Maxsec na = new Maxsec ();
			na.max();
			na.min();
		}
		static int[] scanner() {
			 Scanner na = new Scanner(System.in);
		     System.out.println("enter Size of Array");
		     int size = na.nextInt();  
		     int [] array = new int[size];
		     System.out.println("enter the elements");
		     for(int i = 0;i<array.length;i++) {
		    	 array[i] = na.nextInt();
		    	 
		     }return array;
		}
	   void max() {
		   int array[] = scanner();
		   int max = Integer.MIN_VALUE;
		   int msec = 0;
		   for(int i =0;i<array.length;i++) {
			   if(array[i] > max) {
				   msec =max;
				   max = array[i];
				   
				   }
			   if(max!=array[i] && msec<array[i])
			   {
				 msec = array[i];  
			   }
		   }
		   System.out.println("maximum element in array:"+msec);
	   }
	   void min() {
		   int array[] = scanner();
		   int min = Integer.MAX_VALUE;
		   int smin = 0;
		   for(int i =0;i<array.length;i++) {
			   if(array[i] < min) {
				   smin = min;
				   min = array[i];
				   
				   }
			   if(min != array[i] && smin > array[i])
			   {
				   smin = array[i];
			   }
		   }
		   System.out.println("maximum element in array:"+smin);
	   }
	}
