package exception_handling;

public class UserDefinedException {
	
	public static void main(String args [])
	{
		UserDefinedException na = new UserDefinedException();
		try
		{
		na.StuRollnoCheck(2000);
		
		}
		catch (StudentException s)
		{
		System.out.println("Exception caught");
		System.out.println(s.getMessage());
		}
		
		try
		{
		
		
		find(new int[] {1413,1785,1998,7738}, 143);
		}
		
		catch(IdValidException i)
		{
		 System.out.println(i);
		}
		
	}
	public void StuRollnoCheck(int id) throws StudentException {
		if(id <= 0 || id >= 1999){
			throw new StudentException("Invalid Employee ID");
			
		}
		System.out.println("Enter Student RollNO"+id);
		
	}
	static void find(int array[], int id) throws IdValidException
	{
	boolean stdFlag = false;
	for (int i = 0; i < array.length; i++) {
	if(id == array[i])
	stdFlag = true;
	}
	if(!stdFlag)
	{
	throw new IdValidException("ID is not Valid!");
	}
	else
	{
	System.out.println("ID is Valid!");
	}
	}

}
