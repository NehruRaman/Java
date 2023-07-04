package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Exception1  na = new  Exception1 ();
		 Scanner na1 = new Scanner(System.in);
		 System.out.println("Enter a values");
		 int a = na1.nextInt();
//		 int b = na1.nextInt();
		 try
		 {
			 int b  = 10/a;
			 System.out.println("Enter b values"+b);
			 try
			 {
				 if(a==1)
				 {
					 a = a/(a-1);
				 }
				 if(a==2)
				 {
					 int []c = {1,2,4};
					 c[5]=45;
				 }
			 }
			 catch(ArrayIndexOutOfBoundsException e)
			 {
				 System.out.println("ArrayIndexOutOfBoundsException occured"); 
			 }
		 }
		 catch(ArithmeticException  e)
		 {
			 System.out.println("ArithmeticException occured"); 
		 }
		 
//		System.out.println(na.divide(a,b));
		 
		
		 
	}

	/*private int divide(int a, int b) {
		// TODO Auto-generated method stub
		 try
		 {
			 return  a/b;
			
		 }
		 finally
		 {
			 System.out.println("i am finally"); 
		 }
		
		
	}*/

}
