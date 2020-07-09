package com.neuedu.iotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
	//复制文件
public class BufferedRW {
	public static void main(String args[]) {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			FileReader fr = new FileReader("d:/io/abc.txt");
			br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("d:/io/def.txt");
			bw = new BufferedWriter(fw);
            
			String str;
			while ((str = br.readLine()) != null) {
				bw.write(str);
				 bw.newLine();
			}
			bw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		} finally {

			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("文件复制成功");
	}

}
