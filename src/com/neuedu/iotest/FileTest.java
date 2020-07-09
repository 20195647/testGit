package com.neuedu.iotest;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建�?个File对象
		File f1 = new File("d:/io/abc.txt");
		
		if(f1.exists()) {
			f1.delete();
			System.out.println("文件被删除了");
		} else {
		
			try {
				//createNewFile()创建�?个新的文�?
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("文件名： "+f1.getName());
			System.out.println("文件路径： "+f1.getPath());
			System.out.println("文件绝对路径： "+f1.getAbsolutePath());
			System.out.println("文件canread方法： "+f1.canRead());
			System.out.println("文件canwrite： "+f1.canWrite());
		}

	}

}
