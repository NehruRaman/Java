package pattern;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2 na = new Pattern2();
		na.pattern();

	}
	public void pattern ()
	{
		int i=0,n = 4;
		for(int row=1;row<=n;row++)
		{
			for(int spac=3;spac>=row;spac--)
			{
		
				System.out.print("");
			}
				
		
		for(int col=1;col<=n;col++)
		{

			
			if(row%2==0)
			{
				i--;
			System.out.print(i);
			
			}
			else
			{
				i++;
				System.out.print(i);
				
			}
		}
		
		/*for(int sp=2;sp<=row;sp++)
		{
			System.out.print(" ");
		}*/
		System.out.println();
		i=i+n;
		//System.out.print(i);
	}
	}

}
