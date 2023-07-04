package collection;

import java.util.Comparator;

public class ComparatorDemo implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String)o1;
		String s2 = (String)o2;
		/*if( s1.length()> s2.length()) {
			 return -1;
		 }
    	 else if(  s1.length()< s2.length()) {
			 return 1;
		 }
		 else */
			 return s1.compareTo(s2);//only ascending order
/*		 int result = s1.compareTo(s2);
		 if( result > 0) {
			 return -1;
		 }
		 else if( result < 0) {
			 return 1;
		 }
		 else 
//			 return 0;
*/		 
	}

}
