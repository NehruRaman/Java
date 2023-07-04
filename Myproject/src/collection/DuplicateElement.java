package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  System.out.println("\n"+DuplicateElement.DuplicateElemnts());
		  System.out.println("\n"+DuplicateElement.DuplicateElemnts1());

	}
	public static List <String>DuplicateElemnts()
	{
		  List<String> names = new ArrayList<String>();
		  names.add("nehru");
		  names.add("raman");
		  names.add("mahi");
		  names.add("tami");
		  names.add("nehru");
		  names.add("kasturi");
		  names.add("nehru");
		  System.out.println("ArrayList: " + names);
		  
		  ArrayList<String> names1 = new ArrayList<String>();
		  for(String str:names)
		  {
			  if(!names1.contains(str)) {
				  names1.add(str);
			  }
		  }
		  return names1;
		
	}
	public static List <String>DuplicateElemnts1()
	{
		  ArrayList<String> names = new ArrayList<String>();
		  names.add("nehru");
		  names.add("raman");
		  names.add("mahi");
		  names.add("tami");
		  names.add("nehru");
		  names.add("kasturi");
		  names.add("nehru");
		  System.out.println("\nArrayList: " + names);
		  
		  String nul = null;
		  
		 
		  for(int i=  0;i<names.size()-1;i++)
		  {
			  for(int j= i+1;j<names.size();j++)
			  {
				 if(names.get(i)==names.get(j))
				 {
                  names.set(i, nul);
			  }
		  }
			  
		  }
     ListIterator<String> itr = names.listIterator();
		  
		  while (itr.hasNext()){
		       
		        if( itr.next() == nul)
		        {
		        	itr.remove();
		        }

		    
		  }
		  return names;

		  }
}
		  
