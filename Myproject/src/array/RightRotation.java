package array;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int a[]= {10,20,30,40,50};
		int temp;
		System.out.println("diplaying original array ");
		for(int i=0;i<a.length;i++)
		{
	    System.out.print(a[i]+" ");
		}
		//last Element copy to temp variable
		temp=a[a.length-1];
		for(int j=a.length-1;j>0;j--)
		{
		
			a[j]= a[j-1];
			
		}
		//last element copy to a[0]	 array zero index
		a[0] = temp;
		 System.out.println("\nRight rotatin array");
		for(int i=0;i<a.length;i++)
		{
	    System.out.print(a[i]+" ");
		}

		
	}
}