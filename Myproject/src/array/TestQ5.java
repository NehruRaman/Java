package array;

public class TestQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = {2,3,4,5,6,8,9};
		int array1[] = {3,5,8,10,15};
		for(int i = 0;i<array.length;i++)
		{
		for(int j = 0;j<array1.length;j++)
		{
			if(array[i] == array1[j])
			{
				System.out.println("subset elements is:"+array1[j]);
				break;
			
			}
		}

	}

}
}
