package fileIO;
import java.io.File;
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;
public class Fileio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File f = new File("/home/nehru/java.txt");
       System.out.println(f.getName());
       System.out.println(f.getPath());
       System.out.println(f.length());
       System.out.println(f.canWrite());
       System.out.println(f.canRead());
    
      f.createNewFile();
      System.out.println(f.isFile());
      System.out.println(f.length());
      String s = "i love archana ";
     // String s1 = "i love  archana en ammu ";
      
      FileOutputStream fos = new FileOutputStream(f);
      byte [] b = s.getBytes();
      fos.write(b);
      fos.close();
      FileInputStream fin=new FileInputStream(f);
      int s1 = fin.read();
      System.out.println((char)s1);
      int s2 = fin.read();
      System.out.println((char)s2);
      int s3 = fin.read();
      System.out.println((char)s3);
	}
	}


