package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList  al = new  ArrayList ();
      // System.out.println(al.size());
       al.add(50);
       al.add(20);
       al.add(30);
       al.add(40);
       al.add(50);
       System.out.println(al);
       al.add(100);
       al.add("nehru");
       al.add("archana");
      /* System.out.println(al.add(20));
       System.out.println(al);
       System.out.println(al.size());*/
       al.add(8, "hem");
      /* System.out.println(al.contains("archana"));
       System.out.println(al.get(7));
       System.out.println(al);
       System.out.println(al.remove(5));
       System.out.println(al.set(4, "abcd"));
       System.out.println(al.indexOf("archana"));*/
       //System.out.println(al);
       ArrayList  al1 = new  ArrayList ();
       al1.addAll(al);
      // System.out.println(al1);
       ArrayList  al2 = new  ArrayList ();
       al2.add("hydrabad");
       al2.add("chennai");
       al2.add("mumbai");
       al2.add("kolkata");
       al2.add("chennai");
      // System.out.println(al2);
       al2.addAll(1, al);
      // System.out.println(al2);
      List al3 = al2.subList(7, 10);
       System.out.println(al3);
       al2.removeAll(al);
       System.out.println(al2);
       System.out.println(al2.indexOf("chennai")); 
       System.out.println(al2.lastIndexOf("chennai"));
       }

}
