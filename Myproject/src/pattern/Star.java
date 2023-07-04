package pattern;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int  b=5;
		for(int row = 1;row<=7;row++)
		{
			for(int space1 = 3;space1>=row;space1--) {
				System.out.print(" ");	
				
			}for(int col1 = 1;col1<=a;col1++) {
				if(row <= 4)
				{
				System.out.print("*");	
				}
			}
				
			for(int space = 5;space <= row;space++) {
				System.out.print(" ");	
				
			}
			for(int col = 1 ;col <= b ;col++)
			{
				if(row>=5) {
				System.out.print("*");	
			}
			}
			
			
	           	System.out.println();	
	           	if(row<=4) {
				a=a+2;
	           	}
	           	if(row >= 5)
	           	{
				b = b-2;
	           	}
		}

	}

	}

