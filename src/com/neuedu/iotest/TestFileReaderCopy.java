package com.neuedu.iotest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReaderCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("d:/io/abc.txt");
			
//			System.out.println((char)fr.read());
//			int c;
//			while((c=fr.read())!=-1) {
//				System.out.print((char)c);
//			}
//			
			FileWriter fw = new FileWriter("d:/io/def.txt");
			
			char[] c2 = new char[1024];
			while(fr.read(c2) !=-1) {
				fw.write(c2);
			}
			
			fw.flush();
			
			System.out.println("file copy success");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
