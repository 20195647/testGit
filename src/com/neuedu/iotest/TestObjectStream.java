package com.neuedu.iotest;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("c:/aaa/person.txt");
			
			oos = new ObjectOutputStream(fos);
			
			//定义两个person对象
			Person p1 = new Person("tom",18,"男");
			Person p2 = new Person("mary",20,"女");
			
			//调用ObjectOutputStream的writeObject方法，进行序列化
			oos.writeObject(p1);
			oos.writeObject(p2);
			
			oos.flush();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
