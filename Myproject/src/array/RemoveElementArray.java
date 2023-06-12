package array;

public class RemoveElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElementArray na = new RemoveElementArray ();
		na.remove_Element();
		na.remove_index();
	}
	public void remove_Element()
	{
		int array[] = {10,20,3,30,40,50};
		
		System.out.println("Original array is: ");
		for(int i=0;i<array.length;i++)
    	{
    		System.out.print(array[i]+" ");
    	}
		int array1[]= new int[array.length-1];
        int remove = 3;
        int count = 0;
        for(int i=0;i<array.length;i++)
		{
        	if(array[i]!=remove)
        	{
        		array1[count]=array[i];
        		count++;
        	}
        
		}
	
        System.out.print("\n\nRemove Element is: "+remove +"\n");
	
        for(int i=0;i<array1.length;i++)
    	{
    		System.out.print(array1[i]+" ");
    	}

	}
	
	public void remove_index()
	{
		int array[] = {10,20,3,30,40,50};
		
		int array1[]= new int[array.length-1];
        int remove = 4;
        int count = 0;
        for(int i=0;i<array.length;i++)
		{
        	if(i!=remove)
        	{
        		array1[count]=array[i];
        		count++;
        	}
        
		}
	
        System.out.print("\n\nRemove index is:"+remove+" values:"+array[remove]+"\n");
	
        for(int i=0;i<array1.length;i++)
    	{
    		System.out.print(array1[i]+" ");
    	}

	}
	

}
