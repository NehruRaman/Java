package array;

//import java.util.Scanner;

public class SingleDigitArray {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDigitArray na = new SingleDigitArray();
		
		//SingleDigitArray.scanner();
		na.single_DigitArray();

	}
	/*static void scanner() {
		 Scanner na = new Scanner(System.in);
	     System.out.println("enter Size of Array");
	     int size = na.nextInt();  
	      array = new int[size];
	     System.out.println("enter the elements");
	     for(int i = 0;i<array.length;i++) {
	    	 array[i] = na.nextInt();
	    	 
	     }
	     na.close();

}*/
	public void single_DigitArray()
	{
		int array[]= {40,20,34,543,35};
		int sum=0;
		int count=0;
		for(int i = 0;i<array.length;i++)
		{
			 int num = array[i];
			while(num>0)
			{
			int digit = num%10;
			sum = sum+digit;
			num= num/10;
			
			if(num == 0 && digit<=9)
			{
				array[i] = digit;
	             digit--;	
	            //System.out.printl();
			}
			
			}
			//System.out.println(array[i]); 
			//System.out.println(array[i]);
		}
	System.out.println("Sigle Digit Become Another Array");
	for(int i = 0;i<single.length;i++)
	{
		System.out.print(single[i]+" ");
	}
	}

	



	}

