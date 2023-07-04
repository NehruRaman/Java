package collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReplacelinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplacelinkedList na = new ReplacelinkedList();
		System.out.println(na.replace());
		System.out.println(na.hasnext());
		System.out.println(na.hasPrevious());

	}
	public LinkedList<Integer> replace()
{
	LinkedList<Integer> numbers = new LinkedList<Integer>();
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
    System.out.println("LinkedList: " + numbers);
    ListIterator<Integer> iterate = numbers.listIterator();
    while(iterate.hasNext())
    {
    
    	if(iterate.next()%2!=0)
    	{
    		iterate.set(99);
    	}
    	
    }
	return numbers;
    
}
	public LinkedList<Integer> hasnext()
	{
		LinkedList<Integer> numbers = new LinkedList<Integer>();
	    numbers.add(1);
	    numbers.add(2);
	    numbers.add(3);
	    numbers.add(4);
	    numbers.add(5);
	    numbers.add(2);
	    numbers.add(7);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(10);
	    System.out.println("LinkedList: " + numbers);
	    ListIterator<Integer> iterate = numbers.listIterator();
	    while(iterate.hasNext())
	    {
	    
	    	if(iterate.next()==2)
	    	{
	    		iterate.add(999);
	    	}
	    	
	    }
		return numbers;
	}  

	public LinkedList<Integer> hasPrevious()
	{
		LinkedList<Integer> numbers = new LinkedList<Integer>();
	    numbers.add(1);
	    numbers.add(2);
	    numbers.add(3);
	    numbers.add(4);
	    numbers.add(5);
	    numbers.add(2);
	    numbers.add(7);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(10);
	    System.out.println("LinkedList: " + numbers);
	    ListIterator<Integer> iterate = numbers.listIterator();
	    while(iterate.hasNext())
	    {
	    
	    	iterate.next();
	    	
	    }
	    while(iterate.hasPrevious())
	    {
	    
	    	if(iterate.previous()==2)
	    	{
	    		iterate.add(888);
	    	}
	    	
	    }
		return numbers;
	}  

}
