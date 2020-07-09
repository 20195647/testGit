package com.neuedu.iotest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestNIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("d:/io/p1/p2");
		System.out.println("文件节点:" + path.getNameCount());
		System.out.println("文件名称:" + path.getFileName());
		System.out.println("文件根目:" + path.getRoot());
		System.out.println("文件上级关联目录:" + path.getParent());
		
		try {
			Files.copy(Paths.get("d:/io/abc.txt"), Paths.get("d:/io/p1/p2/file1.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		


	}

}
