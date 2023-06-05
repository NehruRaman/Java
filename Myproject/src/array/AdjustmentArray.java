package array;
import java.util.Scanner;
public class AdjustmentArray {
	 static int []array;
	 static int key;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjustmentArray na = new AdjustmentArray();
		AdjustmentArray.scanner();
	na.adjust();
	}
	public static void scanner()
	{
	Scanner na = new Scanner(System.in);
	System.out.println("enter size of array");
	int size = na.nextInt();
   
   array = new int[size];
  System.out.println("enter Element of array");
  for(int i=0;i<array.length;i++)
  {
	  array[i] = na.nextInt();
  }
  System.out.println("enter searhing one element");
   key = na.nextInt();
	na.close();
	
	}
	
	public void adjust()
	{
		for(int i=0;i<array.length;i++)
			if(key==array[i])
			{
				if(array[0]!=0 && array[array.length-1]!=0)
				{
					System.out.println( "search element front element"+array[i-1]);
					System.out.println("search back element"+array[i+1]);
			}
				if(key==array[0])
				{
					System.out.println("search back element"+array[i+1]);
			
				}
				if(key==array[array.length-1])
				{
				System.out.println("search back element"+array[i+1]);
		         
				}
	}
	}
}
