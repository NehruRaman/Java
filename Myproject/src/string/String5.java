package string;
import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String5 na = new String5();
		Scanner na1 = new Scanner(System.in);
		
		System.out.println("Enter the given sentence of word and add any numbers ");
		String input = na1.nextLine();
		na.presentNumber(input);
		
	
		na1.close();
		

	}
	public void presentNumber(String words)
	{
		 System.out.print("print the numbers present in the given string:  ");
		for(int i = 0; i<words.length();i++)
		{
		 char ch = words.charAt(i);
		 if(ch>=48 && ch<=57)
		 {
			// int number = ch;
			 System.out.print(ch);
		 }
		}
	}
	
	


}
