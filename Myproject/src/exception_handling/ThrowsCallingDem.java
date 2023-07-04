package exception_handling;

public class ThrowsCallingDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	ThrowsDemo.divide(5, 0);
        }
        catch(ArithmeticException e)
        {
        	System.out.println("ArithmeticException occured"); 
        }
	}

}
