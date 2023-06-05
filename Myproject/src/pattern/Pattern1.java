package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 na = new Pattern1();
		na.pattern();
	}
	public void pattern ()
	{
		for(int row =1;row<=5;row++) {
			
	
				for(int col =1;col<= 5;col++) {
					if(col==1||col==5||row==1||row==5)
					{
						System.out.print("* ");
					}
			
					else
					{
						System.out.print("  ");
					}
				}
					System.out.println(" ");
			}
	}
	}

