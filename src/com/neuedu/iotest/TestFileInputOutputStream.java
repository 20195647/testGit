package com.neuedu.iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//文件输入
		
		File f1 = new File("d:/io/abc.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(f1);
			//read()方法，读取的是一个字节的内容
//			System.out.println(fis.read());
//			System.out.println((char)fis.read());
//			
			//使用read(byte[] b)方法
			byte b[] = new byte[fis.available()];
			fis.read(b);
			
			for(byte b1:b) {
				System.out.print((char)b1);
			}
			
			fos = new FileOutputStream("d:/io/def.txt",true);
			
			fos.write(b);
			fos.flush();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
