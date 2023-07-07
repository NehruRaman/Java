package collection;

import java.util.Arrays;

public class ArraysDemo implements Comparable<Object> {

	
	public ArraysDemo(String string) {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int [] a = {70,60,30,40};
              int [] b = {70,60,30,40};
              System.out.println(Arrays.equals(a, b));
              Arrays.sort(b);
              for(int i =0;i<b.length;i++)
              {
              System.out.println(b[i]);
              }
              String names[]  = {"nehru","archana","pranitha","hem"};
             // Arrays.sort(names);
              System.out.println("comparator");
              ComparatorDemo c = new ComparatorDemo();
              Arrays.sort(names, c);
              for(int i =0;i<names.length;i++)
              {
              System.out.println(names[i]);
              }
//              ArraysDemo na1 = new ArraysDemo("nehru");
//              ArraysDemo na2 = new ArraysDemo("archana");
//              ArraysDemo na3 = new ArraysDemo("hem");
//              ArraysDemo na4 = new ArraysDemo("pranitha");
//              ArraysDemo na5 = new ArraysDemo("na");
//              ArraysDemo array[] = {na1,na2,na3,na4,na5};
//              Arrays.sort(array);
//              for(int i =0;i<array.length;i++)
//              {
//              System.out.println(array[i]);
//              }
              
              
//              int i=0;
//              boolean same = true;
//              while(i<a.length)
//              {
//            	  if(a[i]!=b[i])
//            	  {
//                	  same = false;
//            		  System.out.println("not same"); 
//            		  break;
//            	  }
//            	  i++;
//              }
//              if(same==true)
//              {
//            	  System.out.println("both  are  same"); 
//         		 
//              }
              
              
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
