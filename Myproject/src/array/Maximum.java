package array;
import java.util.Scanner;
public class Maximum {
	static int [] array;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum na = new Maximum ();
		scanner();
		na.max();
		na.min();
	}
	static int[] scanner() {
		 Scanner na = new Scanner(System.in);
	     System.out.println("enter Size of Array");
	     int size = na.nextInt();  
	      array = new int[size];
	     System.out.println("enter the elements");
	     for(int i = 0;i<array.length;i++) {
	    	 array[i] = na.nextInt();
	    	 
	     }return array;    
	}
   void max() {
	  
	   int max = Integer.MIN_VALUE;
	   for(int i =0;i<array.length;i++) {
		   if(array[i]>max) {
			   max = array[i];
			   
			   }
	   }
	   System.out.println("maximum element in array:"+max);
   }
   void min() {
	   
	   int min = Integer.MAX_VALUE;
	   for(int i =0;i<array.length;i++) {
		   if(array[i] < min) {
			   min = array[i];
			   
			   }
	   }
	   System.out.println("maximum element in array:"+min);
   }
}
