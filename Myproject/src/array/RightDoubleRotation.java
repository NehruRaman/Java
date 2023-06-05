package array;

public class RightDoubleRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[]= {10,20,30,40,50};
			int temp;
			System.out.println("diplaying original array ");
			for(int i=0;i<array.length;i++)
			{
		    System.out.print(array[i]+" ");
			}
			//last Element copy to temp variable
			temp=array[array.length-1];
			int temp1 = array[array.length-2];
			for(int j=array.length-1;j>1;j--)
			{
			
				array[j]= array[j-2];
				
			}
		//last element copy to a[0]	 array zero index
	
		
		array[0] = temp1;
		array[1] = temp;
		 System.out.println("\nRight rotatin array");
		for(int i=0;i<array.length;i++)
		{
	    System.out.print(array[i]+" ");
		}

		
	}

}
