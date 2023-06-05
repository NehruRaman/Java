package array;
import java.util.Scanner;
public class DuplicateElement {
   public static int array[];
    public static int insert;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DuplicateElement na = new  DuplicateElement();
		insert();
       na.duplicatArray();
       na.duplicateElement();
	}
	public static int []sizeofarray() {
		Scanner na = new Scanner(System.in);
	System.out.println("enter the size Of array");
      int size = na.nextInt();
      array = new int[size];
      return  array;
	}
	public static void insert()
	{
		Scanner na = new Scanner(System.in);
		System.out.println("enter the size Of array");
	      int size = na.nextInt();
	      array = new int[size];
	      System.out.println("enter the size Of array");   
	for(int i = 0;i < array.length;i++) {
		array[i] =na.nextInt();
		
	}
	for(int i=0;i<array.length;i++) {
		System.out.println("Array Elements is:"+array[i]);

		}
	System.out.println();
	}
	public void duplicatArray() {
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]==array[j]) {
				System.out.println("duplicate element found");
				break;
			}
		}
	}
	System.out.println();
	}
	
	public void duplicateElement() {
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j]) {
					System.out.println("duplicate element is:"+array[i]);
					break;
				}
			}
		}
	}
		
}
