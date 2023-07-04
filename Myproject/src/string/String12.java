package string;

public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String12 na = new String12();
		String letter = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String number = "0123456789";
		na.upperCase(letter);
		String letter1 = letter.toLowerCase();
        na.lowerCase(letter1);
        na.number(number);
	}
	
	public void upperCase (String letter)
	
	{
		System.out.println("alphabetical to uppercae of ASCII Values\n");
		for(int i =0;i<letter.length();i++)
		{
			int ascii = letter.charAt(i);
			System.out.println(letter.charAt(i)+"  ASCII Values is :"+ascii+"\n");
		}
	}
public void lowerCase (String letter)
	
	{
	System.out.println("alphabetical to lowercase of ASCII Values\n");
		for(int i =0;i<letter.length();i++)
		{
			int ascii = letter.charAt(i);
			System.out.println(letter.charAt(i)+"  ASCII Values is :"+ascii+"\n");
		}
	}
public void number (String number)

{
System.out.println("Number 0 to 9 of ASCII Values\n");
	for(int i =0;i<number.length();i++)
	{
		int ascii = number.charAt(i);
		
		System.out.println(number.charAt(i)+"  ASCII Values is :"+ascii);
		//ascii=ascii-ascii;
	}
}

}
