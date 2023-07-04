package exception_handling;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowDemo  na = new ThrowDemo ();
		ThrowDemo ta ;
		try
		{
		na.test();
		}
		catch(NullPointerException e)
		{
			System.out.println("i love nehru");
		}

	}

	private void test() {
		// TODO Auto-generated method stub
		try
		{
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
		System.out.println("i love archuma");
		throw e;
		}
		
	}

}
