package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ArrayListDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayListDemo na = new ArrayListDemo();
		
		System.out.println(na.remove_1st_4_Element());
		
		System.out.println(na.remove_last_4_Element());
		
		        

	}
	public List<Integer>  remove_1st_4_Element()
	{
		   // Creating an ArrayList
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        numbers.add(6);
	        numbers.add(7);
	        numbers.add(8);
	        numbers.add(9);
	        numbers.add(10);
	       
	       System.out.println("ArrayList: " + numbers);

	        // Creating an instance of Iterator
	        ListIterator<Integer> iterate = numbers.listIterator();

	       
	        int count =0;
	        
	        System.out.println("\nThe remove 1St Four Element in list :");  
         
	        while(iterate.hasNext()) {
	        
	           iterate.next();
	           
	           iterate.remove();
	            count++;
	          if(count==4)
	            {
	          
	            break;	
	            	
	            }
          
	           }
	    
	        return numbers;
	}
	public List <Integer> remove_last_4_Element()
	{
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(6);
        numbers1.add(7);
        numbers1.add(8);
        numbers1.add(9);
        numbers1.add(10);
        
   ListIterator<Integer> itr = numbers1.listIterator();
   System.out.println("\nArrayList: " + numbers1);

   while(itr.hasNext()) {
        
      itr.next();
     }
   
   
   int count1=0;
   
System.out.println("\nThe remove last Four Element in list :");  
while(itr.hasPrevious()) {
    
   itr.previous();
   
   itr.remove();
    count1++;
  if(count1==4)
    {
  
    break;	
    	
    }
 
   }

		return numbers1;
		
	}

	}


