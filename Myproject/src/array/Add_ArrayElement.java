package array;

public class Add_ArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_ArrayElement na = new Add_ArrayElement();
		na.Add_Element();

	}
	public void Add_Element()
	{
		int array[] = {10,20,40,50};
		
		System.out.println("Original array is: ");
		for(int i=0;i<array.length;i++)
    	{
    		System.out.print(array[i]+" ");
    	}
		int array1[]= new int[array.length+1];
        int add = 30;
        int index = 2;
        int count = 0;
        for(int i=0;i<array1.length;i++)
		{
        	if(i == index)
        	{
        		array1[i]=add;
       
        	}
        	if(i!=index)
        	{
        		array1[i]=array[count];
        		count++;
        	}
        
		}
	
        System.out.print("\n\nAdd Element is: "+add +"\n");
	
        for(int i=0;i<array1.length;i++)
    	{
    		System.out.print(array1[i]+" ");
    	}

	}
}
