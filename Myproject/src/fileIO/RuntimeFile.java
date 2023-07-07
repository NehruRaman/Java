package fileIO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class RuntimeFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  File f = new File("\\home\\nehru\\Desktop\\Archana");
		  boolean present = f.exists();
	       System.out.println("pls enter msg"+present);
		  if(present  == false)
		  {
			  f.mkdir();
		  }
		  System.out.println("pls enter msg"+present);
		 

	}

}
