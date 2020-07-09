package com.neuedu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 	客户端
 * 	1.通过socket和服务器建立连接
 * 	s = new Socket("xx.xx.xx.xx",xxxx);
 * 	2.向服务器发送消息
 * 	out = new PrintWriter(
 * 	new OutputStreamWriter(s.getOutputStream()));
 */
public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("####客户端####");
		Socket s = null;
		PrintWriter out = null;
		Scanner sc = null;
		BufferedReader in = null;
		
		try {
			s = new Socket("127.0.0.1", 8888);

			System.out.println("[服务器地址]:" + s.getInetAddress().getHostAddress());
			System.out.println("[服务器端口号]:" + s.getPort());
			System.out.println("[客户端输入数据，向服务器发送]");
			sc = new Scanner(System.in);

			String clientStr = sc.nextLine();
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			out.println(clientStr);
			out.flush();
//			out.write(clientStr);下接↓;println不需要			
//			s.shutdownOutput();
			
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String serverStr = in.readLine();
			System.out.println("[服务器端发送来的消息]:" + serverStr);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (sc != null) {
					sc.close();
				}
				if (out != null) {
					out.close();
				}
				if (s != null) {
					s.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
