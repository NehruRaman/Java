package collection;

import java.util.ArrayList;
import java.util.Scanner;


public class RotationArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RotationArrayList  na = new RotationArrayList();
		ArrayList a = na.scanner();
		
		System.out.println(na.clockwise(a));
		System.out.println(na.anti_clockwise(a));
	}
	public ArrayList<Integer> scanner()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner na = new Scanner(System.in);
		System.out.println("Enter the Elements Size in ArrayList");
		int a = na.nextInt();
		
		System.out.println("\nEnter the input number of Elements in ArrayList");
		
		for(int i=  0;i<a;i++)
		{
			int input = na.nextInt();
			numbers.add(input);
		}
		na.close();
		 System.out.println("*********************************");
		 System.out.println("Rotate  clockwise ArrayList");
		return numbers;
		
	}
	
	public ArrayList<Integer> clockwise(ArrayList<Integer>  numbers)
    
	{
		 int temp =(Integer)numbers.get(0);
		  for(int i=  0;i<numbers.size()-1;i++)
		  {
			 
			 numbers.set(i, numbers.get(i+1));
			 
		  }
		  numbers.set(numbers.size()-1, temp);
		return numbers;
		
	}
	public ArrayList<Integer> anti_clockwise(ArrayList<Integer>  numbers)
    
	{
		 int temp =(Integer)numbers.get(numbers.size()-1);
		 System.out.println("*********************************");
		  for(int i=  numbers.size()-1;i>0;i--)
		  {
			 
			 numbers.set(i, numbers.get(i-1));
			
		  }
		  numbers.set(0, temp);
		  System.out.println("Rotate Anti clockwise ArrayList");
		return numbers;
		
	}
}
