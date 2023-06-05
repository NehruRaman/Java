package array;

public class TestQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = {5,1,7,5};
      int array1[] = new int[array.length];
      for(int i = 0;i<array.length;i++)
      {
    	  array1[i]=array[i];
      }
      for(int i = array1.length-1;i>=0;i--)
      {
    	  System.out.println("Revere Order: "+array[i]);
      }
	}

}
