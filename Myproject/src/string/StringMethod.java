package string;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	          	String str1 = "raman";
				String str2 = "nehru";
				String str3 = "raman";
				System.out.println(str1.equals(str2));  //false				
				System.out.println(str1.equals(str3));	//true				  
		  		System.out.println(str2.equals(str3));	//false				  
				System.out.println("raman".equals("RAMAN"));//false			   
				System.out.println("raman".equalsIgnoreCase("RAMAN"));	//true  

				System.out.println(str1.compareTo(str2)); 	//4			
				System.out.println(str1.compareTo(str3));	//0			
				System.out.println(str2.compareTo(str1));	//-4			  
				System.out.println("nehru".compareTo("nehur"));	//-3		 
				System.out.println("nehru".compareTo("NEHRU"));	//32		 
				System.out.println("nehru".compareToIgnoreCase("NEHRU"));//0

				System.out.println("ram".compareTo("ramnehru")); //-5
				System.out.println("nehruram".compareTo("nehru")); //3
				
				String str4 = "raman nehru";
				System.out.println(str4.startsWith("ra"));//true
				System.out.println(str4.startsWith("raman"));//true
				System.out.println(str4.startsWith("a"));//false
				System.out.println(str4.startsWith("a",1));//offset values  true
				System.out.println(str4.startsWith("n",6));//true
				System.out.println(str4.startsWith("a" ,0));//false
				
				String str5 = "raman nehru";
				System.out.println(str5.endsWith("u"));//true
				System.out.println(str5.endsWith("nehru"));//true
				System.out.println(str5.endsWith("a"));//false
				
				String str6 = "raman nehru";
				System.out.println(str6.replace('r','a'));//aaman nehau
				System.out.println(str6.replace("nehru","kasturi"));//nehru kasturi
				System.out.println(str6.replaceFirst("raman","archana"));//archana nehru
				System.out.println(str6.replaceFirst("r","A"));//Aaman nehru
				String str7 = "raman nehru raman";
				System.out.println(str7.replaceAll("raman","archana"));//archana nehru archana
				System.out.println(str7.replaceAll("ra","Bad"));//Badman nehru Badman
				
				String name="i love mom and dad";  
				System.out.println(name.contains("i love"));//true
				System.out.println(name.contains("mom"));  //true
				System.out.println(name.contains("dad")); //true
				System.out.println(name.contains("im not  in love"));//false
				
				String name1="nehru";
				 String myStr = "nehru";
				    System.out.println(myStr.contentEquals("nehru"));//true
				    System.out.println(myStr.contentEquals("e"));//false
				    System.out.println(myStr.contentEquals("hru"));//false
				    System.out.println(myStr.contentEquals(name1));//true
				    
				    
				   
				  
			}
}
