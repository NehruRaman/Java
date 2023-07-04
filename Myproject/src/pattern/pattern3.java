package pattern;

public class pattern3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		pattern3 na  = new pattern3();
		na.pattern1();
		na.pattern2();
	}
	public void pattern1()
	{
	int a = 1;
	for(int row = 1;row<=5;row++)
	{
		for(int col = 1 ;col <= 5 ;col++)
		{
			System.out.print(a);	
			//a = a+2;
			a++;
		}
		System.out.println();
		//a = a-8;
		a = a-4;
		//System.out.println(a);
	}
  }
	public void pattern2()
	{
		System.out.println("\n\n");

	for(int row = 1;row<=5;row++)
	{
		for(int col = 1 ;col <= 5 ;col++)
		{
			if(col%2==0)
			{
			System.out.print("1");
		}
		else
		{
			System.out.print("0");	
		
		}
		}
		System.out.println();
		
	
  }
	
}
}
