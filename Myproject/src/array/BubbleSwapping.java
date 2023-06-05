package array;

public class BubbleSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2,1,4,-1,5};
		System.out.println("diplaying original array ");
		for(int i=0;i<array.length;i++)
		{
	    System.out.print(array[i]+" ");
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp = array[j];
				     array[j]=array[i];
					 array[i] = temp;
				}
				
			}
		}
		System.out.println("\nascending order is:");
		for(int i=0;i<array.length;i++)
		{
			
			System.out.print(array[i]+" ");
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					int temp = array[j];
				     array[j]=array[i];
					 array[i] = temp;
				}
				
			}
		}
		System.out.println("\ndecending order is:");
			for(int i=0;i<array.length;i++)
			{
				
				System.out.print(array[i]+" ");
			}
		}

	
	

}
