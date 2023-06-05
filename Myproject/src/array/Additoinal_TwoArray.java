package array;

public class Additoinal_TwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [] array = {7,8,9,2,3,2};
		int [] array1 = {3,5,9,5,6};
		int [] result = new int[array.length+array1.length];
		
		for(int i =0;i<array.length;i++) {
			result[i]=array[i];
			
		}
		for(int i =0;i<array1.length;i++) {
			result[i+array.length]=array1[i];
			
		}
		for(int i =0;i<result.length;i++) {
			System.out.println("result"+i+": "+result[i]);
			
		}
		
}
}