package neusoftpractice;

import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

//		File f1 = new File("c:/aaa/a.txt");
//		if (f1.exists()) {
//			f1.delete();
//		} else {
//			try {
//				f1.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("[文件名]:" + f1.getName());
//		System.out.println("[路径]:" + f1.getPath());
//		System.out.println("[可读性]:" + f1.canRead());
//		System.out.println("[可写性]:" + f1.canWrite());
//		System.out.println("[大小]:" + f1.length());
//		
//		Path path = Paths.get("c:/aaa/a.txt");
//		
//		System.out.println("[文件节点数]:"+path.getNameCount());
//		System.out.println("[文件名称]:"+path.getFileName());
//		System.out.println("[文件根目录]:"+path.getRoot());

		File f2 = new File("c:/aaa/b.txt");
		
		try {
			FileInputStream fis = new FileInputStream(f2);
			byte[] b = new byte[fis.available()];
			fis.read(b);
			
			for(byte bb :b) {
				System.out.print((char)bb);
				FileOutputStream fos = new FileOutputStream("c:/aaa/c.txt");
				fos.write(b);
				fos.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		FileReader fr = new FileReader("c:/aaa/c.txt");
		int temp;
		FileWriter fw = new FileWriter("c:/aaa/d.txt");
		while((temp=fr.read())!=-1) {
			fw.write(temp);
			System.out.print((char)temp);
			}
		fw.flush();
		in.close();
	}

}