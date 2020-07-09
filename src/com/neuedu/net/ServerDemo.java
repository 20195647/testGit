package com.neuedu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * 	服务器
 * 	1.建立serversocket
 * 	ss = new ServerSocket(xxxx)
 * 	2.接受客户端请求
 * 	Scoket s = ss.accept();
 * 	3.通过socket和客户端通讯
 * 	接收客户端发送的新消息
 * 	in = new BufferedReader(
 * 	new InputStreamReader(s.getInputStream()));
 */
public class ServerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("####服务器####");
		ServerSocket ss = null;
		Socket s = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner sc = null;
		try {
			ss = new ServerSocket(8888);

			s = ss.accept();

			System.out.println("[客户端地址]:" + s.getInetAddress().getHostAddress());
			System.out.println("[客户端端口号]：" + s.getPort());

			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String clientStr = in.readLine();
			System.out.println("[客户端发送来的消息]:" + clientStr);

			// 服务器接收到数据后，向客户端发送消息
			sc = new Scanner(System.in);
			System.out.println("[服务器输入数据，向客户端发送]");
			String serverStr = sc.nextLine();
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			out.write(serverStr);
			out.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (ss != null) {
					ss.close();
				}
				if (s != null) {
					s.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
