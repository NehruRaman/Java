package array;

public class MergeTwoAarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {7,3,9,2,3,2,10};
		int [] array1 = {3,1,9,5,6,4,2};
		int [] result = new int[array.length+array1.length];
		
		for(int i =0;i<array.length;i++) {
			result[i]=array[i];
			
		}
		
		int count = 0;
		for(int i =0;i<array1.length;i++) {
			
		boolean flag =false;
			for(int j =0;j< array.length;j++) {
				if(array1[i]== array[j])
				{
					flag=true;
					count++;
					break;
				}
			}
				if(flag==false)
				{
					result[array.length+i-count] = array1[i];
				}
		
			
		}

		for(int i =0;i<result.length-count;i++) {
			System.out.println("result"+i+": "+result[i]);
			
		}
		


	}

}
