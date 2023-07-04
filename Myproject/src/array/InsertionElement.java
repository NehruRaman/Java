package array;
import java.util.Scanner;
public class InsertionElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner na = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter the Element in Array");
		for(int i =0;i<array.length-1;i++)
		{
			array[i] = na.nextInt() ;
			
		}
		for(int i =0;i<array.length;i++)
		{
			System.out.println(array[i]);
			
		}
		System.out.println("Enter the Element insert in index");
		
		int location = na.nextInt();

		System.out.println("Enter the insert Element in Array");
		int value = na.nextInt();
		for(int i =array.length-1;i>location-1;i--)
		{
			array[i] = array[i-1] ;
			
		}
		array[location] = value;
		for(int i =0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		na.close();
	}

}
