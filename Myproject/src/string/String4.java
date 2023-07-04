package string;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String4 na = new String4();
		Scanner na1 = new Scanner(System.in);
		
		System.out.println("Enter the given sentence ");
		String input = na1.nextLine();
		 na.vowels(input, 0);
	     na.vowelsCounts(input, 0);
	     
		 na1.close();	
	     
		
	
	}
	public  void vowels(String str,int count)
	{
		
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			switch(ch) {
			case 'a': count++;
			           break;
			case 'e': count++;
			           break;
			case 'i': count++;
			 			break;
			case 'o': count++;
			 			break;
			case 'u': count++;
			 			break;
			//default:  System.out.println("does not vowels");
			}
		}
		if(count==0)
		{
			System.out.println("does not vowels");
		}
		else
		{
			System.out.println(" count the number Of vowels: "+count);
		}
		
		
	}
	public  void vowelsCounts(String str,int count)
	{
		int a=0,e=0,i=0,o=0,u=0;
		for(int j =0;j<str.length();j++)
		{
			char ch = str.charAt(j);
		
			switch(ch) {
			case 'a': 	count++;
						a++;
						break;
			case 'e': 	count++;
						 e++;
						break;
			case 'i': 	count++;
						i++;
						break;
			case 'o': 	count++;
						o++;
			 			break;
			case 'u': 	count++;
						u++;
			 			break;
			//default:  System.out.println("does not vowels");
			}
		}
		if(count==0)
		{
			System.out.println("does not vowels");
		}
		else
		{
			System.out.println("a count of vowel: "+a+"\ne count of vowel: "+e+"\ni count of vowel: "+i+"\no count of vowel:"+o+"\nu count of vowel: "+u+"\ntotal count the number Of vowels: "+count);
		}
		
	}
	/*public  void vowelsCount(String str,int count)
	{
		//char a = '';
		for(int i =0;i<str.length();i++)
		{
		char ch = str.charAt(i);
		  for(int j = i+1;j<str.length();j++)
		  {
			 ch = str.charAt(j);
			System.out.println(str.charAt(str.length()-1));
			
			if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				
				count--;
				break;
			}
			
		}
			
		if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				
				count++;
				
			}
		  
		}
		if(count==0)
		{
			System.out.println("does not vowels");
		}
		else
		{
			System.out.println("total count Of vowels: "+count);
		}
		
		}*/

}
