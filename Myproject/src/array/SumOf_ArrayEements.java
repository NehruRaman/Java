package array;

public class SumOf_ArrayEements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOf_ArrayEements na = new SumOf_ArrayEements();
		na.SumOf2Element();
		na.SumOf3Element();
		na.SumOf_ConsecutiveElement();
	}
	public void SumOf2Element()

	{
		int array[]= {3,5,2,2,5,2};
		int input =10;
		int sum=0;
		int count=1;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				sum=array[i]+array[j];
				if(sum == input)
				{
				System.out.println("Sum Of Two Element\n"+array[i]+" + "+array[j]+" = "+sum);
			     count++;
					
				}
			}
				
		}
		if(count == 1)
		{
		System.out.println("not present sum of two Element in array");
		}
		
		}
	
	public void SumOf3Element()
{
	int array[]= {3,2,2,2,5,2};
	int input =10;
	int sum=0;
	int count=1;
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length-1;j++)
		{
			sum=array[i]+array[j]+array[j+1];
			if(sum == input)
			{
			System.out.println("Sum Of three Element\n"+array[i]+" + "+array[j]+" + "+array[j+1]+" = "+sum);
		     count++;
		     break;
				
			}
		}
			
	}
	if(count == 1)
	{
	System.out.println("not present sum of two Element in array");
	}
	
	}
	public void SumOf_ConsecutiveElement()

	{
		int array[]= {10,5,8,25,5,35};
		int input =10;
		int sum=0;
		int count=1;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				sum=array[i]+array[j];
				if(sum == input)
				{
				System.out.println("Sum Of Consecutive Element\n"+array[i]+" + "+array[j]+" = "+sum);
			     count++;
					
				}
			}
				
		}
		if(count == 1)
		{
		System.out.println("not present sum of Consecutive Element in array");
		}
		
		}
	
}
