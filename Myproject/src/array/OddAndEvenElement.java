package array;

public class OddAndEvenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  array[]= {1,2,3,4,5};
		
		System.out.println("diplaying original array ");
		for(int i=0;i<array.length;i++)
		{
	    System.out.print(array[i]+" ");
		}
		//last Element copy to temp variable
		System.out.println("\nodd element array ");
		for(int j=0;j<array.length;j++)
		{
		
			if(array[j]%2 == 0)
			{
				 System.out.print(array[j]+" ");
			}
		
			
		}
		System.out.println("\neven element array ");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==1)
			{
				 System.out.print(array[i]+" ");
			} 
	    
		}
		

	}

}
