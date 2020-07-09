package com.neuedu.iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIo {

	public static void main(String[] args)  {
	    // TODO Auto-generated method stub
	    try {
	      FileInputStream fis = new FileInputStream("d:/io/abab.txt");
	      System.out.println((char)fis.read());
	      
	      byte[] b = new byte[fis.available()];
	      System.out.println(fis.read(b));
	      FileOutputStream fos = new FileOutputStream("d:/io/cdcd.txt",true);
	      fos.write(b);
	      fos.flush();
	    } catch (FileNotFoundException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    } catch (IOException ioe){
	      ioe.printStackTrace();
	    }
	    
	    
	}
}

