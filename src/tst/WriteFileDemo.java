/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst;

/**
 *
 * @author Doreen Midecha
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {
   public static void main(String[] args) {
      FileOutputStream fos = null;
      File file;
      String mycontent = "This is my Data which needs" +
	     " to be written into the file";
      try {
          //Specify the file path here
	  file = new File("C:\\Users\\Doreen Midecha\\Documents\\NetBeansProjects\\E_Rights\\src\\files\\newfile.txt");
	  fos = new FileOutputStream(file);

          /* This logic will check whether the file
	   * exists or not. If the file is not found
	   * at the specified location it would create
	   * a new file*/
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  /*String content cannot be directly written into
	   * a file. It needs to be converted into bytes
	   */
	  byte[] bytesArray = mycontent.getBytes();

	  fos.write(bytesArray);
	  fos.flush();
	  System.out.println("File Written Successfully");
       } 
       catch (IOException ioe) {
	  ioe.printStackTrace();
       } 
       finally {
	  try {
	     if (fos != null) 
	     {
		 fos.close();
	     }
          } 
	  catch (IOException ioe) {
	     System.out.println("Error in closing the Stream");
	  }
       }
   }
}