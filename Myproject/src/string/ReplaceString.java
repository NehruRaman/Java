package string;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceString na = new ReplaceString();
		na.replace();

	}
	public void replace()
	{
		String str = " latest versin of java is java 19 ";
		String replace = str.replace("a", "i");
		System.out.println("Replace char"+replace+"\n");
		String replacestr = str.replace("19", "20"); 
		System.out.println("Replace String: "+replacestr+"\n");
		String replaceAll = str.replaceAll("java", "python");
		System.out.println("Replace All: "+replaceAll+"\n");
		
		String replaceFirst = str.replaceFirst("java", "python");
		System.out.println("Replace First"+replaceFirst);
		
	}

}
