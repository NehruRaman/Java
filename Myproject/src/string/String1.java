package string;

import java.util.Objects;

public class String1 {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		String1 other = (String1) obj;
		return number == other.number;
	}

	@Override
	public String toString() {
		return "String1 []";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*byte[] b = {65,66,67,68,69,70};
		String str5 = new String(b);
		System.out.println(str5);
		String str6 = new String(b,2,3);//2,2 starts 2 end 2
		System.out.println(str6);	
		String str4 = new String(b,2,2);		// 2,2  starts from 2 take the 2 chracters 
		System.out.println(str4);*/
		String str1 = "Nehru";
		String str2 = "Archana";
		String str3 = "hai"; 
		
		//String1 na1 = new String1(); 
		
//			System.out.println(na1==na);  	
		
//			System.out.println(na.equals(na1));  
			
		
//		System.out.println("u class hashcde"+na.hashCode());  
//		System.out.println(" hashcde"+na1.hashCode());
//		System.out.println("Sys");
               
        System.out.println("String hashcde"+str1.hashCode());  
//		System.out.println("String hashcde"+str3.hashCode());
//		System.out.println("String hashcde"+str2.hashCode());
		
		System.out.println(str1 == str2);  
		System.out.println(str1 == str3);  	
		System.out.println(str2 == str3);
		System.out.println(str1 == str2);  			
		System.out.println("equal");  	
		System.out.println("*****");
		

		String s1 = new String("ratan");
		String s2 = new String("durga");
		String s3 = new String("hai");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
	}

}
