package string;

public class LexicographicalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LexicographicalString  na = new LexicographicalString ();
		na.asendingOrder();

	}
	public void asendingOrder()
	{
		
		String array[] = {"apple","orange","banana","mango","guava","blueberry","blackberry"};
		
		System.out.println("before original String array is:\n");
		
		for(int i =0;i<array.length;i++)
		{
		System.out.print(array[i]+" ");
	
		}
		for(int i =0; i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
			if(array[i].compareTo(array[j])>0)
				{
				String temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
				}
			}
		}
		System.out.println("\n\nafter ascending order String array is:\n");
		for(int i =0;i<array.length;i++)
		{
		System.out.print(array[i]+" ");
	
		}
}
}
