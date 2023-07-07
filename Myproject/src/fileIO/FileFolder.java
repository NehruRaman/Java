package fileIO;
import java.io.File;
import java.io.IOException;

public class FileFolder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* File f1 = new File("/home/nehru/Desktop/Nehru/"); 
		 boolean n = f1.exists();
		 System.out.println("pls enter msg"+n);
		 if(n==false)
		 {
			 f1.mkdirs();
		 }
		 
		 
		 System.out.println("pls enter msg"+n);*/
		
		/* File f1 = new File("/home/nehru/Desktop/Nehru/Nehru.txt"); 
		 boolean n = f1.exists();
		 if(n==false)
		 {
			 try {
				boolean create = f1.createNewFile();
				System.out.println("pls enter msg"+create);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }*/
		
		/*File f1 = new File("/home/nehru/Desktop/Nehru/Nehru.txt"); 
		f1.delete(); 
		boolean n = f1.exists();
		 System.out.println("pls enter msg"+n);
		File f1 = new File("/home/nehru/Desktop/Nehru/Nehru.txt");
		f1.createNewFile();
	File rename = new File("/home/nehru/Desktop/Nehru/NehruArchana.txt");
	
	boolean rena = f1.renameTo(rename);
	 System.out.println("pls enter msg"+rena);
	 System.out.println("pls enter msg"+rename.getName());
	 System.out.println("pls enter msg"+f1.canExecute());
	 System.out.println("pls enter msg"+f1.canRead());
	 System.out.println("pls enter msg"+f1.canWrite());
		
		File f1 = new File("/home/nehru/Desktop");
		String [] folderList = f1.list();
		for(String s:folderList)
		{
			 System.out.println(s);
		}*/
		File f1 = new File("/home/nehru/Desktop");
		File[] fileFolderlist = f1.listFiles();
		for(File s:fileFolderlist)
		{
			 System.out.println(s);
		}
		
	}

}
