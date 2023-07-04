package string;

public class FirstRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstRepeated na = new FirstRepeated();
		na.firstRepeated();
		na.firstnonRepeated();

	}
	public void firstRepeated()
	{
		String s = "india is my country";
		
		for(int i =0;i<s.length();i++)
		{
			boolean flag = false;
			for(int j =i+1;j<s.length();j++)
		
		{
			if(s.charAt(i) == s.charAt(j) && s.charAt(j)!=' ')
			{
				
				flag = true;
				break;
			}
			
		}
			if(flag == true)
			{
			
			System.out.println("index: "+i+" First Repeated Element:"+s.charAt(i));
			break;
			}
	 }
	}
	public void firstnonRepeated()
	{
		String s = "aasse";
		
		for(int i =0;i<s.length();i++)
		{
			int count=0;
			for(int j =0;j<s.length();j++)
		
		{
			if(s.charAt(i) == s.charAt(j) && s.charAt(j)!=' ')
			{
			
			
				count++;
				
			}
			
		}
			if(count == 1)
			{
			System.out.println("index: "+i+"  Non Repeated Element: "+s.charAt(i));
			 
			}
	 }
	}
}
