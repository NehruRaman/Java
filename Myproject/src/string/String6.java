package string;

import java.util.Scanner;

public class String6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String6 na = new String6();
		Scanner na1 = new Scanner(System.in);
		
		System.out.println("Enter the given sentence of String ");
		String input = na1.nextLine();
		na.reversString(input);
		na.polindromeString(input);
		
		na1.close();
		

	}
	public void reversString(String words)
	{
		 System.out.print("Print the given reverse of String:  ");
		for(int i = words.length()-1; i>=0;i--)
		{
	
			 System.out.print(words.charAt(i));
		 
		}
	}
	public void polindromeString(String str)
	{
		String newstr = "";
		
		for(int i = str.length()-1; i>=0;i--)
		{
	
			 newstr = newstr+(str.charAt(i));
		 
		}
		 
		if(str.equals(newstr))
		{
			System.out.print("\nthis is polindrome ");	
		}
		else
		{
			System.out.print("\nits does  not polindrome");
		}
	}

}
