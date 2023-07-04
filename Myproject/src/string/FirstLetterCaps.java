package string;

import java.util.Scanner;

public class FirstLetterCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLetterCaps na = new FirstLetterCaps();
		Scanner na1 = new Scanner(System.in);
		System.out.println("Enter the given sentence of string ");
		String input1 = na1.nextLine(); 
		
		na.first_UpperCase(input1);
		na1.close();
	}
	public void first_UpperCase(String str)
	{
		str = " "+str;
		String newstr = "";
		
		for(int i = 0; i<str.length();)
		{
	
		if((int) str.charAt(i)== 32)
		{
		  int ch = (str.charAt(i+1)-32);
		  newstr = newstr+" "+(char)ch;
		  i=i+2;
		}
		else
		{
			newstr = newstr+str.charAt(i);
			i++;
		}
		}
		System.out.print("print the given firt letter caps of String: "+newstr);
		
	}
}
